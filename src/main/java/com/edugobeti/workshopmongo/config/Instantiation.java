package com.edugobeti.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.edugobeti.workshopmongo.domain.User;
import com.edugobeti.workshopmongo.repository.UserRepository;

@Configuration

public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Bronw", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		User alice = new User(null, "Alice Pink", "alice@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, alice));
	}

}
