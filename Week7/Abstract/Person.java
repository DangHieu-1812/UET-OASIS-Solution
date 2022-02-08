import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;

    private String address;

    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /** An especially short bit of Javadoc. */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).registrationNumber.equals(registrationNumber)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    /** An especially short bit of Javadoc. */
    public String getVehiclesInfo() {
        if (vehicleList.size() == 0) {
            String info = this.name + " has no vehicle!";
            return info;
        }
        String a = this.name + " has:" + "\n" + "\n";
        for (int i = 0; i < vehicleList.size(); i++) {
            a += vehicleList.get(i).getInfo() + "\n";
        }
        return a;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

