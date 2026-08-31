public abstract class Room {

    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isAvailable;
    private int bookedGuestID;

    private static int count = 1;


    // the first look of the room before any booking
    public Room(){
        setBookedGuestID(-1);
        setAvailability(true);

        setRoomNumber(count);
        count++;
    }
    // add room details
    public Room(String roomType, double price){
        this();
        setRoomType(roomType);
        setPrice(price);
    }


    // getter/setter for room number
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // getter/setter for room type
    public abstract String getType(); // should define in the child classes
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // getter/setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // getter/setter for availability
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailability(boolean available) {
        isAvailable = available;
    }

    // getter/setter for booked guestID
    public int getBookedGuestID() {
        return bookedGuestID;
    }
    public void setBookedGuestID(int bookedGuestID) {
        this.bookedGuestID = bookedGuestID;
    }

    // book this room to a specific guest with a unique id and set it as unvailable
    public void bookroom(int guestID){
         setAvailability(false);
         setBookedGuestID(guestID);
    }

    // room info (class definition)
    public String toString(){
        return "Room "+ getRoomNumber() +": " +
               "\n\t-number: " + getRoomNumber() +
               "\n\t-Type: " + getType() +
               "\n\t-Price: " + getPrice() +
               "\n\t-" + (isAvailable() ? "Available" : "Not Available");
    }



















}
