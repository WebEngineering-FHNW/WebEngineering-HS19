package webec

import org.codehaus.groovy.runtime.DateGroovyMethods

class BootStrap {

    def init = { servletContext ->

        Person dierk  = new Person(firstName: "Dierk", lastName: "König").save(failOnError:true)
        Person dieter = new Person(firstName: "Dieter", lastName: "Holz").save(failOnError:true)

        Room oben  = new Room(name:"1.313", capacity: 60).save(failOnError:true)
        Room unten = new Room(name:"5.2B16", capacity: 6).save(failOnError:true)


        Date today = new Date();

        for (int i=0; i<100; i++) {
            new Booking(booker: dierk, room: oben, day: today, slot: Booking.AM).save(failOnError:true)
        }

        new Booking(booker: dierk, room: oben, day: today, slot: Booking.AM).save(failOnError:true)


    }
    def destroy = {
    }
}
