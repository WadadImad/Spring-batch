package com.imad.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Transaction {
	@Id
	private int transaction_id;
	private double montant;
	private Date dateTransaction;
	private Date dateDebit;
	
	
	@ManyToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;


	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Transaction(int idTransaction, double montant, Date dateTransaction, Date dateDebit, Compte compte) {
		super();
		this.transaction_id = idTransaction;
		this.montant = montant;
		this.dateTransaction = dateTransaction;
		this.dateDebit = dateDebit;
		this.compte = compte;
	}




	public int getIdTransaction() {
		return transaction_id;
	}


	public void setIdTransaction(int idTransaction) {
		this.transaction_id = idTransaction;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public Date getDateTransaction() {
		return dateTransaction;
	}


	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}


	public Date getDateDebit() {
		return dateDebit;
	}


	public void setDateDebit(Date dateDebit) {
		this.dateDebit = dateDebit;
	}


	public Compte getCompte() {
		return compte;
	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
