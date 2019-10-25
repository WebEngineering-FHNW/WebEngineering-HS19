package webec

class Booking {

    Person booker
    Room   room
    Date   day
    String slot

    static String AM  = "08:15 12:00"
    static String PM1 = "12:15 15:00"
    static String PM2 = "15:15 18:00"
    static List<String> SLOTS = [AM, PM1, PM2]

    static constraints = {
        slot inList: Booking.SLOTS
    }
}
