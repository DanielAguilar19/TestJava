package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.usuarios;

public interface usuarioRepository extends JpaRepository<usuarios, String>{
    
}
