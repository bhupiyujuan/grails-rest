package grails.rest

class QuoteController {

    def index() { 
		redirect(action: home)
	}
	
	def home = {
		render "<h1>Quote bqck to home</h1>"
	}
	
	def list() {
		def list = Quote.list()
		//render list
		render(view:"/quote/quote", model: [quoteList: list])
	}
}
