package ar.com.jlv.gs.spring.sleuth.product.web.feign.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
	private Integer id;
	private String name;
}

