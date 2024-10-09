package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.DepositMethod;

@Service
public class DepositMethodService {

	private final ArrayList<DepositMethod> lista = new ArrayList<DepositMethod>();
	
	public DepositMethodService() {
		
	}
	
	public List<DepositMethod> getAllDepositMethods() {
		return lista;
	}//getAllDepositMethods

	public DepositMethod getDepositMethod(Long id_account) {
		DepositMethod deposit=null;
		
		for (DepositMethod depositMethod : lista) {
			if(depositMethod.getId_account()==id_account) {
				deposit=depositMethod;
				break;
			}//if
		}//foreach
		return deposit;
	}//getDepositMethod

	public DepositMethod addDepositMethod(DepositMethod depositMethod) {
		// TODO Auto-generated method stub
		lista.add(depositMethod); 
		return depositMethod;
	}//addDepositMethod

	public DepositMethod deleteDepositMethod(Long id_account) {
		DepositMethod deposit=null;
		for(DepositMethod depositMethod: lista) {
			if(depositMethod.getId_account()==id_account) {
				deposit=lista.remove(lista.indexOf(depositMethod));
				break;
			}//if
		}//foreach
		return deposit;
	}//deleteDepositMethod

	public DepositMethod updateDepositMethod(Long id_account, String name_account, 
			String name_bank, String account_bank) {
		
		DepositMethod deposit=null;
		for(DepositMethod depositMethod: lista) {
			if(depositMethod.getId_account()==id_account) {
				if(name_account !=null) depositMethod.setName_account(name_account);
				if(name_bank !=null) depositMethod.setName_bank(name_bank);
				if(account_bank !=null) depositMethod.setAccount_bank(account_bank);
				deposit=depositMethod;
				break;
			}//if
		}//foreach
		return deposit;
	}
	
}
