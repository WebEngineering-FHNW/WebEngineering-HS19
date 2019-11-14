package webec

class BookingController {

    def probiere() {
        // find the last names of all people that booked
        // room named "1.313"
        def booker = Person.findByLastName('Holz')
        def result = Booking.findAllByBooker(booker)*.room
        render text: result.toString()
    }
    static scaffold = Booking
}
