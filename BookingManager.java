package pk1;

import java.util.HashMap;
import java.util.Map;

public class BookingManager {
    private static final int MAX_BOOKINGS = 20;
    private Map<String, Integer> packageBookings;

    public BookingManager() {
        packageBookings = new HashMap<>();
    }

    public boolean canBook(TourPackage tourPackage) {
        return packageBookings.getOrDefault(tourPackage.getPackageName(), 0) < MAX_BOOKINGS;
    }

    public void addBooking(TourPackage tourPackage) {
        String packageName = tourPackage.getPackageName();
        packageBookings.put(packageName, packageBookings.getOrDefault(packageName, 0) + 1);
    }

    public void displayBookingStatus(TourPackage tourPackage) {
        int count = packageBookings.getOrDefault(tourPackage.getPackageName(), 0);
        if (count >= MAX_BOOKINGS) {
            System.out.println("Booking is FULL for the package: " + tourPackage.getPackageName());
        } else {
            System.out.println("Bookings available for the package: " + tourPackage.getPackageName() +
                               " (Current bookings: " + count + ")");
        }
    }
}
