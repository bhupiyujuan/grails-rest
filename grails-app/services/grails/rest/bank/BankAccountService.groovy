package grails.rest.bank

import grails.transaction.Transactional

@Transactional
class BankAccountService {
	
	def secureJsonHttpRequest;

    def getBankAccounts(params){
		//return secureJsonHttpRequest.getHttpResponse(createPath(params))
		return secureJsonHttpRequest.getJsonHttpBuilderResponse()
	}
	
	def createPath(params){
		return "/bankAccountView/a"
	}
}
