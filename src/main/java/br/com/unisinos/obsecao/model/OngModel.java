package br.com.unisinos.obsecao.model;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Ong")
public class OngModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @OneToOne
    private EnderecoModel endereco;

    @OneToOne
    private GestorModel idGestor;


}
