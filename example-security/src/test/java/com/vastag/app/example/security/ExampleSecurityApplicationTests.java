package com.vastag.app.example.security;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

@SpringBootTest
class ExampleSecurityApplicationTests {

	@Test
	void testPasswordEncoders() {
//		System.out.println(new BCryptPasswordEncoder().encode("vastag"));
//		System.out.println(new Pbkdf2PasswordEncoder().encode("vastag"));
//		System.out.println(new SCryptPasswordEncoder().encode("vastag"));

		Map<String, PasswordEncoder> encoders = new HashMap<String, PasswordEncoder>();
		encoders.put("bcrypt", new BCryptPasswordEncoder());
		encoders.put("scrypt", new SCryptPasswordEncoder());

		System.out.println(new DelegatingPasswordEncoder("bcrypt", encoders).encode("vastag"));
		System.out.println(new DelegatingPasswordEncoder("scrypt", encoders).encode("vastag"));

	}

}
