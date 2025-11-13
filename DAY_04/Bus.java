public class Bus{
    private String busNo;
    private int capacity;

    public Bus(String busNo,int capacity){
        this.busNo = busNo;
        this.capacity = capacity;
    }
    public String getBusNo() {
        return busNo;
    }
    public int getCapacity(int capacity) {
        return capacity;
    }


    public void displayBusDetails() {
        System.out.println("Bus Number: " + busNo);
        System.out.println("Capacity: " + capacity);
    }
}

