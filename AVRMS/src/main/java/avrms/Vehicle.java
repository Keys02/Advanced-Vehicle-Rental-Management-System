package avrms;

abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private String year;
    private String registrationNum;
    private int noOfSeats;
    private String make; //Brand of the car
    private String renterId;
    
    /*****************************
            Abstract methods
    *******************************/
    abstract float calculateRentalCost(int days);
    
    abstract String isAvailableForRental();
    
    /*****************************
                Getters
    *******************************/
    public String getVehicleId() { return this.vehicleId; }
    
    public String getModel() { return this.model; }
    
    public double getBaseRentalRate() { return this.baseRentalRate; }
    
    public boolean getIsAvailable() { return this.isAvailable; }
    
    public String getYear() { return this.year; }
    
    public String getRegistrationNum() { return this.registrationNum; }
    
    public int getNoOfSeats() { return this.noOfSeats; }
    
    public String getMake() { return this.make; }
    
    public String getRenterId() { return this.renterId; }
    
    
    /*****************************
                Setters
    *******************************/
    public void setVehicleId(String id) { this.vehicleId = id; }
    
    public void setModel(String model) { this.model = model; }
    
    public void setBaseRentalRate(double rate) { this.baseRentalRate = rate; }
    
    public void setIsAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
    
    public void setYear(String year) { this.year = year; }
    
    public void setRegistrationNum(String registrationNum) { this.registrationNum = registrationNum; }
    
    public void setNoOfSeats(int noOfSeats) { this.noOfSeats = noOfSeats; }
    
    public void setMake(String make) { this.make = make; }
    
    public void setRenterId(String id) { this.renterId = id; }
    
}
