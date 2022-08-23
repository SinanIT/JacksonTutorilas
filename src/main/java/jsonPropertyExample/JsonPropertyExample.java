package jsonPropertyExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Book;

public class JsonPropertyExample {

	public static void main(String[] args) throws JsonProcessingException {


		Book book = new Book();
		book.setBookName("Data Structure");
		book.setAuthorName("Jony Cash");
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String book1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		
		System.out.println(book1);
		
		Book book2 = objectMapper.readValue(book1, Book.class);
		System.out.println(book2.getAuthorName());
		System.out.println(book2.getBookName());
		

	}

}
