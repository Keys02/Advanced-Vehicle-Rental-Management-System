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
            double trunkSize, 
            int noOfDoors, 
            String fuelType, 
            String color
    ) {
            super(motorcycleId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, renterId, customerRatings);
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
    public long calculateDelayFine(int durationInHours) {
        int fineAmountHourly = 40;
        long fineAmount = durationInHours * fineAmountHourly; 
        return fineAmount;
    }
    
    //Vehicle abstract methods implementation
    @Override
    float calculateRentalCost(int days) {
        float dayRentalCost = 800;
        float rentalCost = days * dayRentalCost;
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
        return "The car has been rented to" + customer + "for" + days + "days";
    }
    
    @Override
    public String returnVehicle() {
        return "Returning car to the parking lot";
    }
}
