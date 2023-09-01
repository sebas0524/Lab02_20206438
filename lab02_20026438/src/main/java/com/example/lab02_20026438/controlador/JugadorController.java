package com.example.lab02_20026438.controlador;

import com.example.lab02_20026438.entidad.Jugador;
import com.example.lab02_20026438.repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class JugadorController {

    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository){
        this.jugadorRepository=jugadorRepository;
    }


    @GetMapping("/jugador")
    public String listaJugadores(Model model){
        model.addAttribute("lista",jugadorRepository.findAll());
        return "jugador/list";
    }
    @PostMapping("/guardar")
    public String guardarJugador(Jugador jugador) {
        jugadorRepository.save(jugador);
        return "redirect:/jugador/list";

    }
    @GetMapping("/jugador/nuevo")
    public String nuevoJugador(){
        return "jugador/newForm";
    }
    @GetMapping("/borrar")
    public String borrarJugador(@RequestParam("id") int id){
        Optional<Jugador> optional = jugadorRepository.findById(id);
        if(optional.isPresent()){
            jugadorRepository.deleteById(id);
        }
        return "redirect:/jugador/list";
    }
}
