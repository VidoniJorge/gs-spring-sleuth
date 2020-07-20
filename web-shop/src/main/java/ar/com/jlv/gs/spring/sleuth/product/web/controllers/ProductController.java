package ar.com.jlv.gs.spring.sleuth.product.web.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.jlv.gs.spring.sleuth.product.web.feign.ApiProduct;
import ar.com.jlv.gs.spring.sleuth.product.web.feign.model.ProductDTO;

@Controller
public class ProductController {
	private static Logger Logger = LogManager.getLogger(ProductController.class);
	private ApiProduct apiProduct;

	public ProductController(final ApiProduct apiProduct) {
		this.apiProduct = apiProduct;
	}

	@GetMapping("/products")
	public String products(final Model model) {
		Logger.info("Inicio método products");
		
		Logger.warn("Inicio llamada Feign Products");
		final List<ProductDTO> products = apiProduct.getProducts();
		Logger.warn("Fin llamada Feign Products");
		
		model.addAttribute("name", "products");
		model.addAttribute("products", products);
		Logger.info("Inicio método products");
		return "products";
	}
}
