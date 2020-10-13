package gr.school.proj;

import java.util.Scanner;

public class Student {
	
Scanner sc = new Scanner(System.in);
	
	private int id ;
	private String name ; 
	private int birth;
	static int count = 0;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int  getBirthyear() {
		return birth;
	}

	public void setBirthyear(int birthyear) {
		this.birth = birth;
	}

	public Student( String name, int birth) {
		count++;
		this.id = count;
		this.name = name;
		this.birth = birth;
	}

	

	@Override
	public String toString() {
		
		return "Name: " + name + "  id: " + id + "  birthyear: " + birth;
	}
	

}
