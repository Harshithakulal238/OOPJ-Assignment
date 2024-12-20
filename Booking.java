package pk1;

public class Booking implements Discountable {
    private String bookingID;
    private Tourist tourist;
    private TourPackage tourPackage;
    private String date;

    public Booking(String bookingID, Tourist tourist, TourPackage tourPackage, String date) {
        this.bookingID = bookingID;
        this.tourist = tourist;
        this.tourPackage = tourPackage;
        this.date = date;
    }

    @Override
    public double calculateDiscount(double price) {
        return price * 0.10; // 10% discount
    }

    public void confirmBooking() {
        System.out.println("\n\nBooking Confirmed!");
    }

    public void displayBookingDetails() {
        double discount = calculateDiscount(tourPackage.getPrice());
        double totalPrice = tourPackage.getPrice() - discount;
        
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Tourist Details:");
        tourist.displayTouristDetails();
        System.out.println("Tour Package Details:");
        tourPackage.displayPackageDetails();
        System.out.println("Booking Date: " + date);
        System.out.println("Discount Applied: 10%");
        System.out.println("Total Price: " + totalPrice);
    }
}