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
			()-> new IllegalArgumentException("La transacción con el id [" + traId
					+ "] no existe"));
	}//getTransactions
	
	public Transactions addTransactions(Transactions transactions) {
		Optional <Transactions> tra = transactionsRepository.findByCarsIdCars(transactions.getCarsIdCars());
		if(tra.isEmpty()) {//no existe el Id
			return transactionsRepository.save(transactions);
		}else {
			System.out.println("La transacción del carro [" + transactions.getCarsIdCars()
			+ "] ya se encuentra registrada.");
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
	
	public Transactions updateTransactions(Long traId, String dateTransaction, Long usersIdBuyer, Long usersIdSeller, Long carsIdCars, Long paymentMethodIdCard, Long depositMethodIdAccount) {
		Transactions tra=null;
		
			if(transactionsRepository.existsById(traId)) {
				Transactions transactions = transactionsRepository.findById(traId).get();
				if (dateTransaction != null) transactions.setDateTransaction(dateTransaction);
				if (usersIdBuyer !=null)transactions.setUsersIdBuyer(usersIdBuyer);
				if(usersIdSeller !=null) transactions.setUsersIdSeller(usersIdSeller);
				if(carsIdCars !=null) transactions.setCarsIdCars(carsIdCars);
				if(paymentMethodIdCard !=null) transactions.setPaymentMethodIdCard(paymentMethodIdCard);
				if(depositMethodIdAccount !=null) transactions.setDepositMethodIdAccount(depositMethodIdAccount);
				tra=transactions;
				transactionsRepository.save(transactions);
			}//Exists
		return tra;
	}//updateTransactions
}//class TransactionsService
