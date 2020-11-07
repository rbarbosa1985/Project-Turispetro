package br.gov.rj.petropolis.turispetro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rj.petropolis.turispetro.model.Establishment;
import br.gov.rj.petropolis.turispetro.services.EstablishmentService;

@RestController
@RequestMapping(value = "/establishments")
public class EstablishmentResource {
	
	@Autowired
	private EstablishmentService service;
	
	@GetMapping
	public ResponseEntity<List<Establishment>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
}
