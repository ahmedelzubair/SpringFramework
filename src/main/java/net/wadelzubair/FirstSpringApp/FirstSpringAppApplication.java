package net.wadelzubair.FirstSpringApp;

import net.wadelzubair.FirstSpringApp.model.Author;
import net.wadelzubair.FirstSpringApp.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("test");
		Author author = new Author();
		author.setFirstName("Ahmed");
		SpringApplication.run(FirstSpringAppApplication.class, args);

	}

}
