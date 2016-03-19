package grailsng

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

@Secured(['ROLE_ADMIN'])
class TodoController extends RestfulController {

    static responseFormats = ['json']

    TodoController() {
        super(Todo)
    }

    def pending() {
        respond Todo.findAllByCompleted(false), view: 'index'
    }
}
