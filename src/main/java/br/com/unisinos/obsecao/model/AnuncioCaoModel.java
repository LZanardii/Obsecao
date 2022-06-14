package br.com.unisinos.obsecao.model;

import javax.persistence.*;


@Entity
@Table(name = "AnuncioCao")
public class AnuncioCaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private CaoModel idCao;

    private boolean adotado;


}
