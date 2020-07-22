package ar.com.jlv.gs.spring.sleuth.client.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.jlv.gs.spring.sleuth.client.dtos.ClientDTO;

@RestController
public class ClienController {
	
	@GetMapping(path = "clients")
	public List<ClientDTO> getCients() {
		List<ClientDTO> clients = new ArrayList<>();
		clients.add(
				ClientDTO.builder().name("Pepe").lastName("Argento").document("33003300").documentType("DNI").build());
		clients.add(ClientDTO.builder().name("Juan").lastName("Fino").document("33003301").documentType("DNI").build());
		clients.add(ClientDTO.builder().name("Carlos").lastName("Madrugador").document("33003302").documentType("DNI")
				.build());
		return clients;
	}
}
