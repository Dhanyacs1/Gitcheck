package com.infinite.corporation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infinite.corporation.model.Corporation;
import com.infinite.corporation.repository.CorporationDaoImpl;
@Service
public class CorporationServiceImpl  implements ICorporationService{
	@Autowired
	CorporationDaoImpl cor;

	@Override
	public List<Corporation> getAllCorporation() {
		// TODO Auto-generated method stub
		return  cor.getAllCorporation();
	}

	@Override
	public Corporation getCorporation(int id) {
		// TODO Auto-generated method stub
		return cor.getCorporation(id);
	}

	@Override
	public void addCorporation(Corporation Corporation) {
		// TODO Auto-generated method stub
		cor.addCorporation(Corporation);
	}

	@Override
	public void updateCorporation(Corporation Corporation) {
		// TODO Auto-generated method stub
		cor.updateCorporation(Corporation);
		
	}

	@Override
	public void deleteCorporation(int id) {
		// TODO Auto-generated method stub
		cor.deleteCorporation(id);
		
	}

}
