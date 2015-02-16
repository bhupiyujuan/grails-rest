package com.rest.racer

import grails.converters.JSON

class RunnerController {

	def show = {
		if(params.id && Runner.exists(params.id)){
			render Runner.findById(params.id) as JSON
		}else{
			render Runner.list() as JSON
		}
	}

	def save = {
		def runner = new Runner(params['runner'])

		if(runner.save()){
			render runner as JSON
		}else{
			//handle errors...
		}
	}
}
