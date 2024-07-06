import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Mainpro {
    public static void main(String[] args) {
        // Example Usage of Modules

        // Create Users
        User adminUser = new User("admin", "admin123", "Admin");
        User residentUser = new User("resident1", "pass123", "Resident");

        // Create Building
        Building building = new Building("Sample Building");
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Apartment apt101 = new Apartment(101);
        Apartment apt201 = new Apartment(201);

        floor1.addApartment(apt101);
        floor2.addApartment(apt201);
        building.addFloor(floor1);
        building.addFloor(floor2);

        // Create Society
        Society society = new Society("Sample Society");
        CommonFacility gym = new CommonFacility("Gym");
        CommonFacility swimmingPool = new CommonFacility("Swimming Pool");

        society.addCommonFacility(gym);
        society.addCommonFacility(swimmingPool);

        // Create Event
        Event event = new Event("Community Gathering", LocalDateTime.now(), "Community Board");

        // Display User Info
        adminUser.displayUserInfo();
        System.out.println();
        residentUser.displayUserInfo();
        System.out.println();

        // Display Building Info
        building.displayBuildingInfo();
        System.out.println();

        // Display Society Info
        society.displaySocietyInfo();
        System.out.println();

        // Display Event Info
        event.displayEventInfo();

        // Additional Demonstrations
        // ...

        // Feel free to add more code to demonstrate additional functionalities.
    }
}

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
    }
}

class Building {
    private String buildingName;
    private List<Floor> floors;

    public Building(String buildingName) {
        this.buildingName = buildingName;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void displayBuildingInfo() {
        System.out.println("Building Name: " + buildingName);
        System.out.println("Number of Floors: " + floors.size());
    }
}

class Floor {
    private int floorNumber;
    private List<Apartment> apartments;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
}

class Apartment {
    private int apartmentNumber;
    private boolean occupied;

    public Apartment(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}

class Society {
    private String societyName;
    private List<CommonFacility> commonFacilities;

    public Society(String societyName) {
        this.societyName = societyName;
        this.commonFacilities = new ArrayList<>();
    }

    public void addCommonFacility(CommonFacility commonFacility) {
        commonFacilities.add(commonFacility);
    }

    public List<CommonFacility> getCommonFacilities() {
        return commonFacilities;
    }

    public void displaySocietyInfo() {
        System.out.println("Society Name: " + societyName);
        System.out.println("Number of Common Facilities: " + commonFacilities.size());
    }
}

class CommonFacility {
    private String facilityName;

    public CommonFacility(String facilityName) {
        this.facilityName = facilityName;
    }
}

class Event {
    private String eventName;
    private LocalDateTime eventDateTime;
    private String organizer;

    public Event(String eventName, LocalDateTime eventDateTime, String organizer) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.organizer = organizer;
    }

    public void displayEventInfo() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Organizer: " + organizer);
        System.out.println("Event Date and Time: " + eventDateTime);
    }
}
