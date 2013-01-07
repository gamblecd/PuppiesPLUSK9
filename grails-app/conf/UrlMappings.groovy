class UrlMappings {

	static mappings = {
        "/" {
            controller = "web"
            action = "index"
         }
        "/$action?" {
            controller="web"
        }
        
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        
        "403"(controller:"error", action:"forbidden")
        "404"(controller:"error", action:"notFound")
        
        "500"(controller: "error", action:"serverError")
        "503"(controller:"error", action:"serverError")
	}
}
