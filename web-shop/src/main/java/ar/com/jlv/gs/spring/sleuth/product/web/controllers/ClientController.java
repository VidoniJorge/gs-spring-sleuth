package ar.com.jlv.gs.spring.sleuth.product.web.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.jlv.gs.spring.sleuth.product.web.feign.ApiClient;
import ar.com.jlv.gs.spring.sleuth.product.web.feign.model.ClientDTO;

@Controller
public class ClientController {

	private ApiClient apiClient;

	public ClientController(final ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	@GetMapping(path = "/clients")
	public String getClients(final Model model) {
		List<ClientDTO> clients = apiClient.getCients();
		model.addAttribute("clients", clients);

		return "clients";
	}
}
