package dev.thales.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {
	public String PORT=System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
