package webec

//import grails.plugin.springsecurity.annotation.Secured

//@Secured('ROLE_USER') // when using annotations
class BookingController {

    def probiere() {
        // find the last names of all people that booked
        // room named "1.313"
        def booker = Person.findByLastName('Holz')
        def result = Booking.findAllByBooker(booker)*.room
        respond result
    }

    static scaffold = Booking
}
