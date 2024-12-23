package avrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private String year;
    private String registrationNum;
    private int noOfSeats;
    private String make; //Brand of the car
    private String renterId = null;
    private String renterName = null;
    private Integer[] customersRatings;
    
    /******************************
            Constructor
    *******************************/
    public Vehicle(
                String vehicleId, 
                String model, 
                double baseRentalRate, 
                boolean isAvailable,
                String year,
                String registrationNum,
                int noOfSeats,
                String make,
                String renterId,
                String renterName,
                Integer[] customersRatings
            ) {
                this.vehicleId = vehicleId;
                this.model = model;
                this.baseRentalRate = baseRentalRate;
                this.isAvailable = isAvailable;
                this.year = year;
                this.registrationNum = registrationNum;
                this.noOfSeats = noOfSeats;
                this.make = make;
                this.renterId = renterId;
                this.renterName = renterName;
                this.customersRatings = customersRatings;
    }
    
    
    /******************************
            Abstract methods
    *******************************/
    abstract double calculateRentalCost(int days);
    
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
    
    public String getRenterName() { return this.renterName; }
    
    public int getRating() {
        // Average of the customers ratings
        int sumRating = 0;
        for(int i = 0; i < (this.customersRatings).length; i++){
            sumRating += (this.customersRatings)[i];
        }
        int rating = sumRating / (this.customersRatings).length;
        return rating;
    }
    
    
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
    
    public void setRenterName(Customer customer) { this.renterName = customer.getFirstName() + " " + customer.getLastName(); }
    
    // Rating system implementation
    public String setRating(Customer customerId, int rating){
        //Check if the rating is a number from 1 - 5
        if(rating < 1 | rating > 5) {
            return "Rating must be a number from 1 - 5";
        } else {
            List<Integer> customersRatingsList = new ArrayList<Integer>(Arrays.asList(this.customersRatings));
            customersRatingsList.add(rating);
            this.customersRatings = customersRatingsList.toArray(this.customersRatings);
            return "Thanks for rating :)";
        }
    }
    
}
