package com.pharmacy.store



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PharmacyController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Pharmacy.list(params), model:[pharmacyInstanceCount: Pharmacy.count()]
    }

    def show(Pharmacy pharmacyInstance) {
        respond pharmacyInstance
    }

    def create() {
        respond new Pharmacy(params)
    }

    @Transactional
    def save(Pharmacy pharmacyInstance) {
        if (pharmacyInstance == null) {
            notFound()
            return
        }

        if (pharmacyInstance.hasErrors()) {
            respond pharmacyInstance.errors, view:'create'
            return
        }

        pharmacyInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'pharmacy.label', default: 'Pharmacy'), pharmacyInstance.id])
                redirect pharmacyInstance
            }
            '*' { respond pharmacyInstance, [status: CREATED] }
        }
    }

    def edit(Pharmacy pharmacyInstance) {
        respond pharmacyInstance
    }

    @Transactional
    def update(Pharmacy pharmacyInstance) {
        if (pharmacyInstance == null) {
            notFound()
            return
        }

        if (pharmacyInstance.hasErrors()) {
            respond pharmacyInstance.errors, view:'edit'
            return
        }

        pharmacyInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Pharmacy.label', default: 'Pharmacy'), pharmacyInstance.id])
                redirect pharmacyInstance
            }
            '*'{ respond pharmacyInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Pharmacy pharmacyInstance) {

        if (pharmacyInstance == null) {
            notFound()
            return
        }

        pharmacyInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Pharmacy.label', default: 'Pharmacy'), pharmacyInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'pharmacy.label', default: 'Pharmacy'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
