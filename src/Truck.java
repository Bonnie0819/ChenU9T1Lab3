public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate() {
        if(hasTrailer && axles > 4) {
            if(getLicensePlate().indexOf("MX") != -1) {
                return true;
            } else {
                return false;
            }
        }

        if(hasTrailer && axles <= 4) {
            if(getLicensePlate().indexOf("LX") != -1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }


    public void printTruck() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Number of AXels: " + axles);
        System.out.println("Has Trailer? " + hasTrailer);
    }
}