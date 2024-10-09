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
	@GetMapping(path="{id_account}")
	public DepositMethod getDepositMethod(@PathVariable("id_account") Long id_account){
		return depositMethodService.getDepositMethod(id_account);
	}//getDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public DepositMethod addDepositMethod(@RequestBody DepositMethod depositMethod){
		return depositMethodService.addDepositMethod(depositMethod);
	}//addDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{id_account}")
	public DepositMethod deleteDepositMethod(@PathVariable("id_account") Long id_account) {
		return depositMethodService.deleteDepositMethod(id_account);
	}//deleteDepositMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{id_account}")
	public DepositMethod updateDepositMethod(@PathVariable("id_account") Long id_account,
			@RequestParam(required=false) String name_account,
			@RequestParam(required=false) String name_bank,
			@RequestParam(required=false) String account_bank			
			) {
		return depositMethodService.updateDepositMethod(id_account, name_account, 
				name_bank, account_bank);
	}//updateDepositMethod
	
}
