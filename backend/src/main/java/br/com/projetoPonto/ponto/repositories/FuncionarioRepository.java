package br.com.projetoPonto.ponto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoPonto.ponto.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
	
	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
}
