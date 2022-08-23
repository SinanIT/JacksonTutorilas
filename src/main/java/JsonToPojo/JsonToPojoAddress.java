package JsonToPojo;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Address;

public class JsonToPojoAddress {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Address address= objectMapper.readValue(new File("C:\\Users\\sinan\\OneDrive\\EclipsProjects\\"
				+ "JacksonTutorilas\\src\\test\\resources\\Payloads\\address.json"), Address.class);
		
		System.out.println(address.getCity());//Cary
		address.setCity("Los Angeles");//Los Angeles
		System.out.println(address.getCity());
		
		String updatedJSon1= objectMapper.writeValueAsString(address);
		System.out.println(updatedJSon1);//{"no":102,"streetName":"Creighton","city":"Los Angeles","state":"NC","country":"USA"}

		updatedJSon1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address);
		System.out.println(updatedJSon1);
						/*
						{
						  "no" : 102,
						  "streetName" : "Creighton",
						  "city" : "Los Angeles",
						  "state" : "NC",
						  "country" : "USA"
						} 
						*/
		
	}

}
