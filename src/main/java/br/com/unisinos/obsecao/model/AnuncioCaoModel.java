package br.com.unisinos.obsecao.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "AnuncioCao")
public class AnuncioCaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @OneToOne
    private CaoModel idCao;

    @NonNull
    private boolean adotado;
}