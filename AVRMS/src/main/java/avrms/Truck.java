package avrms;

public class Truck extends Vehicle implements Rentable {
    private double loadCap;
    private double towCap;
    private String type;
    private int noOfDoors;
    private int rentalDays;
    
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
            String renterName,
            Integer[] customerRatings,
            double loadCap, 
            double towCap, 
            String type, 
            int noOfDoors
    ) {
            super(truckId, model, baseRentalRate, isAvailable, year, registrationNum, noOfSeats, make, renterId, renterName, customerRatings);
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
    
    
    //Rentable abstract methods implementation
    @Override
    public void rent(Customer customer, int days) {
        this.setIsAvailable(false);
        this.setRenterId(customer.getCustomerId());
        this.setRenterName(customer);
        this.rentalDays = days;
    }
    
    
    @Override
    public String getRentalStatus(){
        if(this.getIsAvailable()){
            return this.getModel() + " with id " + this.getVehicleId() + " is yet to be rented";
        } else {
            return this.getModel() + " with id " + this.getVehicleId() + " is rented to " + this.getRenterName() + " with id " + this.getRenterId() + " for " + this.rentalDays + " days";
        }
    }
    
    @Override
    public String returnVehicle() {
        this.setIsAvailable(true);
        return "Returning " + this.getModel() + " with id " + this.getVehicleId() + " to the parking lot";
    }
    
}
