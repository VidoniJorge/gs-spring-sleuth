package ar.com.jlv.gs.spring.sleuth.product.web.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.jlv.gs.spring.sleuth.product.web.feign.model.ClientDTO;

@FeignClient(name = "ApiClient", url = "127.0.0.1:8091")
public interface ApiClient {
	@GetMapping(path = "clients")
	public List<ClientDTO> getCients();
}
