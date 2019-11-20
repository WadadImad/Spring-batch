package com.imad.dao;



import org.springframework.transaction.annotation.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.imad.entities.Compte;
import com.imad.entities.Transaction;
@Repository
public class TransactionDao implements IDaoTransaction{

	
	
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void ajoutTransaction(Transaction transaction) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(transaction);	
		
	}
	
	public void ajoutCompte(Compte compte) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(compte);			
	}

}
