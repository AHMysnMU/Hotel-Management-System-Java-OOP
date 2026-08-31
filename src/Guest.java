public class Guest {

    private int guestID;
    private static int count = 1;

    private String firstName;
    private String lastName;
    private int phone;


    // create guests id
    public Guest(){
        setGuestID(count);
        count++;
    }
    // add guests info
    public Guest(String firstName, String lastName, int phone){
        this();
        setName(firstName, lastName);
        setPhone(phone);
    }

    // getter/setter for guestID
    public int getGuestID() {
        return guestID;
    }
    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    // getter/setter for full and last name
    public String getName() {
        return firstName + " " + lastName;
    }
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // getter/setter for phone number
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    // guest info (class definition)
    public String toString(){
        return "Name: " + getName() +
               "\nPhone Number: " + getPhone() +
                "\nGuest ID: " + getGuestID() + " " ;
    }



}
