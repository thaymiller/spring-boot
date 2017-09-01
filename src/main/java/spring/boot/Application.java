/*
 * Copyright (c) 1996-2013 UOL Inc, Todos os direitos reservados
 * 
 * Este arquivo e uma propriedade confidencial do Universo Online Inc. Nenhuma
 * parte do mesmo pode ser copiada, reproduzida, impressa ou transmitida por
 * qualquer meio sem autorizacao expressa e por escrito de um representante
 * legal do Universo Online Inc.
 * 
 * All rights reserved
 * 
 * This file is a confidential property of Universo Online Inc. No part of this
 * file may be reproduced or copied in any form or by any means without written
 * permission from an authorized person from Universo Online Inc.
 */
package spring.boot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
		return args -> {
			
			System.out.println("Let's inspect the beans provided by Spring Boot:");
			
			final String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (final String beanName : beanNames) {
				System.out.println(beanName);
			}
			
		};
	}
}
