import com.pharmacy.user.SecRole
import com.pharmacy.user.SecUser
import com.pharmacy.user.SecUserSecRole

class BootStrap {

    def init = { servletContext ->
//		def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(flush: true)
//		def userRole = new SecRole(authority: 'ROLE_USER').save(flush: true)
//  
//		def testAdmin = new SecUser(username: 'admin', password: 'admin')
//		def testUser = new SecUser(username: 'user', password: 'user')
//		
//		testUser.save(flush: true)
//		testAdmin.save(flush: true)
//  
//		SecUserSecRole.create testUser, userRole, true
//		SecUserSecRole.create testAdmin, adminRole, true
//		  
//		println "SecUser.count() "+SecUser.count()+" SecRole.count() "+SecRole.count()+" SecUserSecRole.count() "+SecUserSecRole.count()
		
//		def bill = new Billing(billingId: 1, billingNumber: 1, )
		
    }
    def destroy = {
    }
}
