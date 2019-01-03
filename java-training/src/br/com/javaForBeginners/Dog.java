package br.com.javaForBeginners;

public class Dog {

	private String name;;
	private String breed;
	private int height;

	public Dog(String name, String breed, int height) {
		this.name = name;
		this.breed = breed;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void barking() {
		System.out.println(name + " is barking...");
		System.out.println("Bark! Bark! Bark!");
	}
}