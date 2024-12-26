package pk1;

import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        try {
            // Step 1: Read Input File
            BufferedReader reader = new BufferedReader(new FileReader("input1.txt"));
            List<Tourist> tourists = new ArrayList<>();
            List<TourPackage> packages = new ArrayList<>();
            BookingManager bookingManager = new BookingManager();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                
                // Extract details from the file
                String touristName = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String nationality = data[2].trim();
                String packageName = data[3].trim();
                double price = Double.parseDouble(data[4].trim());

                // Read destinations (rest of the data after price)
                List<String> destinationsList = new ArrayList<>();
                for (int i = 5; i < data.length; i++) {
                    destinationsList.add(data[i].trim());
                }
                
                // Create Tourist and TourPackage objects
                Tourist tourist = new Tourist(touristName, age, nationality);
                String[] destinationsArray = destinationsList.toArray(new String[0]);
                TourPackage tourPackage = new TourPackage(packageName, price, destinationsArray);

                tourists.add(tourist);
                packages.add(tourPackage);
            }
            reader.close();

            // Step 2: Create Bookings
            BufferedWriter writer = new BufferedWriter(new FileWriter("output1.txt"));
            for (int i = 0; i < tourists.size(); i++) {
                Tourist tourist = tourists.get(i);
                TourPackage tourPackage = packages.get(i);

                // Check if the package can accept more bookings
                if (!bookingManager.canBook(tourPackage)) {
                    System.out.println("Cannot book for package: " + tourPackage.getPackageName() +
                                       " (Booking FULL)");
                    continue;
                }

                // Create and process booking
                Booking booking = new Booking("B" + (i + 1), tourist, tourPackage, "2024-11-29");
                bookingManager.addBooking(tourPackage);

                // Display Booking Details
                booking.confirmBooking();
                booking.displayBookingDetails();

                // Display Booking Status
                bookingManager.displayBookingStatus(tourPackage);

                // Write to Output File
                writer.write("Booking ID: B" + (i + 1) + "\n");
                writer.write("Tourist: " + tourist.getName() + "\n");
                writer.write("Package: " + tourPackage.getPackageName() + "\n");
                writer.write("Price: " + tourPackage.getPrice() + "\n");
                writer.write("Destinations: " + Arrays.toString(tourPackage.getDestinations()) + "\n");
                writer.write("Discount Applied: 10%\n");
                writer.write("Total: " + (tourPackage.getPrice() - booking.calculateDiscount(tourPackage.getPrice())) + "\n");
                writer.write("\n");
            }
            writer.close();
            System.out.println("Bookings saved to output1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
