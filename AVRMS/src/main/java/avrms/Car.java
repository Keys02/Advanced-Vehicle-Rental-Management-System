package avrms;

public class Car extends Vehicle implements Rentable {
    private double trunkSize;
    private int noOfDoors;
    private String fuelType;
    private String color;
    
    /******************************
                Constructor
    *******************************/
    public Car(
            String carId, 
            String model,
            double baseRentalRate,
            boolean isAvailable,
            String year,
            String registrationNum,
            int noOfSeats,
            String make,
            Integer[] customersRatings,
            double trunkSize, 
            int noOfDoors, 
            String fuelType, 
            String color
    ) {
            super(carId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, customersRatings);
            this.trunkSize = trunkSize;
            this.noOfDoors = noOfDoors;
            this.fuelType = fuelType;
            this.color = color;
    }
    
    /******************************
                Getters
    *******************************/
    public double getTrunkSize() { return this.trunkSize; }
    
    public int getNoOfDoors() { return this.noOfDoors; }
    
    public String getFuelType() { return this.fuelType; }
    
    public String getColor() { return this.color; }
    
    /******************************
                Setters
    *******************************/
    public void setTrunkSize(double size){ this.trunkSize = size; }
    
    public void setNoOfDoors(int num) { this.noOfDoors = num; }
    
    public void setFuelType(String type) { this.fuelType = type; }
    
    // Fine for delay implementation
    public long calculateLateReturnFine(RentalTransaction rentalTransaction) {
        int fineAmountHourly = 40;
        long fineAmount = rentalTransaction.getLateReturnInHours() * fineAmountHourly; 
        return fineAmount;
    }
    
    //Vehicle abstract methods implementation
    @Override
    String calculateRentalCost(int days) {
        double dailyRentalCost = 800;
        double rentalCost = days * dailyRentalCost;
        return "$" + rentalCost;
    }

    @Override
    String isAvailableForRental() {
      if(this.getIsAvailable()){
          return "Available";
      } else {
          return "Unavailable";
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
