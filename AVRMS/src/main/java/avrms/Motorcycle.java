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
            Integer[] customerRatings,
            String noOfWheels,
            String suspensionType, 
            String brakingSystem
    ) {
            super(motorcycleId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, customerRatings);
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
    
    
    //Rentable abstract methods implementation
    @Override
    public void rent(Customer customer, int days) {
        if(customer.getHasLicense()){
            this.setIsAvailable(false);
            this.setRenterId(customer.getCustomerId());
            this.setRenterName(customer);
            this.setRentalDays(days);
        } else {
            System.out.println("Rent cannot be initiated, PS: Customer has no license :(");
        }
    }
    
    
    @Override
    public String getRentalStatus(){
        if(this.getIsAvailable()){
            return this.getModel() + " with id " + this.getVehicleId() + " is yet to be rented";
        } else {
            return this.getModel() + " with id " + this.getVehicleId() + " is rented to " + this.getRenterName() + " with id " + this.getRenterId() + " for " + this.getRentalDays() + " days";
        }
    }
    
    @Override
    public String returnVehicle() {
        this.setIsAvailable(true);
        return "Returning " + this.getModel() + " with id " + this.getVehicleId() + " to the parking lot";
    }
    
}
