package com.projeto.udemy.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.udemy.entity.Automovel;

public interface IAutomovelDAO extends JpaRepository<Automovel,Integer> {

	
	public void salvar(Automovel automovel);
	

	
	
}
