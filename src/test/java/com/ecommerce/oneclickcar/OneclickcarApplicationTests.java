package com.ecommerce.oneclickcar;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.ecommerce.oneclickcar.model.PaymentMethod;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfigureMockMvc
class OneclickcarApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	private final String token="Bearer: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlamVtcGxvMUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJpYXQiOjE3MjkxODY2MzcsImV4cCI6MTcyOTIyOTgzN30.q9s6h-w-Uueuy74UojK244CaYS-t8DL5HCoHb7QNfDg";
	
	
	@Test
	@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba el endpoint http://localhost:8080/api/users/2")
	void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/api/users/2")
				.header("Authorization", token))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(
						content().string(containsString("password_2"))
						);
				
	}//pruebaGet
	
	@Test
	@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba el endpoint http://localhost:8080/api/comments/4")
	void testGET() throws Exception {
		this.mockMvc.perform(get("/api/comments/4")
				.header("Authorization", token))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(
						content().string(containsString("Me encanto"))
						);
				
	}//testGet
	
	@Test
	@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba el endpoint http://localhost:8080/api/transactions/5")
	void tstGET() throws Exception {
		this.mockMvc.perform(get("/api/transactions/5")
				.header("Authorization", token))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(
						content().string(containsString("2024-10-05"))
						);
				
	}//tstGet
	
	@Test
	@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba el borrar el cars con id 3 http://localhost:8080/api/cars/3")
	void pruebaDelete() throws Exception {
		this.mockMvc.perform(delete("/api/cars/3")
				.header("Authorization", token))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(
						content().string(containsString("KIA"))
						);
				
	}//pruebaDelete
	
	@Test
	@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba actualizar el deposit method con id 3 http://localhost:8080/api/depositmethods/3")
	void pruebaPut() throws Exception {
		this.mockMvc.perform(put("/api/depositmethods/3?name_bank=BBVA")
			    .header("Authorization", token))
			    .andDo(print())
			    .andExpect(status().isOk())
			    .andExpect(content().string(containsString("Antonio")));

				
	}//pruebaPut
	
	@Test
	//@Disabled("Probado la primera vez, desphabilitado")
	@DisplayName("Se prueba crear un nuevo payment method http://localhost:8080/api/paymentmethods/")
	void pruebaPost() throws Exception {
		PaymentMethod p = new PaymentMethod();
		p.setNameCard("Pedro Infante");
		p.setTypeCard("100166.jpeg");
		p.setNumberCard("5345678917824558");
		p.setDateCard("2025-05-10");
		p.setCvvCard("478");
		p.setUsersIdUser(1L);
		p.setNameBank("Banco Azteca");
		this.mockMvc.perform(post("/api/paymentmethods/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p))
			    .header("Authorization", token))
			    .andDo(print())
			    .andExpect(status().isOk())
			    .andExpect(content().string(containsString("Pedro")));

				
	}//pruebaPost
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
	
	

}
