package br.gov.rj.petropolis.turispetro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rj.petropolis.turispetro.model.Category;
import br.gov.rj.petropolis.turispetro.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<Category> findAll() {		
		return repository.findAll();		
	}
}
