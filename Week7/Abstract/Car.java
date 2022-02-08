public class Car extends Vehicle {
    private int numberOfDoors;

    /** An especially short bit of Javadoc. */
    public Car(String brand, String model, String registration, Person owner, int numberOfDoors) {
        this.setBrand(brand);
        this.setModel(model);
        this.setRegistrationNumber(registration);
        this.setOwner(owner);
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + brand + "\n"
                + "\tModel: " + model + "\n"
                + "\tRegistration Number: " + registrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }
}

