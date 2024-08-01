package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.usuarios;
import com.example.demo.services.usuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/valeria/usuarios")
public class usuarioController {

    @Autowired
    private usuarioService servicioUsuario;

    @PostMapping("/crear/usuario")
    public usuarios creUsuario(@RequestParam String codigoUsuario,
                               @RequestParam String nombre, 
                               @RequestParam String apellido, 
                               @RequestParam String correo, 
                               @RequestParam String telefono, 
                               @RequestParam String departamento) {
        return this.servicioUsuario.crearUsuario(codigoUsuario ,nombre, apellido, correo, telefono, departamento);
    }
    

    @DeleteMapping("/eliminar/usuario")
    public String eliminarUsuario(@RequestParam String codigoUsuario){
        return this.servicioUsuario.eliminarUsuario(codigoUsuario);
    }
}
