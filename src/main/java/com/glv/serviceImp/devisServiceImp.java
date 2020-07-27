package com.glv.serviceImp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glv.entities.Devis;
import com.glv.repository.devisRepository;
import com.glv.service.devisService;
@Service("devisServiceImpl")
public class devisServiceImp implements devisService {
	
	@Autowired
	private devisRepository devisService;

	@Override
	public Devis addDevis(Devis devis) {
		// TODO Auto-generated method stub
		return devisService.save(devis);
	}

	@Transactional(readOnly = true)
	public List<Devis> allDevis() {
		// TODO Auto-generated method stub
		return devisService.findAll();
	}
	
	

}
