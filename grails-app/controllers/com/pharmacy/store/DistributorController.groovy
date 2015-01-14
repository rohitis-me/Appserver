package com.pharmacy.store



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DistributorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Distributor.list(params), model:[distributorInstanceCount: Distributor.count()]
    }

    def show(Distributor distributorInstance) {
        respond distributorInstance
    }

    def create() {
        respond new Distributor(params)
    }

    @Transactional
    def save(Distributor distributorInstance) {
        if (distributorInstance == null) {
            notFound()
            return
        }

        if (distributorInstance.hasErrors()) {
            respond distributorInstance.errors, view:'create'
            return
        }

        distributorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'distributor.label', default: 'Distributor'), distributorInstance.id])
                redirect distributorInstance
            }
            '*' { respond distributorInstance, [status: CREATED] }
        }
    }

    def edit(Distributor distributorInstance) {
        respond distributorInstance
    }

    @Transactional
    def update(Distributor distributorInstance) {
        if (distributorInstance == null) {
            notFound()
            return
        }

        if (distributorInstance.hasErrors()) {
            respond distributorInstance.errors, view:'edit'
            return
        }

        distributorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Distributor.label', default: 'Distributor'), distributorInstance.id])
                redirect distributorInstance
            }
            '*'{ respond distributorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Distributor distributorInstance) {

        if (distributorInstance == null) {
            notFound()
            return
        }

        distributorInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Distributor.label', default: 'Distributor'), distributorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'distributor.label', default: 'Distributor'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
