package com.glv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.glv.entities.Devis;

@Component
public interface devisService {

	public Devis addDevis(Devis devis);
	public List<Devis> allDevis();
	public Devis getDevisByID(int id);
	public Devis updateDevis(Devis devis);
	public Devis save(Devis devis);
	public List<Devis> findAll();
	Optional<Devis> findUtilisateurByid(Long id);

}
