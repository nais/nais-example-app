package no.nav.nais.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  NaisExampleApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(NaisExampleApplication.class);
  public static void main(String[] args) {
	  LOG.info("This thing is starting up");
    SpringApplication.run(NaisExampleApplication.class, args);
  }
}