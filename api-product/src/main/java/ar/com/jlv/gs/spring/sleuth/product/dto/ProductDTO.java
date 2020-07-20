package ar.com.jlv.gs.spring.sleuth.product.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
	private Integer id;
	private String name;
}
