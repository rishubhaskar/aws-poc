package poc.aws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsPocApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(AwsPocApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(AwsPocApplication.class, args);
    LOGGER.info("AWS POC application started successfully");
  }
}
