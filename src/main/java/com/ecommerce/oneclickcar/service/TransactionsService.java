package com.ecommerce.oneclickcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.oneclickcar.model.Transactions;
import com.ecommerce.oneclickcar.repository.TransactionsRepository;

@Service
public class TransactionsService {
	public final TransactionsRepository transactionsRepository;
	@Autowired
	public TransactionsService(TransactionsRepository transactionsRepository) {
		this.transactionsRepository = transactionsRepository;
	}//CONSTRUCTOR
	
	public List<Transactions> getAllTransactions() {
		return transactionsRepository.findAll();
	}//getAllTransactions
	
	public Transactions getTransactions(Long traId) {
	return transactionsRepository.findById(traId).orElseThrow(
			()-> new IllegalArgumentException("El comentario con el id [" + traId
					+ "] no existe"));
	}//getTransactions
	
	public Transactions addTransactions(Transactions transactions) {
		Optional<Transactions> tra = transactionsRepository.findById(transactions.getIdTransaction());
		if(tra.isEmpty()) {//no existe el Id
			return transactionsRepository.save(transactions);
		}else {
			System.out.println("El comentario [" + transactions.getIdTransaction()
			+ "] ya se encuentra");
			return null;
		}//if is emptuy
	}//addTransactions

	public Transactions deleteTransactions(Long traId) {
		Transactions tra=null;
		if(transactionsRepository.existsById(traId)) {
			tra=transactionsRepository.findById(traId).get();
			transactionsRepository.deleteById(traId);
		}
		return tra;
	}//deleteTransactions
	
	public Transactions updateTransactions(Long traId, String dateTransaction, Long userIdBuyer, Long userIdSeller, Long carsIdCars, Long paymentMethodIdCars, Long depositMethodIdAccount) {
		Transactions tra=null;
		
			if(transactionsRepository.existsById(traId)) {
				Transactions transactions = transactionsRepository.findById(traId).get();
				if (dateTransaction != null) transactions.setDateTransaction(dateTransaction);
				if (userIdBuyer !=null)transactions.setUserIdBuyer(userIdBuyer);
				if(userIdSeller !=null) transactions.setUserIdSeller(userIdSeller);
				if(carsIdCars !=null) transactions.setCarsIdCars(carsIdCars);
				if(paymentMethodIdCars !=null) transactions.setPaymentMethodIdCars(paymentMethodIdCars);
				if(depositMethodIdAccount !=null) transactions.setDepositMethodIdAccount(depositMethodIdAccount);
				tra=transactions;
			}//Exists
		return tra;
	}//updateTransactions
}//class TransactionsService
