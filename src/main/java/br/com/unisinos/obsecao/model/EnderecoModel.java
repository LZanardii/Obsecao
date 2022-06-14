package br.com.unisinos.obsecao.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rua;

    private String cidade;

    private String logradouro;

    private String cep;
}
