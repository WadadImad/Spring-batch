package com.imad.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imad.dao.IDaoTransaction;
import com.imad.entities.Compte;
import com.imad.entities.Transaction;

@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<Transaction, Transaction>{
	@Autowired
	IDaoTransaction dao;
	
	public Transaction process(Transaction transaction) throws Exception {
		
		transaction.setDateDebit(new Date(new Long(System.currentTimeMillis())));
	
		Compte  compte = transaction.getCompte();
	
		double a = compte.getSolde()+transaction.getMontant();
		
		compte.setSolde(a);

		//	dao.ajoutCompte(compte);
		
		
		return transaction;
			
	}
}
