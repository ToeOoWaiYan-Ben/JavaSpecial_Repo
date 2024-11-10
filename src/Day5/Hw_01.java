package Day5;

import java.util.Scanner;

public class Hw_01 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VanBooking booking = getBookingDetails();
        boolean response = processBooking(booking);
        if (response) {
            System.out.println("<<<<<Success! Your booking is confirmed>>>>>>  Thank you!!!!!");
        } else {
            System.out.println("!!!!!!Sorry your booking is failed!!!!!!!!. Please try again later :(");
        }
    }

    public static VanBooking getBookingDetails() {
        VanBooking booking = new VanBooking();
        System.out.println("Enter Pickup Your Location: ");
        booking.pickupLocation = scanner.nextLine();
        System.out.println("Enter Time: ");
        booking.time = scanner.nextLine();
        System.out.println("Enter Number of Seats: ");
        booking.numberOfSeats = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        booking.phoneNumber = scanner.nextLine();
        return booking;
    }

    public static boolean processBooking(VanBooking booking) {
        if (booking.pickupLocation.isEmpty() || booking.time.isEmpty()
                || booking.numberOfSeats <= 0 || booking.phoneNumber.isEmpty()) {
            return false;
        }

        if (!booking.pickupLocation.equalsIgnoreCase("Siam")
                && !booking.pickupLocation.equalsIgnoreCase("Mega")) {
            System.out.println("Booking can only be made for 'Siam' or 'Mega'.");
            return false;
        }

        if (booking.numberOfSeats > 20) {
            System.out.println("Seat limit exceeded. Maximum of 20 seats can be booked.");
            return false;
        }

        System.out.println("Booking process completed.");
        return true;
    }

    public static class VanBooking {
        String pickupLocation;
        String time;
        int numberOfSeats;
        String phoneNumber;
    }
}
