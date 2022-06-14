package br.com.unisinos.obsecao.repository;

import br.com.unisinos.obsecao.model.GestorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestorRepository extends JpaRepository<GestorModel, String> {
}
