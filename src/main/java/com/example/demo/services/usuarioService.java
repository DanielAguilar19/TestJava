package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.usuarios;
import com.example.demo.repositories.usuarioRepository;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository repoUsuario;


    public usuarios crearUsuario(String codigoUsuario, String nombre, String apellido, String correo, String telefono, String departamento){
        usuarios nvoUsuario = new usuarios();
        nvoUsuario.setCodigoUsuario(codigoUsuario);
        nvoUsuario.setNombre(nombre);
        nvoUsuario.setApellido(apellido);
        nvoUsuario.setCorreo(correo);
        nvoUsuario.setDepartamento(departamento);
        nvoUsuario.setTelefono(telefono);

        return this.repoUsuario.save(nvoUsuario);
    }

    public String eliminarUsuario(String codigoUsuario){
        if (this.repoUsuario.existsById(codigoUsuario)) {
            this.repoUsuario.deleteById(codigoUsuario);
            return "Se ha eliminado el usuario";
        }
        return "No se encontró el usuario";
    }
}
