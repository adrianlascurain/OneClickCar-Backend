package com.ecommerce.oneclickcar.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oneclickcar.model.DepositMethod;
import com.ecommerce.oneclickcar.service.DepositMethodService;

@RestController
@RequestMapping(path="/api/depositmethods/") //http://localhost:8080/api/depositmethods/
public class DepositMethodControllers {

	private final DepositMethodService depositMethodService;
	
	@Autowired
	public DepositMethodControllers(DepositMethodService depositMethodService) {
		this.depositMethodService= depositMethodService;
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping
	public List<DepositMethod> getDepositMethods() {
		return depositMethodService.getAllDepositMethods();
	}//getDepositMethods
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping(path="{idAccount}")
	public DepositMethod getDepositMethod(@PathVariable("idAccount") Long idAccount){
		return depositMethodService.getDepositMethod(idAccount);
	}//getDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public DepositMethod addDepositMethod(@RequestBody DepositMethod depositMethod){
		return depositMethodService.addDepositMethod(depositMethod);
	}//addDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{idAccount}")
	public DepositMethod deleteDepositMethod(@PathVariable("idAccount") Long idAccount) {
		return depositMethodService.deleteDepositMethod(idAccount);
	}//deleteDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{idAccount}")
	public DepositMethod updateDepositMethod(@PathVariable("idAccount") Long idAccount,
			@RequestParam(required=false) String nameAccount,
			@RequestParam(required=false) String nameBank,
			@RequestParam(required=false) String accountBank			
			) {
		return depositMethodService.updateDepositMethod(idAccount, nameAccount, 
				nameBank, accountBank);
	}//updateDepositMethod
	
}
