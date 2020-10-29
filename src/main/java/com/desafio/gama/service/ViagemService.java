package com.desafio.gama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.gama.repository.ViagemRepository;


@Service
public class ViagemService {

	@Autowired
	private ViagemRepository viagemRepository;

	}
