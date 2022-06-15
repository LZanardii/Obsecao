package br.com.unisinos.obsecao.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String rua;

    @NonNull
    private String cidade;

    @NonNull
    private String logradouro;

    @NonNull
    private String cep;
}
