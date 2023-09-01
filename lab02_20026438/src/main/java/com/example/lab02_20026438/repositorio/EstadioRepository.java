package com.example.lab02_20026438.repositorio;


import com.example.lab02_20026438.entidad.Estadio;
import com.example.lab02_20026438.entidad.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<Estadio,Integer> {
}
