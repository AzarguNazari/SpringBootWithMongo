package com.example.springbootmongo;

import com.example.springbootmongo.model.Post;
import com.example.springbootmongo.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongoApplication implements ApplicationRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootMongoApplication.class);

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Post post = new Post("About computer", "Computer is one of the most importan thign", "technology", 3);

		postRepository.save(post);

		LOGGER.debug("New post is added {}", postRepository.count());
	}
}
