package com.imad.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Compte {

	@Id
	private int compte_id;
	public Compte(int compte_id) {
		super();
		this.compte_id = compte_id;
	}

	private double solde;
	
	@OneToMany(mappedBy = "compte")
	private List<Transaction> transactions;

	public Compte() {
		super();

	}

	public int getIdCompt() {
		return compte_id;
	}

	public void setIdCompt(int idCompt) {
		this.compte_id = idCompt;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Compte(int idCompt, double solde, List<Transaction> transactions) {
		super();
		this.compte_id = idCompt;
		this.solde = solde;
		this.transactions = transactions;
	}
	
	
	
}
