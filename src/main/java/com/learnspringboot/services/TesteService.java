/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learnspringboot.services;

import com.learnspringboot.model.Teste;
import com.learnspringboot.repository.TesteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author erichmantai
 */
@Service
public class TesteService {
    
    @Autowired
    private TesteRepository repository;
    
    public List<Teste> todos() {
        return repository.findAll();
    }
    
}
