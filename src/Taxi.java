public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }
    //getter methods
    public double getFareCollected() {
        return fareCollected;
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        if(!isDiscountApplied() && getPassengers() > 4) {
            setDiscount();
            applyDiscount();
            fareCollected += numRiders * farePerRider;
        } else {
            fareCollected += numRiders * farePerRider;
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int passengers = getPassengers() -1;
        fareCollected += passengers * farePerRider;
        return dropOffPassengers(passengers);

    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
    }

}
