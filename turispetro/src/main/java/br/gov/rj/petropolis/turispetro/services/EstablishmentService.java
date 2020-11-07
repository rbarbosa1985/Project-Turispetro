package br.gov.rj.petropolis.turispetro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rj.petropolis.turispetro.model.Establishment;
import br.gov.rj.petropolis.turispetro.repositories.EstablishmentRepository;

@Service
public class EstablishmentService {
	@Autowired
	EstablishmentRepository repository;
	
	@Transactional(readOnly = true)
	public List<Establishment> findAll() {		
		return repository.findAll();		
	}
}
