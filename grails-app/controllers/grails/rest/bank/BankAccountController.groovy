package grails.rest.bank

import static groovyx.net.http.ContentType.JSON
import static groovyx.net.http.Method.GET
import grails.converters.JSON
import groovyx.net.http.RESTClient

class BankAccountController {
	
	def bankAccountService

	def index() {
		def bankAccounts = bankAccountService.getBankAccounts(params)
		//render bankAccounts
		render(view: "/bankAccount/index", model: [message: "Request sent" , bankAccounts: bankAccounts]);
	}
	
	def show(){
		redirect('/bankAccount/index')
	}
}
