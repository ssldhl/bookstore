import com.bookstore.auth.Requestmap

class BootStrap {

    def init = { servletContext ->
        /*for (String url in [
              '/', '/index', '/index.gsp', '*//**//*favicon.ico',
              '/assets*//**', '*//**//*js*//**', '*//**//*css*//**', '*//**//*images*//**',
              '/login', '/login.*', '/login*//*',
              '/logout', '/logout.*', '/logout*//*']) {
            new Requestmap(url: url, configAttribute: 'permitAll').save()
        }
        new Requestmap(url: '/profile*//**',    configAttribute: 'ROLE_USER').save()
        new Requestmap(url: '/admin*//**',      configAttribute: 'ROLE_ADMIN').save()
        new Requestmap(url: '/admin/role*//**', configAttribute: 'ROLE_SUPERVISOR').save()
        new Requestmap(url: '/admin/user*//**', configAttribute: 'ROLE_ADMIN,ROLE_SUPERVISOR').save()
        new Requestmap(url: '/j_spring_security_switch_user',
              configAttribute: 'ROLE_SWITCH_USER,isFullyAuthenticated()').save()*/
    }
    def destroy = {
    }
}
