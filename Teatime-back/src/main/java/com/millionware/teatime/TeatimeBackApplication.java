package com.millionware.teatime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan
@EnableMongoRepositories
@SpringBootApplication
public class TeatimeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeatimeBackApplication.class, args);
	}

}
