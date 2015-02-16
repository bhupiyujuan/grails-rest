import grails.rest.Quote

class BootStrap {

    def init = { servletContext ->
		if (!Quote.count()) {
			new Quote(quotePrice: "23.5", name: "HSBC").save(failOnError: true)
			new Quote(quotePrice: "50", name: "EPAM").save(failOnError: true)
		}
    }
    def destroy = {
    }
}
