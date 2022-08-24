package br.com.projetoPonto.ponto.services;

import java.util.Optional;

import br.com.projetoPonto.ponto.entity.Empresa;

public interface EmpresaService {
	
	/***
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/***
	 * Cadastrar uma nova empresa na base de dados
	 * 
	 * @Param empresa
	 * @Return Empresa
	 */
	Empresa persistir(Empresa empresa);

}
