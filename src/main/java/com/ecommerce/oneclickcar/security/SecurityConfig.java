package com.ecommerce.oneclickcar.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

// Configuración de seguridad

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean // pedazo de código que se manda a llamar
	public SecurityFilterChain configure(HttpSecurity http) throws Exception{
	
		return http.csrf(crsf -> crsf.disable())
				.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()
						).httpBasic(withDefaults())
				.build();
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
}
