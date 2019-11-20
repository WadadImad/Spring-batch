package com.imad.entities;


import java.util.Date;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;

import com.imad.dao.IDaoTransaction;

public class TransactionContenu implements FieldSetMapper<Transaction> {

	@Autowired
	IDaoTransaction daoTransaction;
	
	public Transaction mapFieldSet(FieldSet fieldSet) throws BindException {

		
		
		
        Transaction transaction = new Transaction();
       
        transaction.setIdTransaction(fieldSet.readInt("transaction_id"));
      
        transaction.setMontant(fieldSet.readDouble("montant"));
        
        daoTransaction.ajoutCompte(new Compte(fieldSet.readInt("compte_id")));
        
        transaction.setCompte(new Compte());
        
        transaction.getCompte().setIdCompt(fieldSet.readInt("compte_id"));
        
        transaction.setDateTransaction(new Date(fieldSet.readString("dateTransaction")));

     
        
		return transaction;
	}

}
