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

import com.ecommerce.oneclickcar.model.PaymentMethod;
import com.ecommerce.oneclickcar.service.PaymentMethodService;

@RestController
@RequestMapping(path="/api/paymentmethods/") //http://localhost:8080/api/paymentmethods/
public class PaymentMethodController {
	
private final PaymentMethodService paymentMethodService;
	
	@Autowired
	public PaymentMethodController(PaymentMethodService paymentMethodService) {
		this.paymentMethodService= paymentMethodService;
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping
	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethodService.getAllPaymentMethods();
	}//getPaymentMethods
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping(path="{idCard}")
	public PaymentMethod getPaymentMethod(@PathVariable("idCard") Long idCard){
		return paymentMethodService.getPaymentMethod(idCard);
	}//getPaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public PaymentMethod addPaymentMethod(@RequestBody PaymentMethod paymentMethod){
		return paymentMethodService.addPaymentMethod(paymentMethod);
	}//addPaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{idCard}")
	public PaymentMethod deletePaymentMethod(@PathVariable("idCard") Long idCard) {
		return paymentMethodService.deletePaymentMethod(idCard);
	}//deletePaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{idCard}")
	public PaymentMethod updatePaymentMethod(@PathVariable("idCard") Long idCard,
			@RequestParam(required=false) String nameCard,
			@RequestParam(required=false) String typeCard,
			@RequestParam(required=false) String numberCard,
			@RequestParam(required=false) String dateCard,
			@RequestParam(required=false) String cvvCard			
			) {
		return paymentMethodService.updatePaymentMethod(idCard, nameCard, 
				typeCard, numberCard, dateCard, dateCard);
	}//updatePaymentMethod

}
