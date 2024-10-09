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
	@GetMapping(path="{id_card}")
	public PaymentMethod getPaymentMethod(@PathVariable("id_card") Long id_card){
		return paymentMethodService.getPaymentMethod(id_card);
	}//getPaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public PaymentMethod addPaymentMethod(@RequestBody PaymentMethod paymentMethod){
		return paymentMethodService.addPaymentMethod(paymentMethod);
	}//addPaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{id_card}")
	public PaymentMethod deletePaymentMethod(@PathVariable("id_card") Long id_card) {
		return paymentMethodService.deletePaymentMethod(id_card);
	}//deletePaymentMethod
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{id_card}")
	public PaymentMethod updatePaymentMethod(@PathVariable("id_card") Long id_card,
			@RequestParam(required=false) String name_card,
			@RequestParam(required=false) String type_card,
			@RequestParam(required=false) String number_card,
			@RequestParam(required=false) String date_card,
			@RequestParam(required=false) String cvv_card			
			) {
		return paymentMethodService.updatePaymentMethod(id_card, name_card, 
				type_card, number_card, date_card, date_card);
	}//updatePaymentMethod

}
