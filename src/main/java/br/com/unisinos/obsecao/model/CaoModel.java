package br.com.unisinos.obsecao.model;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Cao")
public class CaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private OngModel ong;

    private String nome;

    private int idade;

    private String porte;

    private String descricao;



}
