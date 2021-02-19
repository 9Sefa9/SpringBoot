package com.sefa.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

/*  Spring Boot
 - Spring Boot uses the layer: presentation(top) , Business, Persistence and Database(Bottom) layer
 1) Presentation Layer:
 	 The presentation layer handles the HTTP requests, translates the JSON parameter to object, and
 	 authenticates the request and transfer it to the business layer. In short,
    it consists of views i.e., frontend part.

 2) Business Layer:
 	 It consists of service classes and uses services provided by data access layers.
    It also performs authorization and validation.

 3) Persistence Layer:
 	 contains all the storage logic and translates business objects from and to database rows

 4) Database Layer:
    In the database layer, CRUD (create, retrieve, update, delete) operations are performed

 Additionally: In the service layer, all the business logic performs.
 It performs the logic on the data that is mapped to JPA with model classes.

*/

public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}


}
