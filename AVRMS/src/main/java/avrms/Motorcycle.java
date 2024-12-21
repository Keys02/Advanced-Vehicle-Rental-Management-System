package avrms;

public class Motorcycle extends Vehicle implements Rentable {
    private String noOfWheels;
    private String suspensionType; //Values: Telescopic Forks, Upside-Down Forks, Dual Shock Absorbers, Monoshock Suspension, Air Suspension, 
    private String brakingSystem; //Values: Disc brakes, Drum brakes, Combined brakes, ABS (Anti-lock Braking System)
    
    /******************************
                Constructor
    *******************************/
    public Motorcycle(
            String motorcycleId, 
            String model,
            double baseRentalRate,
            boolean isAvailable,
            String year,
            String registrationNum,
            int noOfSeats,
            String make,
            String renterId,
            Integer[] customerRatings,
            String noOfWheels,
            String suspensionType, 
            String brakingSystem
    ) {
            super(motorcycleId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, renterId, customerRatings);
            this.noOfWheels = noOfWheels;
            this.suspensionType = suspensionType;
            this.brakingSystem = brakingSystem;
    }
    
    /******************************
                Getters
    *******************************/
    public String getNoOfWheels() { return this.noOfWheels; }
    
    public String suspensionType() { return this.suspensionType; }
    
    public String brakingSystem() { return this.brakingSystem; }
    
    /******************************
                Setters
    *******************************/
    public void setNoOfWheels(String num) { this.noOfWheels = num; }
    
    public void setSuspensionType(String suspensionType) { this.suspensionType = suspensionType; }
    
    public void setBrakingSyste(String brakingSystem) { this.brakingSystem = brakingSystem; }
    
    // Fine for delay implementation
    public long calculateLateReturnFine(RentalTransaction rentalTransaction) {
        int fineAmountHourly = 20;
        long fineAmount = rentalTransaction.getLateReturnInHours() * fineAmountHourly; 
        return fineAmount;
    }
    
    //Vehicle abstract methods implementation
    @Override
    double calculateRentalCost(int days) {
        double dayRentalCost = 400;
        double rentalCost = days * dayRentalCost;
        return rentalCost;
    }

    @Override
    String isAvailableForRental() {
      if(this.getIsAvailable()){
          return "Available";
      } else {
          return "Unavaiable";
      }
    }
    
    
    //Rentable abstract method implementation
    @Override
    public String rent(Customer customer, int days) {
        return this.getModel() + " with id " +this.getVehicleId() + " has been rented to " + customer.getFirstName() + " " + customer.getLastName() + " " + "for " + days + " days";
    }
    
    @Override
    public String returnVehicle() {
        return "Returning motorcycle to the parking lot";
    }
}
