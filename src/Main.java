import services.BookingManager;
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
BookingManager manager = new BookingManager();
Scanner scanner = new Scanner(System.in);


System.out.println("=== CampusReserve System ===");


while (true) {
System.out.println("\n1. Add Resource");
System.out.println("2. Add User");
System.out.println("3. Make Booking");
System.out.println("4. View Bookings");
System.out.println("5. Exit");
System.out.print("Choose an option: ");


int choice = scanner.nextInt();
scanner.nextLine();


switch (choice) {
case 1 -> manager.addResource(scanner);
case 2 -> manager.addUser(scanner);
case 3 -> manager.makeBooking(scanner);
case 4 -> manager.viewBookings();
case 5 -> {
System.out.println("Goodbye!");
return;
}
default -> System.out.println("Invalid option!");
}
}
}
}
