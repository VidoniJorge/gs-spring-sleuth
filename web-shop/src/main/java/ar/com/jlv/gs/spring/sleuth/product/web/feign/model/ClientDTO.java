package ar.com.jlv.gs.spring.sleuth.product.web.feign.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDTO {
	private String name;
	private String lastName;
	private String document;
	private String documentType;
}
