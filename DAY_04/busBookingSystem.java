import java.util.ArrayList;
import java.util.Scanner;

public class busBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus("MH 13 AB 4884", 10));
        buses.add(new Bus("MH 13 XZ 1484", 10));

        int choice = 1;

        while (choice == 1) {
            System.out.println("/t***** Bus Booking System ****** /n");
            System.out.println("Enter 1: View Buses /n Enter 2: Book Seats /n Enter 3: View Bookings /n Press 0: Exit");
            System.out.println();
            System.out.print("Enter Your Choice: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    for (Bus b : buses) {
                        b.displayBusDetails();
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Passanger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String contact = sc.nextLine();
                    System.out.print("Enter Your Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter BusNo: ");
                    String busNo = sc.nextLine();

                    Booking booking = new Booking(name, contact, age, busNo);
                    if (booking.isAvaliable(bookings, buses)) {
                        bookings.add(booking);
                        System.out.println("Booked!");
                    } else {
                        System.out.println("Sorry Seats are Booked!");
                    }
                    break;

                case 3:
                    for (Booking b : bookings) {
                        System.out.println("Your Details: \n" + b.getName() + "/n" + b.getContact() + "/n" + b.getAge()
                                + "/n" + b.getBusNo());
                    }
                    break;
                
                case 0: 
                    choice = 0;
                    sc.close();
                break;
                default:
                    System.out.println("Invaild Option!");

            }
        }
    }
}
