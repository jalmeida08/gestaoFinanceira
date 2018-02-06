package br.com.jsa.gestaoFinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.gestaoFinanceira.model.Parcela;

@Repository
public interface ParcelaRepository extends JpaRepository<Parcela, Integer>{

}
