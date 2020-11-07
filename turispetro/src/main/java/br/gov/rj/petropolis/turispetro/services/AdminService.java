package br.gov.rj.petropolis.turispetro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rj.petropolis.turispetro.model.Admin;
import br.gov.rj.petropolis.turispetro.repositories.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository repository;
	
	@Transactional(readOnly = true)
	public List<Admin> findAll() {		
		return repository.findAll();		
	}
}
