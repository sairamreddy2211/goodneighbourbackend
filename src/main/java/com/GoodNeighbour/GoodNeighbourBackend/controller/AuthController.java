package com.GoodNeighbour.goodneighbourbackend.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.GoodNeighbour.goodneighbourbackend.dto.*;
import com.GoodNeighbour.goodneighbourbackend.model.*;
import com.GoodNeighbour.goodneighbourbackend.repository.UserRepository;

@RestController
public class AuthController {

	@Autowired
    private UserRepository userRepository;


	@PostMapping("/login")
	public String login(@RequestBody LoginRequestDTO requestBody) {
		System.out.println("fuck12===================");

		System.out.println(requestBody.getClass());
		String email = requestBody.getEmail();
        String password = requestBody.getPassword();

		System.out.println(email);
		System.out.println(password);
		User user = new User();
        user.setEmail(email);
        user.setPassword(password);
		System.out.println("check2===================");
        // Save to database
        userRepository.save(user);
		System.out.println(requestBody);
		// System.out.println("check1");
		return "login successfullx";
	}

	@GetMapping("/check")
	public String checkServer(){
		return "check";
	}


}
