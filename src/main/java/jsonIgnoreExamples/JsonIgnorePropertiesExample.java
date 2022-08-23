package jsonIgnoreExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.ParentJsonIncludePropertiesAnnotationPOJO;

public class JsonIgnorePropertiesExample {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
//		String jsonString= "{\r\n"
//				+ "    \"name\": \"Sam\",\r\n"
//				+ "    \"age\": 43,\r\n"
//				+ "    \"married\": true,\r\n"
//				+ "    \"address\": \"NC\",\r\n"
//				+ "    \"mobNum\": \"12332156465\"\r\n"
//				+ "  }";
//		
//		ObjectMapper objectMapper = new ObjectMapper();
//		ParentJsonIncludePropertiesAnnotationPOJO obj1= objectMapper.readValue(jsonString, ParentJsonIncludePropertiesAnnotationPOJO.class);
//		System.out.println(obj1.getName());
//		System.out.println(obj1.getAge());
//		System.out.println(obj1.isMarried());
//		System.out.println(obj1.getAddress());
//		System.out.println(obj1.getMobNum());
//		
		String jsonString= "{\r\n"
				+ "    \"name\": \"Sam\",\r\n"
				+ "    \"age\": 43,\r\n"
				+ "    \"skills\" : \"java\"\r\n"
				+ "  }";
		
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		ParentJsonIncludePropertiesAnnotationPOJO obj1= objectMapper.readValue(jsonString, ParentJsonIncludePropertiesAnnotationPOJO.class);
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.isMarried());
		System.out.println(obj1.getAddress());
		System.out.println(obj1.getMobNum());

		
		
		
		

	}

}
