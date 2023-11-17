package com.infinite.corporation.service;

import java.util.List;

import com.infinite.corporation.model.Corporation;

public interface ICorporationService {
	public List<Corporation> getAllCorporation();

	public Corporation getCorporation(int id);

	public void addCorporation(Corporation Corporation);

	public void updateCorporation(Corporation Corporation);

	public void deleteCorporation(int id);

}
