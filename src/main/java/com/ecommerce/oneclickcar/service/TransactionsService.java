package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.Transactions;

@Service
public class TransactionsService {
	private static final ArrayList<Transactions> lista = new ArrayList<Transactions>();
	public TransactionsService() {
		lista.add(new Transactions(1L, "09/10/2024", 33L, 44L, 7L, 3L, 88L));
	}//CONSTRUCTOR
	
	public ArrayList<Transactions> getAllTransactions() {
		return lista;
	}//getAllTransactions
	
	public Transactions getTransactions(Long traId) {
		Transactions tra=null;
		for(Transactions transactions : lista) {
			if(transactions.getId_transaction()==traId) {
				tra=transactions;
				break;
			}//iff
		}//foreach
		return tra;
	}//getTransactions
	
	public Transactions addTransactions(Transactions transactions) {
		Transactions user=null;
		boolean flag = false;
			for(Transactions t : lista) {
				if(t.getId_transaction().equals(transactions.getId_transaction())) {
					flag = true;
					break;
				}//if
			}//foreach
			if (! flag) {
				lista.add(transactions);
				user = transactions;
			}//if
			return transactions;
	}//addTransactions

	public Transactions deleteTransactions(Long traId) {
		Transactions tra=null;
		for (Transactions transactions : lista) {
			if(transactions.getId_transaction()==traId) {
				tra=lista.remove(lista.indexOf(transactions));
				break;
			}//if
		}//foreach
		return tra;
	}//deleteTransactions
	
	public Transactions updateTransactions(Long traId, String date_transaction, Long user_id_buyer, Long user_id_seller, Long cars_id_cars, Long payment_method_id_cars, Long deposit_method_id_account) {
		Transactions tra=null;
		for(Transactions transactions : lista) {
			if(transactions.getId_transaction()==traId) {
				if (date_transaction != null) transactions.setDate_transaction(date_transaction);
				if (user_id_buyer !=null)transactions.setUser_id_buyer(user_id_buyer);
				if(user_id_seller !=null) transactions.setUser_id_seller(user_id_seller);
				if(cars_id_cars !=null) transactions.setCars_id_cars(cars_id_cars);
				if(payment_method_id_cars !=null) transactions.setPayment_method_id_cars(payment_method_id_cars);
				if(deposit_method_id_account !=null) transactions.setDeposit_method_id_account(deposit_method_id_account);
				tra=transactions;
				break;
			}//if
		}//foreach
		return tra;
	}//updateTransactions
}
