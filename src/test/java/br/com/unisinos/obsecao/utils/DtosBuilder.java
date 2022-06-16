package br.com.unisinos.obsecao.utils;

import br.com.unisinos.obsecao.model.EnderecoModel;
import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;

import java.util.ArrayList;
import java.util.List;

public class DtosBuilder {

    public AnuncioCaoDto buildAnuncioCaoDto(){
        return AnuncioCaoDto.builder()
                        .nome("Pedro")
                        .idade(19)
                        .porte("G")
                        .descricao("Cão dócil")
                        .nomeOng("Ong de teste")
                        .enderecoOng(new EnderecoModel())
                        .adotado(false)
                        .build();
    }

    public List<AnuncioCaoDto> listAnuncioCaoDto(){
        List<AnuncioCaoDto> anuncios = new ArrayList();
        for (int i = 0; i < 4; i += 1)
            anuncios.add(buildAnuncioCaoDto());

        return new ArrayList<>(anuncios);
    }

}
