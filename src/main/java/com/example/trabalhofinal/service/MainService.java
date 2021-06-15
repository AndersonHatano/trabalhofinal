package com.example.trabalhofinal.service;

import com.example.trabalhofinal.repository.ClienteRepository;
import com.example.trabalhofinal.repository.ContaCorrenteRepository;
import com.example.trabalhofinal.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    ContaCorrenteRepository contaCorrenteRepository;

    @Autowired
    ClienteRepository clienteRepository;

    public Boolean register(Cliente cliente){

        clienteRepository.save(cliente);

        return true;
    }

    public Iterable<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
