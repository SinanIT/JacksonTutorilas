package jsonAnnotationsExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.JsonIncludePropertiesAnnotationPOJOChildClass;

public class JsonIncludePropertiesAnotation {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonIncludePropertiesAnnotationPOJOChildClass employee1 = new JsonIncludePropertiesAnnotationPOJOChildClass();// this class extends ParentJsonInc...
		employee1.setName("Sam");
		employee1.setAge(0);
		employee1.setAddress("NC");
		employee1.setMarried(true);
		employee1.setMobNum("1213342423");
		employee1.setSkills("Java");
		
		ObjectMapper objectMapper = new ObjectMapper();
		String empJsonFormat = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		
		//If i don't use @JsonInclude(JsonInclude.Include.NON_DEFAULT) in POJO will see in output keys with default values.
		System.out.println(empJsonFormat);
	}
}
