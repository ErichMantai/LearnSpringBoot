/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learnspringboot.repository;

import com.learnspringboot.model.Teste;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erichmantai
 */
@Repository
public interface TesteRepository extends JpaRepository<Teste, Long>{
    
}
