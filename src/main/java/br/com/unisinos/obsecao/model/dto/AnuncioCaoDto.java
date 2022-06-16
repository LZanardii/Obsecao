package br.com.unisinos.obsecao.model.dto;

import br.com.unisinos.obsecao.model.EnderecoModel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AnuncioCaoDto {

    private String nome;
    private int idade;
    private String porte;
    private String descricao;
    private String nomeOng;
    private EnderecoModel enderecoOng;
    private boolean adotado;
}
