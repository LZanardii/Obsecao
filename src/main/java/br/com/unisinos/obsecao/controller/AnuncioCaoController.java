package br.com.unisinos.obsecao.controller;

import br.com.unisinos.obsecao.model.EnderecoModel;
import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/anuncios")
public class AnuncioCaoController {

    @GetMapping()
    public List<AnuncioCaoDto> getAllAnuncios(){
        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep("92310715");
        enderecoModel.setCidade("Canoas");
        List list = new ArrayList<>();

        list.add(new AnuncioCaoDto("Beto", 2, "G", "Cão muito calmo", "Ong do Leo", enderecoModel, false));
        list.add(new AnuncioCaoDto("Bruno", 3, "M", "Cão muito agressivo", "Ong do Igor", enderecoModel, false));
        list.add(new AnuncioCaoDto("Faísca", 42, "P", "Cão muito fedido", "Ong do Pedro", enderecoModel, false));

        return list;
    }
}
