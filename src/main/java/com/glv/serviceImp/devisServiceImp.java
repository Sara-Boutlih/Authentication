	package com.glv.serviceImp;


	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.glv.entities.Devis;

import com.glv.service.devisService;
	@Service("devisServiceImpl")

public class devisServiceImp implements devisService{
		
		@Autowired
		private devisService devisService;

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

		@Override
		public Devis getDevisByID(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Devis updateDevis(Devis devis) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Devis save(Devis devis) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Devis> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public static Optional<Devis> findDevisByid(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Optional<Devis> findUtilisateurByid(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		

	}


