package pojo;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@JsonIncludeProperties(value = {"name", "skills"})
public class JsonIncludePropertiesAnnotationPOJOChildClass extends ParentJsonIncludePropertiesAnnotationPOJO {
	
	private String skills;

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
	

}
