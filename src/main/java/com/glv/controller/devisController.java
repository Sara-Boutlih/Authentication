package com.glv.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glv.entities.Devis;
import com.glv.service.devisService;
import com.glv.serviceImp.devisServiceImp;


@RestController
@CrossOrigin("*")
@RequestMapping(value="/devis")
public class devisController {
	@Autowired
	private devisService devisService;
	
	//API Ajouter devis
	
	@PostMapping("/addDevis")
   public Devis addDevis(@RequestBody Devis devis) {
		
		return devisService.addDevis(devis);
	}
	//API pour retourner tous les devis
	@GetMapping("/allDevis")
	   public List<Devis> allDevis() {
			
			return devisService.allDevis();
		}
		 
	//API qui prend ID Devis et retourne les infos
	@GetMapping("/getDevis/{devisid}")  
	private Devis getDevis(@PathVariable("devisid") int id)   
	{  
		return devisService.getDevisByID(id);
	 
	}
	//Api pour récupérer un  devis et le modifier 
	
	@RequestMapping(value="/modifierDevis/{id}", method=RequestMethod.PUT)
    public Devis update(@RequestBody Devis devis , @PathVariable Long id){
		Optional<Devis> optional =  devisServiceImp.findDevisByid(id);
		Devis d =new Devis();
		if(optional.isPresent()) {
			d= devisService.updateDevis(devis);
			
			
		}
		return d;
	}
	
}
