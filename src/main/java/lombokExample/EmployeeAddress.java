package lombokExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeAddress {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		Employee employee = new Employee();
		
		employee.setName("Sam");
		employee.setLastName("DEGER");
		employee.setAge(43);
		
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee));
		

	}

}
