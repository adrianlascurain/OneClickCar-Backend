package com.ecommerce.oneclickcar.controllers;

import java.util.List;

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
	public List<Transactions> getTransactions() {
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
									@RequestParam(required=false) String dateTransaction,
									@RequestParam(required=false) Long userIdBuyers,
									@RequestParam(required=false) Long userIdSellers,
									@RequestParam(required=false) Long carsIdCars,
									@RequestParam(required=false) Long paymentMethodIdCard,
									@RequestParam(required=false) Long depositMethodIdAccount) {
		return transactionsService.updateTransactions(traId, dateTransaction, userIdBuyers, userIdSellers, carsIdCars, paymentMethodIdCard,
				depositMethodIdAccount);
	}//updateTransactions
}//class TransactionsController
