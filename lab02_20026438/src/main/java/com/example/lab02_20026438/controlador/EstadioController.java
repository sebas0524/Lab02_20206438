package com.example.lab02_20026438.controlador;

import com.example.lab02_20026438.entidad.Estadio;
import com.example.lab02_20026438.entidad.Jugador;
import com.example.lab02_20026438.repositorio.EstadioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class EstadioController {

    final EstadioRepository estadioRepository;
    public EstadioController(EstadioRepository estadioRepository){
        this.estadioRepository=estadioRepository;
    }

    @GetMapping("/estadio")
    public String listaEstadios(Model model){
        model.addAttribute("lista",estadioRepository.findAll());
        return "estadio/list";
    }
    @PostMapping("/seleccion/guardar")
    public String guardarEstadio(Estadio estadio) {
        estadioRepository.save(estadio);
        return "redirect:/estadio";

    }
    @GetMapping("/estadio/nuevo")
    public String nuevoEstadio(){
        return "estadio/newForm";
    }
    @GetMapping("/estadio/borrar")
    public String borrarEstadio(@RequestParam("id") int id){
        Optional<Estadio> optional = estadioRepository.findById(id);
        if(optional.isPresent()){
            estadioRepository.deleteById(id);
        }
        return "redirect:/estadio";
    }
}
