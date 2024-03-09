package com.project.woopii;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class WoopiiApplication implements CommandLineRunner{

    @Value("${application.name}")
    private String message;

	public static void main(String[] args) {
		SpringApplication.run(WoopiiApplication.class, args);

	}

	@Override
    public void run(String... args) throws Exception {
        log.info("Resolved message parameter: {}", message);

    }
}
