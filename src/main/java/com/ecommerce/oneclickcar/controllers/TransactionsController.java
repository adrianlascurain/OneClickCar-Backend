package com.ecommerce.oneclickcar.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oneclickcar.model.Transactions;
import com.ecommerce.oneclickcar.service.TransactionsService;

@RestController
@RequestMapping(path="/api/transactions/") //	http://localhost:8080/api/transactions/
public class TransactionsController {

	private final TransactionsService transactionsService;
	@Autowired
	public TransactionsController(TransactionsService transactionsService) {
		this.transactionsService = transactionsService;
	}//constructor
	
	@GetMapping
	public ArrayList<Transactions> getTransactions() {
		return  transactionsService.getAllTransactions();
	}//getComments
	
	@GetMapping (path="{traId}") //http://localhost:8080/api/transactions/1
	public Transactions getTransactions(@PathVariable("traId") Long traId) {
		return transactionsService.getTransactions(traId);
	}//getComment
	
	@PostMapping
	public Transactions addTransactions(@RequestBody Transactions transactions) {
		return transactionsService.addTransactions(transactions);
	}//postMapping
	
	@DeleteMapping(path="{traId}") //http://localhost:8080/api/transactions/1
	public Transactions deleteTransactions (@PathVariable("traId") Long traId) {
		return transactionsService.deleteTransactions(traId);
	} //deleteTransactions
	
	@PutMapping(path="{traId}") //http://localhost:8080/api/transactions/1
	public Transactions updateTransactions(@PathVariable("traId") Long traId,
									@RequestParam(required=false) String date_transaction,
									@RequestParam(required=false) Long user_id_buyer,
									@RequestParam(required=false) Long user_id_seller,
									@RequestParam(required=false) Long cars_id_cars,
									@RequestParam(required=false) Long payment_method_id_cars,
									@RequestParam(required=false) Long deposit_method_id_account) {
		return transactionsService.updateTransactions(traId, date_transaction, user_id_buyer, user_id_seller, cars_id_cars, payment_method_id_cars,
				deposit_method_id_account);
	}//updateTransactions
}//class TransactionsController
