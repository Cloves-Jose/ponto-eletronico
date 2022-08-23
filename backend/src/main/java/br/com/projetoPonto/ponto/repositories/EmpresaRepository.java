package br.com.projetoPonto.ponto.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projetoPonto.ponto.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
