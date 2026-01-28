package com.murilo.sistemajava.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilo.sistemajava.model.Usuario;

@RestController
@RequestMapping("/usuarios")

public class UsuarioController {

    @PostMapping
    
    public String criarUsuario(@RequestBody Usuario usuario) {

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

        return "Usuário criado com sucesso!"; 
    }
}
