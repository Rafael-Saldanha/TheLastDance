package br.com.senai.lastdance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.lastdance.models.Endereco;
import br.com.senai.lastdance.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    public EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return enderecoRepository.findAll();
    }

}
