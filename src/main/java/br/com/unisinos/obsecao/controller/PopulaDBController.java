package br.com.unisinos.obsecao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/popula-db")
public class PopulaDBController {

    @GetMapping()
    public String populateDatabase(){

        return "[ DB POPULADO COM SUCESSO ]";
    }
}
