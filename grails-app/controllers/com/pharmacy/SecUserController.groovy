package com.pharmacy

import grails.plugin.springsecurity.annotation.Secured

class SecUserController {

    def index() {
		println "HERE in secuser index"
		render "open access"
	}
	
	@Secured(['ROLE_ADMIN'])
	def secadmin() {
		println "HERE in secadmin"
		render "secure admin only"
	}
	
	@Secured(['ROLE_USER'])
	def secuser() {
		println "HERE in secuser user"
//		render "secure user only"
	}
}
