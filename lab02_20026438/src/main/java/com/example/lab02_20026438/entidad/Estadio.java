package com.example.lab02_20026438.entidad;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEugador",nullable = false)
    private Integer idestadio;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="provincia",nullable = false)
    private String provincia;
    private String club;
}
