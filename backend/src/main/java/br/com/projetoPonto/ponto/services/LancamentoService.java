package br.com.projetoPonto.ponto.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import br.com.projetoPonto.ponto.entity.Lancamento;

public interface LancamentoService {
	
	/***
	 * Retorna uma lista paginada de lancamentos de um determinado funcionário
	 * 
	 * @param funcioniarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 */
	Page<Lancamento> buscarPorFuncioniarioId(Long funcionarioId, PageRequest pageRequest);
	
	/**
	 * Retorna um lançamento por ID
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 */
	Optional<Lancamento> buscarPorId(Long id);
	
	/**
	 * Persistir um lançamento na base de dados.
	 * 
	 * @param lancamento
	 * @return lancamento
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/**
	 * Remove um lancamento da base de dados.
	 * 
	 * @param id
	 */
	void remover(Long id);
}
