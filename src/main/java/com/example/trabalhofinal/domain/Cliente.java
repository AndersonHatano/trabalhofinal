package com.example.trabalhofinal.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Cliente{

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
}
