package webec

import grails.util.Environment
import org.codehaus.groovy.runtime.DateGroovyMethods

class BootStrap {

    SecService secService; // injected, use a service to enforce transaction handling

    def init = { servletContext ->

        if(Environment.current != Environment.DEVELOPMENT) { // guard clause
            return ;
        }

        Person dierk  = new Person(firstName: "Dierk", lastName: "König").save(failOnError:true)
        Person dieter = new Person(firstName: "Dieter", lastName: "Holz").save(failOnError:true)

        Room oben  = new Room(name:"1.313", capacity: 60).save(failOnError:true)
        Room unten = new Room(name:"5.2B16", capacity: 6).save(failOnError:true)

        use(DateGroovyMethods) {
            Date today = new Date().clearTime();

            for (int i=0; i<100; i++) {
                new Booking(booker: dierk, room: oben, day: today + i, slot: Booking.AM).save(failOnError:true)
            }

            new Booking(booker: dieter, room: oben, day: today, slot: Booking.AM).save(failOnError:true)

        }

        SecRole adminRole = new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true);
        SecRole userRole  = new SecRole(authority: 'ROLE_USER').save(failOnError: true);

        SecUser secDieter = new SecUser(username:'xx', password: 'xx', person: dieter).save(failOnError: true);

        secService.create(secDieter, userRole);

        println "*** security user-roles: " + SecUserSecRole.count()

    }
    def destroy = {
    }
}
