package br.com.jsa.gestaoFinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Parcela extends JpaRepository<Parcela, Integer>{

}
