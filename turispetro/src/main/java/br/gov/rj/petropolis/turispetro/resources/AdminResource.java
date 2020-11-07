package br.gov.rj.petropolis.turispetro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rj.petropolis.turispetro.model.Admin;
import br.gov.rj.petropolis.turispetro.services.AdminService;

@RestController
@RequestMapping(value = "/admin")
public class AdminResource {
	
	@Autowired
	private AdminService service;
	
	@GetMapping
	public ResponseEntity<List<Admin>> findAll(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
}
