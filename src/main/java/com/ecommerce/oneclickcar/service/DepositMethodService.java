package com.ecommerce.oneclickcar.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.DepositMethod;
import com.ecommerce.oneclickcar.repository.DepositMethodRepository;

@Service
public class DepositMethodService {

	public final DepositMethodRepository depositMethodRepository;
	
	@Autowired
	public DepositMethodService(DepositMethodRepository depositMethodRepository) {
		this.depositMethodRepository=depositMethodRepository;
	}
	
	public List<DepositMethod> getAllDepositMethods() {
		return depositMethodRepository.findAll();
	}//getAllDepositMethods

	public DepositMethod getDepositMethod(Long idAccount) {
return depositMethodRepository.findById(idAccount).orElseThrow(
		()->new IllegalArgumentException("El método de depósito con el id ["
				+idAccount+ "] no existe."));
	}//getDepositMethod

	public DepositMethod addDepositMethod(DepositMethod depositMethod) {
			Optional <DepositMethod> deposit = depositMethodRepository.findByAccountBank(depositMethod.getAccountBank());
			if(deposit.isEmpty()) {
				return depositMethodRepository.save(depositMethod);
			}else {
				System.out.println("La cuenta de depósito ["
						+ depositMethod.getAccountBank()+"] ya se encuentra registrada.");
				return null;
			}
	}//addDepositMethod

	public DepositMethod deleteDepositMethod(Long idAccount) {
		DepositMethod deposit=null;
		if(depositMethodRepository.existsById(idAccount)) {
			deposit=depositMethodRepository.findById(idAccount).get();
			depositMethodRepository.deleteById(idAccount);
		}
		return deposit;
	}//deleteDepositMethod

	public DepositMethod updateDepositMethod(Long idAccount, String nameAccount, 
			String nameBank, String accountBank) {
		
		DepositMethod deposit=null;
		
		if(depositMethodRepository.existsById(idAccount)) {
			DepositMethod depositMethod = depositMethodRepository.findById(idAccount).get();
				if(nameAccount !=null) depositMethod.setNameAccount(nameAccount);
				if(nameBank !=null) depositMethod.setNameBank(nameBank);
				if(accountBank !=null) depositMethod.setAccountBank(accountBank);
				depositMethodRepository.save(depositMethod);
				deposit=depositMethod;
			}//if
		return deposit;
	}//updateDepositMethod()
}//DepositMethodService
