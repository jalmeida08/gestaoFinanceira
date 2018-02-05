package br.com.jsa.gestaoFinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.gestaoFinanceira.model.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Integer>{

}
