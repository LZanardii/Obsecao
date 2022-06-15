package br.com.unisinos.obsecao.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Gestor")
public class GestorModel {

    @Id
    private String cpf;

    @OneToMany
    private List<OngModel> ongs;

    private String nomeCompleto;

    private String nomeUsuario;

    private String telefone;

    private String email;

    @OneToOne
    private EnderecoModel endereco;

    private boolean voluntario;
}