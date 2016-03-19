package grailsng

class UrlMappings {

    static mappings = {

        "/api/todos"(resources:"todo")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view: 'index')
        "500"(view: '/application/serverError')
        "404"(view: '/application/notFound')
    }
}