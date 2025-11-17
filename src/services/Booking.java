package services;
String id = sc.nextLine();
System.out.print("Enter user name: ");
String name = sc.nextLine();
users.add(new User(id, name));
System.out.println("User added!");
}


public void addResource(Scanner sc) {
System.out.print("Enter resource ID: ");
String id = sc.nextLine();
System.out.print("Enter resource name: ");
String name = sc.nextLine();
resources.add(new Resource(id, name));
System.out.println("Resource added!");
}


public void makeBooking(Scanner sc) {
System.out.print("Enter user ID: ");
String userId = sc.nextLine();


User user = users.stream()
.filter(u -> u.getId().equals(userId))
.findFirst().orElse(null);


if (user == null) {
System.out.println("User not found!");
return;
}


System.out.print("Enter resource ID: ");
String resId = sc.nextLine();


Resource resource = resources.stream()
.filter(r -> r.getId().equals(resId))
.findFirst().orElse(null);


if (resource == null) {
System.out.println("Resource not found!");
return;
}


System.out.print("Enter time slot (e.g., 10AM-12PM): ");
String slot = sc.nextLine();


boolean exists = bookings.stream().anyMatch(b ->
b.getResource().getId().equals(resId) && b.getTimeSlot().equals(slot)
);


if (exists) {
System.out.println("⚠ Resource already booked for that time!");
return;
}


bookings.add(new Booking(user, resource, slot));
System.out.println("Booking successful!");
}


public void viewBookings() {
if (bookings.isEmpty()) {
System.out.println("No bookings yet.");
return;
}


bookings.forEach(System.out::println);
}
}
