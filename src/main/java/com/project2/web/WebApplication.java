package com.project2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Controller
//@EnableWebMvc
@EnableJpaRepositories
@EnableTransactionManagement
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebApplication {

//	@Autowired
//	RestTemplate template;
//
//	@RequestMapping(path="/hello", method={RequestMethod.GET, RequestMethod.POST})
//	@ResponseBody
//	protected String getHello() {
//		return "Hello, World!";
//	}

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
//
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner runner() {
//		return args -> {
//			String body = null;
//			body = template.getForObject("http://localhost:8080/suit-api/suit/1", String.class);
//			System.out.println(body);
//		};
//	}
}
