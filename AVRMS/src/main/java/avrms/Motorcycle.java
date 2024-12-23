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
    String calculateRentalCost(int days) {
        double dayRentalCost = 400;
        double rentalCost = days * dayRentalCost;
        return "$" + rentalCost;
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
        // Check if a customer has a license and the vehicle rental status
        if(customer.getHasLicense()){
            // If the customer has a license
            if(this.getRenterId() == null && this.getRenterName() == null){
                // If the vehicle is not rented
                this.setIsAvailable(false);
                this.setRenterId(customer.getCustomerId());
                this.setRenterName(customer);
                this.setRentalDays(days);
            } else {
                // If the vehicle is rented
                System.out.println("Rent cannot be initiated, " + "PS: " +this.getModel() + " with id " + this.getVehicleId() + " is already rented :(");
            }
        } else {
            // If the customer has no license
            System.out.println("Rent cannot be initiated, PS: Customer has no license :(");
        }
    }
    
    
    @Override
    public String getRentalStatus(){
        //Check if the vehicle is rented
        if(this.getIsAvailable()){
            return this.getModel() + " with id " + this.getVehicleId() + " is yet to be rented";
        } else {
            return this.getModel() + " with id " + this.getVehicleId() + " is rented to " + this.getRenterName() + " with id " + this.getRenterId() + " for " + this.getRentalDays() + " days";
        }
    }
    
    @Override
    public String returnVehicle(RentalTransaction transaction) {
        this.setIsAvailable(true);
        //Check if the customer had late hours accumulated
        if(transaction.getLateReturnInHours() == 0){
            return  this.getModel() + " with id " + this.getVehicleId() + " is returned to the parking lot";
        } else {
           return this. getModel() + " with id " + this.getVehicleId() + " is returned to the parking lot with a fine amount of $" + calculateLateReturnFine(transaction);
        }
    }
    
}
