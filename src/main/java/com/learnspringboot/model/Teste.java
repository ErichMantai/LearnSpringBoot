/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learnspringboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author erichmantai
 */
@Entity
public class Teste {

    @Id
    private Long id;
    private String nome;
    private int idade;

    public Teste() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
