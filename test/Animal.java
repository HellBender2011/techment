package com.techment.test;

public class Animal {

	void shout() {
		System.out.println("animal noises");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Animal a = new Dog();  
		a.shout();  
		Animal b = new Horse();  
		b.shout();  
		Animal c = new Cat();  
		c.shout(); 
		
	}

}

class Dog extends Animal{
	
	void shout() {
		System.out.println("bark");
		}
}

class Horse extends Animal{
	
	void shout() {
		System.out.println("neigh");
		}
}

class Cat extends Animal{
	
	void shout() {
		System.out.println("meow");
		}
}