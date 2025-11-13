import java.util.ArrayList;

public class Booking {
    private String name;
    private String contact;
    private int age;
    private String busNo;

    public Booking(String name, String contact, int age, String busNo) {
        this.name = name;
        this.contact = contact;
        this.age = age;
        this.busNo = busNo;
    }

    public boolean isAvaliable(ArrayList<Booking> bookings , ArrayList<Bus> buses){
        int booked = 0; 
        int capacity = 0;

        for(Bus bus:buses){
            if(bus.getBusNo() == this.busNo){
                capacity = bus.getCapacity(capacity);
            }
        }

        for(Booking b : bookings){
            if(b.busNo == this.busNo){
                booked++;
            }
        }
        return booked < capacity ;
    }

    public String getBusNo(){
        return busNo;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public int getAge(){
        return age;
    }

}
