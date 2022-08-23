package br.com.projetoPonto.ponto.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoPonto.ponto.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	@Transactional
	Empresa findByCnpj(String cnpj);
}
