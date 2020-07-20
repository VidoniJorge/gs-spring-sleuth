package ar.com.jlv.gs.spring.sleuth.product.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GsSleuthProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsSleuthProductApplication.class, args);
	}

}
