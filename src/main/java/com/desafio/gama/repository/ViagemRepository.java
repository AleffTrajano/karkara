package com.desafio.gama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.gama.domain.Usuario;
import com.desafio.gama.domain.Viagem;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long> {

	
}
