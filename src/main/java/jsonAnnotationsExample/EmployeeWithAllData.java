package jsonAnnotationsExample;

import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Employee;

public class EmployeeWithAllData {

	public static void main(String[] args) throws JsonProcessingException {
		
		Employee employee = new Employee();
		employee.setName("Sam");
		employee.setAge(0);
		//employee.setAddress("NC");
		employee.setMarried(false);
		//employee.setMobNum("1213342423");
		employee.setSkillSet(new ArrayList<>());// "skillSet" : [ ],
		employee.setFamilyMember(new HashMap<String, String>());// "familyMember" : { },
		
		ObjectMapper objectMapper = new ObjectMapper();
		String empJsonFormat = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		
		//If i don't use @JsonInclude(JsonInclude.Include.NON_DEFAULT) in POJO will see in output keys with default values.
		System.out.println(empJsonFormat);
	}
}
