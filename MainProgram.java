import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        // Example Usage of Modules

        // Building Management
        Building building = new Building("Sample Building");
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);
        Apartment apt101 = new Apartment(101);
        Apartment apt201 = new Apartment(201);

        floor1.addApartment(apt101);
        floor2.addApartment(apt201);
        building.addFloor(floor1);
        building.addFloor(floor2);

        // Society Management
        Society society = new Society("Sample Society");
        CommonFacility gym = new CommonFacility("Gym");
        CommonFacility swimmingPool = new CommonFacility("Swimming Pool");

        society.addCommonFacility(gym);
        society.addCommonFacility(swimmingPool);

        // Event Management
        Event event = new Event("Community Gathering", LocalDateTime.now(), "Community Board");

        // Complaint Management
        Complaint complaint = new Complaint("Water leakage in Apt 101");
        MaintenanceTask maintenanceTask = new MaintenanceTask("Fix plumbing issue in Apt 101");

        // Security Management
        SecuritySystem securitySystem = new SecuritySystem();
        EntryExitLog entryExitLog = new EntryExitLog("user123", LocalDateTime.now(), LocalDateTime.now().plusHours(2));
        securitySystem.logEntryExit(entryExitLog);
        List<EntryExitLog> entryExitLogs = securitySystem.getEntryExitLogs();

        // Payment Management
        Payment payment = new Payment(100.0, LocalDate.now());
        Bill bill = new Bill(150.0, LocalDate.now().plusMonths(1));

        // You can continue to use and interact with the modules based on your project requirements.
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
}

class Complaint {
    private String description;
    private boolean resolved;

    public Complaint(String description) {
        this.description = description;
        this.resolved = false;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void markResolved() {
        this.resolved = true;
    }
}

class MaintenanceTask {
    private String taskDescription;
    private boolean completed;

    public MaintenanceTask(String taskDescription) {
        this.taskDescription = taskDescription;
        this.completed = false;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
}

class SecuritySystem {
    private List<EntryExitLog> entryExitLogs;

    public SecuritySystem() {
        this.entryExitLogs = new ArrayList<>();
    }

    public void logEntryExit(EntryExitLog log) {
        entryExitLogs.add(log);
    }

    public List<EntryExitLog> getEntryExitLogs() {
        return entryExitLogs;
    }
}

class EntryExitLog {
    private String username;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public EntryExitLog(String username, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.username = username;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }
}

class Payment {
    private double amount;
    private LocalDate paymentDate;

    public Payment(double amount, LocalDate paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
}

class Bill {
    private double amount;
    private LocalDate dueDate;

    public Bill(double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }
}
