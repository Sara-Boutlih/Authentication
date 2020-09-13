package com.glv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glv.entities.Utilisateur;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	public Utilisateur findByUsername(String email);

}
