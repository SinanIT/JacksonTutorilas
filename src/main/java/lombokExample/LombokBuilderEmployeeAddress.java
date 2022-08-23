package lombokExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LombokBuilderEmployeeAddress {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		LombokBuilder employee = LombokBuilder.builder()
							.name("Sam")
							.lastName("Deger")
							.age(43).build(); // if we want to update value of lonbok class data we need to ad a property to @Builder tag==> (toBuilder= true)
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee));
		
		LombokBuilder employee1 = employee.toBuilder()
				.name("Sinan")
				.lastName("Degerli").build();
		
		System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1));

	}

}
