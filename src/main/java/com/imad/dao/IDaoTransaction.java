package com.imad.dao;

import com.imad.entities.Compte;
import com.imad.entities.Transaction;

public interface IDaoTransaction {
	
	public void ajoutTransaction(Transaction transaction);
	public void ajoutCompte(Compte compte);

}
