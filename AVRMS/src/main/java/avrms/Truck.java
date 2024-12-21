package avrms;

public class Truck extends Vehicle implements Rentable {
    private double loadCap;
    private double towCap;
    private String type;
    private int noOfDoors;
    
    /******************************
                Constructor
    *******************************/
    public Truck(
            String truckId, 
            String model,
            double baseRentalRate,
            boolean isAvailable,
            String year,
            String registrationNum,
            int noOfSeats,
            String make,
            String renterId,
            Integer[] customerRatings,
            double loadCap, 
            double towCap, 
            String type, 
            int noOfDoors
    ) {
            super(truckId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, renterId, customerRatings);
            this.loadCap = loadCap;
            this.towCap = towCap;
            this.type = type;
            this.noOfDoors = noOfDoors;
    }
    
    /*******************************
                Getters
    *******************************/
    public double getLoadCap() { return this.loadCap; }
    
    public double getTowCap() { return this.towCap; }
    
    public String getType() { return this.type; }
    
    public int noOfDoors() { return this.noOfDoors; }
    
    /*******************************
                Setters
    *******************************/
    public void setLoadCap(double loadCap) { this.loadCap = loadCap; }
    
    public void setTowCap(double towCap) { this.towCap = towCap; }
    
    public void setType(String type) { this.type = type;  }
    
    public void setNoOfDoors(int num) { this.noOfDoors = num; }

    // Fine for delay implementation
    public long calculateLateReturnFine(RentalTransaction rentalTransaction) {
        int fineAmountHourly = 50;
        long fineAmount = rentalTransaction.getLateReturnInHours() * fineAmountHourly; 
        return fineAmount;
    }
    
    //Vehicle abstract methods implementation
    @Override
    double calculateRentalCost(int days) {
        double dayRentalCost = 1500;
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
        return "Returning truck to the parking lot";
    }
    
}
