class UrlMappings {

	static mappings = {
		//"/bankAccount/index"(controller: "BankAccount", view: "index")
	//}
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
	
	/*static mappings = {
		"/$controller/$id?"{
			action = [GET:"show", POST:"save", PUT:"update", DELETE:"remove"]
		}
		"/"(view:"/index")
		"500"(view:'/error')
	}
	*/
}
