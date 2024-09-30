
package com.czn.catalogue_service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogueServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CatalogueServiceApplication.class, args);
		System.out.println("Catalogue service started!");
	}

}
