package com.infinite.corporation.repository;

import java.util.List;

import com.infinite.corporation.model.Corporation;

public interface ICorporationDao {
	public List<Corporation> getAllCorporation();
	public Corporation getCorporation(int id);
	public Corporation addCorporation(Corporation Corporation);
	public void updateCorporation(Corporation Corporation);
	public void deleteCorporation(int id);

}
