package com.GoodNeighbour.GoodNeighbourBackend;


import org.springframework.web.bind.annotation.*;
import com.GoodNeighbour.dto.*;
import com.GoodNeighbour.model.*;

@RestController
public class AuthController {

	@PostMapping("/login")
	public String login(@RequestBody LoginRequestDTO requestBody) {
		String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

		User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        // Save to database
        userRepository.save(user);
		System.out.println(requestBody);
		return "login successfull";
	}


}
