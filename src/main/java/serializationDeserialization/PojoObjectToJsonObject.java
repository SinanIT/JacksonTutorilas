package serializationDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PojoObjectToJsonObject { 
	
	public static void main(String[] args) throws JsonProcessingException {
		//SERILIAZATION
		Person person = new Person();
		person.setName("Sam");
		person.setAge(43);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String jsonString=  objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
		System.out.println(jsonString);
	}

}
