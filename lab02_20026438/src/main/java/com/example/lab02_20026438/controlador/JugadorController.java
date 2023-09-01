package com.example.lab02_20026438.controlador;

import com.example.lab02_20026438.entidad.Jugador;
import com.example.lab02_20026438.repositorio.JugadorRepository;
import com.example.lab02_20026438.repositorio.SeleccionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;
    final SeleccionRepository seleccionRepository;
    public JugadorController(JugadorRepository jugadorRepository,SeleccionRepository seleccionRepository){
        this.jugadorRepository=jugadorRepository;
        this.seleccionRepository=seleccionRepository;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "Agradecido con el de arriba";
    }
    @GetMapping("/jugador")
    public String listaJugadores(Model model){
        model.addAttribute("lista",jugadorRepository.findAll());
        return "jugador/list";
    }
    @PostMapping("/jugador/guardar")
    public String guardarJugador(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/jugador";

    }
    @GetMapping("/jugador/nuevo")
    public String nuevoJugador(Model model){
        model.addAttribute("lista",seleccionRepository.findAll());
        return "jugador/newForm";
    }
    @GetMapping("/jugador/borrar")
    public String borrarJugador(@RequestParam("id") int id){
        Optional<Jugador> optional = jugadorRepository.findById(id);
        if(optional.isPresent()){
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador";
    }
}
