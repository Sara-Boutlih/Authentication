package com.glv.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.glv.entities.Devis;

@Component
public interface devisService {

	public Devis addDevis(Devis devis);
	public List<Devis> allDevis();

}
