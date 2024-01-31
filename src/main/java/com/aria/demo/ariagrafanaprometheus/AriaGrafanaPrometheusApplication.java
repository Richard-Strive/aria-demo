package com.aria.demo.ariagrafanaprometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AriaGrafanaPrometheusApplication {

    final static Logger logger = LoggerFactory.getLogger(AriaGrafanaPrometheusApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AriaGrafanaPrometheusApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> createLogs() {
		logger.warn("Richard, it's just a log!");
		return ResponseEntity.ok().body("Here again Rich, this is the response.");
	}

}
