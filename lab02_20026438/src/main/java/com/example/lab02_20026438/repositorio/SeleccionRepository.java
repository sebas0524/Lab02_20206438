package com.example.lab02_20026438.repositorio;

import com.example.lab02_20026438.entidad.Jugador;
import com.example.lab02_20026438.entidad.Seleccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeleccionRepository extends JpaRepository<Seleccion,Integer> {
}
