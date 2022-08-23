package serializationDeserialization;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjetToJsonObjectDESERIAZTION {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String jsonResponseString = "{\r\n"
				+ "    \"name\": \"Sam\",\r\n"
				+ "    \"age\": 43\r\n"
				+ "  }";
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Person person =  objectMapper.readValue(jsonResponseString, Person.class);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		// we can also use MAP
		
		Map<String, Object> personMap = objectMapper.readValue(jsonResponseString, Map.class);
		System.out.println(personMap.get("name")); // as long as we use map we can use the key to get output of the value
	}

}
