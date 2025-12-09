package br.com.senai.lastdance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.lastdance.models.Usuario;
import br.com.senai.lastdance.services.UsuarioService;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/usuario")
public class UsuarioController { 
    
    @Autowired
    public UsuarioService usuarioService;



    @PostMapping("/cadastrar")
    public Usuario salvar(@RequestBody Usuario usuario, String confSenha) {
        return usuarioService.salvar(usuario, confSenha);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(email, senha);
    }
    
}
