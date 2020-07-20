package ar.com.jlv.gs.spring.sleuth.product.web.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.jlv.gs.spring.sleuth.product.web.feign.model.ProductDTO;

@FeignClient(name = "ApiProduct", url = "127.0.0.1:8090")
public interface ApiProduct {
	@GetMapping(path = "products")
	public List<ProductDTO> getProducts();
}
