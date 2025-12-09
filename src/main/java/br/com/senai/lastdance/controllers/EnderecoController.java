package br.com.senai.lastdance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.lastdance.models.Endereco;
import br.com.senai.lastdance.services.EnderecoService;
import org.springframework.web.bind.annotation.Requestbody;


@RestController
@RequestMapping("/cliente")
public class EnderecoController {
    
    @Autowired
    public EnderecoService enderecoService;

        @GetMapping("/listar")
    public List<Endereco> listar() {
    return enderecoService.listar();
    }


        @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }
}
