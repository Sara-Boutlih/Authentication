package com.glv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Devis;
import com.glv.service.devisService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/devis")
public class devisController {
	@Autowired
	private devisService devisService;
	
	@PostMapping("/addDevis")
   public Devis addDevis(@RequestBody Devis devis) {
		
		return devisService.addDevis(devis);
	}
	@GetMapping("/allDevis")
	   public List<Devis> allDevis() {
			
			return devisService.allDevis();
		}

}
