package com.example.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="usuarios")
public class usuarios {

    @Id
    @Column(name="codigousuario")
    private String codigoUsuario;

    private String nombre;
    private String apellido;
    private String departamento;
    private String correo;
    private String telefono;

}