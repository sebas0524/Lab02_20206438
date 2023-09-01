package com.example.lab02_20026438.entidad;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter
@Setter
@Table(name="jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idjugador",nullable = false)
    private Integer idjugador;
    @Column(name="edad",nullable = false)
    private int edad;
    @Column(name="posicion",nullable = false)
    private String posicion;
    @Column(name="snidseleccion",nullable = false)
    private int idseleccion;
    @Column(name="club",nullable = false)
    private String club;
    private String nombre;

}
