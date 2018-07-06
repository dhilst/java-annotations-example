package com.example;

import com.example.annotations.Greetings;

class Annotated {
	@Greetings
	public void someMethod() {}

	@Greetings(message="Ola mundo")
	public void anotherMethod() {}
}
