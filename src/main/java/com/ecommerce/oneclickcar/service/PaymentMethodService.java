package com.ecommerce.oneclickcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.PaymentMethod;
import com.ecommerce.oneclickcar.repository.PaymentMethodRepository;

@Service
public class PaymentMethodService {

	public final PaymentMethodRepository paymentMethodRepository;
	
	@Autowired
	public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
		this.paymentMethodRepository=paymentMethodRepository;
	}
	
	public List<PaymentMethod> getAllPaymentMethods() {
		return paymentMethodRepository.findAll();
	}//getAllPaymentMethods

	public PaymentMethod getPaymentMethod(Long idCard) {
		return paymentMethodRepository.findById(idCard).orElseThrow(
				()->new IllegalArgumentException("El método de depósito con el id ["
						+idCard+ "] no existe."));
	}//getPaymentMethod

	public PaymentMethod addPaymentMethod(PaymentMethod paymentMethod) {
		Optional <PaymentMethod> payment = paymentMethodRepository.findByNumberCard(paymentMethod.getNumberCard());
		if(payment.isEmpty()) {
			return paymentMethodRepository.save(paymentMethod);
		}else {
			System.out.println("El número de tarjeta ["
					+ paymentMethod.getNumberCard()+"] ya se encuentra registrada.");
			return null;
		}
	}//addPaymentMethod

	public PaymentMethod deletePaymentMethod(Long idCard) {
		PaymentMethod payment=null;
		if(paymentMethodRepository.existsById(idCard)) {
			payment=paymentMethodRepository.findById(idCard).get();
			paymentMethodRepository.deleteById(idCard);
		}
		return payment;
	}//deletePaymentMethod

	public PaymentMethod updatePaymentMethod(Long idCard, String nameCard, 
			String typeCard, String numberCard, String dateCard, 
			String cvvCard, String bankName) {
		
		PaymentMethod payment=null;
		if(paymentMethodRepository.existsById(idCard)) {
			PaymentMethod paymentMethod = paymentMethodRepository.findById(idCard).get();
				if(nameCard !=null) paymentMethod.setNameCard(nameCard);
				if(typeCard !=null) paymentMethod.setTypeCard(typeCard);
				if(numberCard !=null) paymentMethod.setNumberCard(numberCard);
				if(dateCard !=null) paymentMethod.setDateCard(dateCard);
				if(cvvCard !=null) paymentMethod.setCvvCard(cvvCard);
				if(bankName !=null) paymentMethod.setCvvCard(bankName);
				paymentMethodRepository.save(paymentMethod);
				payment=paymentMethod;
				
			}//if
		
		return payment;
	}
}
