public class Hotel implements Reservation{

    private final Room[] rooms;     // array that store rooms
    private int roomCount;      // number of rooms added

    private final Guest[] guests;       // array that store guests
    private int guestCount;         // number of guests added


    // initialize the array with a fixed size
    public Hotel(int roomNB, int guestNB){
        rooms = new Room[roomNB];
        guests = new Guest[guestNB];

        roomCount = 0;
        guestCount = 0;
    }


    // to add room to the array
    public void addRoom (Room room){
        if(roomCount < rooms.length){
            rooms[roomCount] = room;
            roomCount++;
        }
        else
            System.out.println("\nCan't Add More Rooms!\n");
    }


    // to add guest to the array
    public void addGuest (Guest guest){
        if(guestCount < guests.length){
            guests[guestCount] = guest;
            guestCount++;
        }
        else
            System.out.println("\nCan't Add More Guests!\n");
    }


    // find an available room with a specific type
    public Room findAvailableRoom (String type){
        for (int i = 0; i < roomCount; i++) {
            if(rooms[i].getType().equals(type)){
                if(rooms[i].isAvailable()) {
                    return rooms[i];
                }
            }
        }
        return null;
    }


    // book a specific room to a specific guest
    public void bookroom (int guestID, int roomID){
        if( (roomID < 1 || roomID > roomCount) || (guestID < 1 || guestID > guestCount) ){
            System.out.println("\nInvalid Room ID or Guest ID!\n");
            return;
        }

        if(!rooms[roomID-1].isAvailable()){
            System.out.println("Unavailable Room");
            return;
        }

        rooms[roomID-1].bookroom(guestID);
    }


    // cancel a booking for a specific guest
    public void cancelBooking (int guestID){
        if(NotAvailableGuestId(guestID))
            return;

        for (int i = 0; i < roomCount; i++) {
            if (rooms[i].getBookedGuestID() == guestID) {
                rooms[i].setAvailability(true);
                rooms[i].setBookedGuestID(-1);
                System.out.println("\nBooking cancelled for " + getGuestName(guestID) + "\n");
                return;
            }
        }
        System.out.println("\nBooking Doesn't Found!\n");
    }


    // find the room of a specific guest if exist
    public void checkIn(int guestID){
        if(NotAvailableGuestId(guestID))
            return;

        for (int i = 0; i < roomCount; i++) {
            if(rooms[i].getBookedGuestID()==guestID) {
                System.out.println("\n" + getGuestName(guestID) + " Checked into Room " + rooms[i].getRoomNumber() + "\n");
                return;
            }
        }
        System.out.println("\nDoesn't Have A Booked Room!\n");
    }


    // get guest name by his id
    public String getGuestName (int guestID){
        if(NotAvailableGuestId(guestID))
            return null;

        return guests[guestID-1].getName();
    }


    // check if the entered id is available44›
    private boolean NotAvailableGuestId(int guestID){
        if((guestID < 1|| guestID > guestCount)){
            System.out.println("\nWrong ID!\n");
            return true;
        }
        return false;
    }



}
