package br.com.unisinos.obsecao.repository;

import br.com.unisinos.obsecao.model.AnuncioCaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuncioCaoRepository extends JpaRepository<AnuncioCaoModel, Integer> {
}
