package com.imad.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imad.dao.IDaoTransaction;
import com.imad.entities.Transaction;

@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transaction>{
	
	@Autowired
	private IDaoTransaction dao;

	public void write(List<? extends Transaction> transactions) throws Exception {
		for(Transaction tr : transactions){
			dao.ajoutTransaction(tr);
			
		}
		
	}

}
