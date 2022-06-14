package br.com.unisinos.obsecao.repository;

import br.com.unisinos.obsecao.model.OngModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<OngModel, Integer> {
}
