package com.rest.racer

class Runner {
	static constraints = { age(min:13) }

	String firstName
	String lastName
	int age

	static belongsTo = Race
}
