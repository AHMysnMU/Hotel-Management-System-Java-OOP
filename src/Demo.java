public class Demo {

    public static void main() {

        // create hotel object
        Hotel h = new Hotel(4,4);

        // create two guest object
        Guest g1 = new Guest("Ali", "Yasine", 9099090);
        Guest g2 = new Guest("Fatima", "alaa", 786328);
        h.addGuest(g1);
        h.addGuest(g2);

        // create three rooms
        Room r1 = new StandardRoom(50);
        Room r2 = new StandardRoom(99);
        Room r3 = new SuiteRoom(200, new String[] {"Bed","carpets","hoover"});
        h.addRoom(r1);
        h.addRoom(r2);
        h.addRoom(r3);

        // list available room
        System.out.println("\nAVAILABLE ROOMS:");
        System.out.print(r1);
        System.out.print(r2);
        System.out.print(r3);

        printLine();

        // book room for guests
        h.bookroom(g1.getGuestID(), r1.getRoomNumber());
        h.bookroom(g2.getGuestID(), r3.getRoomNumber());
        h.bookroom(4, r2.getRoomNumber());

        printLine();

        // list available room after booking
        System.out.println("\nAVAILABLE ROOMS AFTER BOOKING:");
        System.out.print(r1);
        System.out.print(r2);
        System.out.print(r3);

        printLine();

        // check in guests
        h.checkIn(g1.getGuestID());
        h.checkIn(g2.getGuestID());

        printLine();

        // cancel booking
        h.cancelBooking(g1.getGuestID());
        h.checkIn(g1.getGuestID());

        printLine();

        // list available room after cancellation
        System.out.println("AVAILABLE ROOMS AFTER CANCELLATION:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);



    }

    // add line between tasks
    private static void printLine(){
        System.out.println("\n\n-----------------------------------------------------------\n\n");
    }
}
