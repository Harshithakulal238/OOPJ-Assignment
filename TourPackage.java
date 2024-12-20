package pk1;
import java.util.Arrays;

public class TourPackage {
    private String packageName;
    private double price;
    private String[] destinations;

    public TourPackage(String packageName, double price, String[] destinations) {
        this.packageName = packageName;
        this.price = price;
        this.destinations = destinations;
    }

    public void displayPackageDetails() {
        System.out.println("Package Name: " + packageName);
        System.out.println("Price: " + price);
        System.out.println("Destinations: " + Arrays.toString(destinations));
    }

    public double getPrice() {
        return price;
    }

    public String getPackageName() {
        return packageName;
    }

    public String[] getDestinations() {
        return destinations;
    }

    // Method to set new destinations
    public void setDestinations(String[] newDestinations) {
        this.destinations = newDestinations;
    }
}
