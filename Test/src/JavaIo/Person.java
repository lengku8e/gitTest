package JavaIo;

import java.io.Serializable;

public class Person implements Serializable {

	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public Person(String name,int age){
		this.age = age;
		this.name = name;

	}
}
