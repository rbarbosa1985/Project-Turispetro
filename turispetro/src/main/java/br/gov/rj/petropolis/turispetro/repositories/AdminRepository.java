package br.gov.rj.petropolis.turispetro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.rj.petropolis.turispetro.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
