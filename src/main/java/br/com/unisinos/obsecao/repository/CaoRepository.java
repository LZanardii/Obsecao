package br.com.unisinos.obsecao.repository;

import br.com.unisinos.obsecao.model.CaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaoRepository extends JpaRepository<CaoModel, Integer> {
}
