package com.GoodNeighbour.GoodNeighbourBackend;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.GoodNeighbour.dto.*;
import com.GoodNeighbour.model.*;
import com.GoodNeighbour.repository.UserRepository;

@RestController
public class AuthController {

	@Autowired
    private UserRepository userRepository;


	@PostMapping("/login")
	public String login(@RequestBody LoginRequestDTO requestBody) {
		String email = requestBody.getEmail();
        String password = requestBody.getPassword();

		User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        // Save to database
        userRepository.save(user);
		System.out.println(requestBody);
		return "login successfull";
	}


}
