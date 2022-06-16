package br.com.unisinos.obsecao.controller;

import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;
import br.com.unisinos.obsecao.service.AnuncioCaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/anuncios")
public class AnuncioCaoController {

    @Autowired
    AnuncioCaoService anuncioCaoService;

    @GetMapping()
    public List<AnuncioCaoDto> getAllAnuncios(){
        return anuncioCaoService.getAllAnuncios();
    }
}
