package br.com.unisinos.obsecao.controller;

import br.com.unisinos.obsecao.service.PopulaDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/popula-db")
public class PopulaDBController {

    @Autowired
    PopulaDBService populaDBService;

    @GetMapping()
    public String populateDatabase(){
        populaDBService.populaBanco();
        return "[ DB POPULADO COM SUCESSO ]";
    }
}
