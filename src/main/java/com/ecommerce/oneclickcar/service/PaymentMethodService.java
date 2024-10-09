package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.PaymentMethod;

@Service
public class PaymentMethodService {


	private final ArrayList<PaymentMethod> lista = new ArrayList<PaymentMethod>();
	
	public PaymentMethodService() {
		
	}
	
	public List<PaymentMethod> getAllPaymentMethods() {
		return lista;
	}//getAllPaymentMethods

	public PaymentMethod getPaymentMethod(Long id_card) {
		PaymentMethod payment=null;
		
		for (PaymentMethod paymentMethod : lista) {
			if(paymentMethod.getId_card()==id_card) {
				payment=paymentMethod;
				break;
			}//if
		}//foreach
		return payment;
	}//getPaymentMethod

	public PaymentMethod addPaymentMethod(PaymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		lista.add(paymentMethod); 
		return paymentMethod;
	}//addPaymentMethod

	public PaymentMethod deletePaymentMethod(Long id_card) {
		PaymentMethod payment=null;
		for(PaymentMethod paymentMethod: lista) {
			if(paymentMethod.getId_card()==id_card) {
				payment=lista.remove(lista.indexOf(paymentMethod));
				break;
			}//if
		}//foreach
		return payment;
	}//deletePaymentMethod

	public PaymentMethod updatePaymentMethod(Long id_card, String name_card, 
			String type_card, String number_card, String date_card, 
			String cvv_card) {
		
		PaymentMethod payment=null;
		for(PaymentMethod paymentMethod: lista) {
			if(paymentMethod.getId_card()==id_card) {
				if(name_card !=null) paymentMethod.setName_card(name_card);
				if(type_card !=null) paymentMethod.setType_card(type_card);
				if(number_card !=null) paymentMethod.setNumber_card(number_card);
				if(date_card !=null) paymentMethod.setDate_card(date_card);
				if(cvv_card !=null) paymentMethod.setCvv_card(cvv_card);
				payment=paymentMethod;
				break;
			}//if
		}//foreach
		return payment;
	}
}
