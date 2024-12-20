package pk1;

public class Tourist {
	    private String name;
	    private int age;
	    private String nationality;

	    public Tourist(String name, int age, String nationality) {
	        this.name = name;
	        this.age = age;
	        this.nationality = nationality;
	    }

	    public void displayTouristDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Nationality: " + nationality);
	    }

	    public String getName() {
	        return name;
	    }
	}


