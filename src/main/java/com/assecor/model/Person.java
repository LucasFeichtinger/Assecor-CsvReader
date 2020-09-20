package com.assecor.model;

public class Person {

	private String name;
	private String lastName;
	private String city;
	private String color;

	public Person(String name, String lastName, String city, String color) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.city = city;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ",  lastName=" + lastName + ", city=" + city + ", color=" + color + "]";
	}

}
