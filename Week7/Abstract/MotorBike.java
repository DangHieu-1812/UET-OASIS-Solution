public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /** An especially short bit of Javadoc. */
    public MotorBike(String brand, String model, String registration,
                     Person owner, boolean hasSidecar) {
        this.setBrand(brand);
        this.setModel(model);
        this.setRegistrationNumber(registration);
        this.setOwner(owner);
        this.hasSidecar = hasSidecar;
    }


    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + brand + "\n"
                + "\tModel: " + model + "\n"
                + "\tRegistration Number: " + registrationNumber + "\n"
                + "\tHas Side Car: " + hasSidecar + "\n"
                + "\tBelongs to " + owner.getName() + " - " + owner.getAddress();
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }
}

