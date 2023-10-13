package com.deezerAPI.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deezerAPI.entities.dto.UserDTO;

@RestController
@RequestMapping("deezer-user")
public class DeezerService {

	@GetMapping("{id}")
	public UserDTO getUser(@PathVariable String id) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<UserDTO> response = restTemplate
				.getForEntity("https://api.deezer.com/user/" + id + "/", UserDTO.class);
		
		return response.getBody();
	}
	
}
