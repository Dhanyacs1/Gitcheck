package com.infinite.corporation.repository;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.corporation.model.Corporation;
@Repository
@Transactional
public class CorporationDaoImpl implements ICorporationDao{
	@Autowired
	private SessionFactory sessionfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<Corporation> getAllCorporation() {
		// TODO Auto-generated method stub
		Session scs = this.sessionfactory.getCurrentSession();
		List<Corporation> ls = scs.createQuery("from Corporation").list();
		return ls;
	}
	

	@Override
	public Corporation getCorporation(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Corporation Corporation = (Corporation) session.get(Corporation.class, id);
		return Corporation;
		
	}

	@Override
	public Corporation addCorporation(Corporation Corporation) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		session.save(Corporation);
		return Corporation;
	}

	@Override
	public void updateCorporation(Corporation Corporation) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Hibernate.initialize(Corporation);
		session.update(Corporation);
	}

	@Override
	public void deleteCorporation(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionfactory.getCurrentSession();
		Corporation p = (Corporation) session.load(Corporation.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		
	}


	}
}
