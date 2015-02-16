package com.rest.racer

class Race {
	String name
	double distance

	static hasMany = [runners:Runner]
}
