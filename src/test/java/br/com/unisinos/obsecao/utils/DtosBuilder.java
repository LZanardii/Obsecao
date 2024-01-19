package br.com.unisinos.obsecao.utils;

import br.com.unisinos.obsecao.model.*;
import br.com.unisinos.obsecao.model.dto.AnuncioCaoDto;

import java.util.ArrayList;
import java.util.List;

public class DtosBuilder {


  public static CaoModel buildCaoModel() {
    return new CaoModel(
            new OngModel("Ong Do Leo", new EnderecoModel("Araucarias", "Canoas", "118", "92310790"),
                    new GestorModel("05046035076", List.of(), "Leonardo Zanardi", "leo_zanardi", "5199999999", "leo_za@gmail.com", new EnderecoModel("Araucarias", "Canoas", "118", "92310790"), false)),
            "Faísca e Fagulha",
            2, "P",
            "Cão muito dócil e feliz");

  }

  public static AnuncioCaoModel buildAnuncioCaoModel() {
    return new AnuncioCaoModel(buildCaoModel(), false);
  }

  public AnuncioCaoDto buildAnuncioCaoDto() {
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

  public List<AnuncioCaoDto> listAnuncioCaoDto() {
    List<AnuncioCaoDto> anuncios = new ArrayList();
    for (int i = 0; i < 4; i += 1)
      anuncios.add(buildAnuncioCaoDto());

    return new ArrayList<>(anuncios);
  }

}
