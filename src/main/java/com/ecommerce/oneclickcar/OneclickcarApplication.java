package com.ecommerce.oneclickcar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import com.ecommerce.oneclickcar.security.JwtFilter;

@SpringBootApplication
public class OneclickcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneclickcarApplication.class, args);
	}//main
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean = 
				new FilterRegistrationBean<JwtFilter>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/cars/*");
		registrationBean.addUrlPatterns("/api/users/*");
		registrationBean.addUrlPatterns("/api/comments/*");
		registrationBean.addUrlPatterns("/api/transactions/*");
		registrationBean.addUrlPatterns("/api/paymentmethods/*");
		registrationBean.addUrlPatterns("/api/depositmethods/*");
		return registrationBean;
	}//FilterRegistrationBean
}//OneclickcarApplication
