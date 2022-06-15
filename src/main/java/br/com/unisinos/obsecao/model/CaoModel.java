package br.com.unisinos.obsecao.model;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Cao")
public class CaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @OneToOne
    private OngModel ong;

    @NonNull
    private String nome;

    @NonNull
    private int idade;

    @NonNull
    private String porte;

    @NonNull
    private String descricao;
}
