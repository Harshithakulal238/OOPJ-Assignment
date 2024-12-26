# OOPJ-Assignment

Software Requirements:
Java Development Kit (JDK 8 or higher)
Spring Tool Suite (STS) / Eclipse / IntelliJ IDEA
Git and GitHub (for version control)
Text Editor (for .txt files)

Class:Tourist.java
Attributes: name, age, nationality
Metods: displayTouristDetails()

Class:TourPackage.java
Attrubutes:packageName, price, destinations
Methods:displayPackageDetails()

Class:Booking.java	bookingID, tourist, tourPackage, date	
Methods:confirmBooking(), displayBookingDetails()

Class:Discountable.java	
Mtehod: calculateDiscount(double price)

Class:BookingManager.java
Attributes:packageBookings (Map<String, Integer>)
Methods:BookingManager(),canBook(TourPackage tourPackage),addBooking(TourPackage tourPackage), displayBookingStatus(TourPackage tourPackage)

Public class: TestClass.java	Main class to run the program	Reads from input1.txt, creates objects, and writes to output1.txt

