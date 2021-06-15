package com.example.trabalhofinal.repository;

import com.example.trabalhofinal.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
