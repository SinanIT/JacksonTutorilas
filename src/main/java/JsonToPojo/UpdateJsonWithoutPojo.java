package JsonToPojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UpdateJsonWithoutPojo {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> address= objectMapper.readValue(new File("C:\\Users\\sinan\\OneDrive\\EclipsProjects\\"
				+ "JacksonTutorilas\\src\\test\\resources\\Payloads\\address.json"), new TypeReference<Map<String,Object>>(){});
		
		System.out.println(address.get("city"));
		
		address.put("city", "Los Angeles");
		address.put("Zip", "12345");
		address.remove("no");
		
		String addressString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(addressString);
		
		
	}

}
