package com.lambdaexpressions;

interface Greeting {
	
	public void sayHello(String name);
}

public class GreetingExample {
	public static void main(String[] args) {
		/*Greeting greeting = new Greeting() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("Hello "+name+"!!!");
			}
		};*/
		Greeting greeting = (name) -> System.out.println("Hi "+name);
		greet(greeting, "Naina");
		greet(n-> System.out.println("Hi "+ n),"Bharath");
	}
	private static void greet(Greeting greeting,String name) {
		greeting.sayHello(name);
	}
}