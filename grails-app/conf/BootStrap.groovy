import com.bookstore.auth.Requestmap
import com.bookstore.auth.Role
import com.bookstore.auth.User
import com.bookstore.auth.UserRole

class BootStrap {

      def init = { servletContext ->
	      //new user bootstrap help: http://grails-plugins.github.io/grails-spring-security-core/guide/tutorials.html#usingControllerAnnotations [section: 7]

	      //request-map bootstrap help: http://grails-plugins.github.io/grails-spring-security-core/guide/requestMappings.html#requestmapInstances
      }
      
      def destroy = {
      }
}
