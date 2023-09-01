package com.example.lab02_20026438.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="seleccion")
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSeleccion",nullable = false)
    private Integer idseleccion;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String tecnico;
    @Column(name="estadios_idEstadios",nullable = false)
    private int isestadio;
}
