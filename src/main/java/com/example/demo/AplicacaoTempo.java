package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AplicacaoTempo {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				AplicacaoTempo.class,
				FeignConfig.class
		).run(args);	}

}
