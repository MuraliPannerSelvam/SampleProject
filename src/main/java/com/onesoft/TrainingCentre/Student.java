package com.onesoft.TrainingCentre;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class Student {
	
	public Student() {
		System.out.println("This is Student Class");
	}
	
	private String name1;
	private String name2;
	
	@Value("Murali")
	public void setName1(String name1) {
		this.name1=name1;
	}
	

	@Value("Vijay")
	public void setName2(String name2) {
		this.name2=name2;
	}

	@Override
	public String toString() {
		return "Student [name1=" + name1 + ", name2=" + name2 + "]";
	}
	

}
