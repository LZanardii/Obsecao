package br.com.unisinos.obsecao.model;

import lombok.*;

import javax.persistence.Id;

import javax.persistence.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Ong")
public class OngModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String nome;

    @NonNull
    @OneToOne
    private EnderecoModel endereco;

    @NonNull
    @OneToOne
    private GestorModel idGestor;
}