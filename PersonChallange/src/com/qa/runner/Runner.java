package com.qa.runner;

import com.qa.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Person person = new Person();
		Person edward = new Person("Edward", 23, "Plumber");
		Person gorgia = new Person("Georgia", 18, "Streer artist");
		Person lily = new Person("Lily", 33, "Accountant");
		Person emmett = new Person("Emmett", 41, "Actor");
		Person oscar = new Person("Oscar", 51, "Carpenter");

		List<Person> list = new ArrayList<>();
		list.add(emmett);
		list.add(edward);
		list.add(oscar);
		list.add(lily);
		list.add(gorgia);

		list.stream()
        .forEach(x -> System.out.println(x));
		
		person.nameSearch(list, "Lily");
		

	}
}
