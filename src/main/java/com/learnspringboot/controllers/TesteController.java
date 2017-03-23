package com.learnspringboot.controllers;
import com.learnspringboot.model.Teste;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erichmantai
 */
@RestController
@RequestMapping(value = "/pessoa")
public class TesteController {
    
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public Teste getNome() {
        Teste teste = new Teste();
        teste.setNome("ErichMantai");
        teste.setIdade(20);
        return teste;
    }
}
