package pojo;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
// we can not use two json include with the different values on the class level. But we can use multiple json include annotation inside class 
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//@JsonInclude(JsonInclude.Include.NON_NULL)//==>This is better.if we dont want to default value in any field, we use this.
//@JsonInclude(JsonInclude.Include.NON_EMPTY)// if we have any empty collection in pojo we wont see in Json when we print it out
public class Employee {
	
	private String name;
	private int age;
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean isMarried;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String address;
	private String mobNum;
	private List<String> skillSet;
	private Map<String, String> familyMember;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public List<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}
	public Map<String, String> getFamilyMember() {
		return familyMember;
	}
	public void setFamilyMember(Map<String, String> familyMember) {
		this.familyMember = familyMember;
	}
	
	

}
