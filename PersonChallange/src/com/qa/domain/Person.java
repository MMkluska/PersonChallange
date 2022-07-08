package com.qa.domain;

import java.util.List;

public class Person {

	private String name;
	private int age;
	private String job;

	// Constructors
	public Person() {

	}

	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}

	// Getters and Setters
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", age: " + age + ", job: " + job +"\n";
	}

	// Methods

	public void nameSearch(List<Person> list, String name) {
		for (Person p : list) {
			if (p.getName().equals(name)) {
				System.out.println(p);
			}
		}
	}

}
