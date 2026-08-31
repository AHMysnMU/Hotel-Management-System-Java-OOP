public class SuiteRoom extends Room {

    private final String[] amenities;

    // set the room type and add amenities
    public SuiteRoom (double price, String[] amenities){
        super("Suite", price);
        this.amenities = amenities;
    }

    // get type of the room
    public String getType(){
        return "Suite";
    }

    // get the String value of the amenities as a list
    public String getAmenities(){
        String s = "Amenities: ";
        for (int i = 0; i < amenities.length ; i++) {
            s += amenities[i];
            if(i == amenities.length - 1)
                continue;
            s+= " / ";
        }
        return s;
    }

    // display the list of the amenities
    public void listAmenities(){
        System.out.println(getAmenities());
    }

    // suite room info (class definition)
    @Override
    public String toString(){
        return super.toString() +
               "\n\t-" + getAmenities() + "\n\n";
    }

}
