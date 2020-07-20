package ar.com.jlv.gs.spring.sleuth.product.controller;

import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.jlv.gs.spring.sleuth.product.dto.ProductDTO;

@RestController
public class ProductController {
	private static Logger Logger = LogManager.getLogger(ProductController.class);
	@GetMapping(path = "/products")
	public List<ProductDTO> getProducts() {
		Logger.info("Hello Sleuth");
		Logger.info("bey Sleuth");
		return Collections.singletonList(ProductDTO.builder().id(1).name("Phone").build());
	}
}
