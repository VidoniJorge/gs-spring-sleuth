package ar.com.jlv.gs.spring.sleuth.product.controller;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;

import ar.com.jlv.gs.spring.sleuth.product.dto.ProductDTO;

@RestController
public class ProductController {
	private static Logger Logger = LogManager.getLogger(ProductController.class);
	
	@GetMapping(path = "/products")
	public List<ProductDTO> getProducts(@RequestHeader HttpHeaders httpHeaders) {
		Logger.info("Hello Sleuth");
		List<ProductDTO> products = new ArrayList<>();
		products.add(ProductDTO.builder().id(1).name("Phone").build());
		products.add(ProductDTO.builder().id(2).name("Motorola").build());
		products.add(ProductDTO.builder().id(3).name("Samsung").build());
		Logger.info("bey Sleuth");
		return products;
	}
}
