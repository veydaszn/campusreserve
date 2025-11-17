package models;


public class Booking {
private User user;
private Resource resource;
private String timeSlot;


public Booking(User user, Resource resource, String timeSlot) {
this.user = user;
this.resource = resource;
this.timeSlot = timeSlot;
}


public User getUser() { return user; }
public Resource getResource() { return resource; }
public String getTimeSlot() { return timeSlot; }


@Override
public String toString() {
return user.getName() + " booked " + resource.getName() + " at " + timeSlot;
}
}
