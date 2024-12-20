package avrms;

public class RentalAgency {
    private String agencyName;
    private String location;
    private String[] vehiclesAtRent;
    
    public RentalAgency(String agencyName, String location, String[] vehicles) {
        this.agencyName = agencyName;
        this.location = location;
        this.vehiclesAtRent = vehicles;
    }
    
    /******************************
                Getters
    *******************************/
    public String getAgencyName() { return this.agencyName; }
    
    public String getLocation() { return this.location; }
    
    public String getVehiclesAtRent(){
        String vehiclesList = "";
       for(int i = 0; i < vehiclesAtRent.length; i++) {
           if(i < vehiclesAtRent.length - 1){
               vehiclesList += vehiclesAtRent[i] + "," + " ";
           } else {
               vehiclesList += vehiclesAtRent[i];           }
       }
       return vehiclesList;
    }
    
    /******************************
                Setters
    *******************************/
    public void setAgencyName(String name) {
        this.agencyName = agencyName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setVehicles(String[] vehicles){
        this.vehiclesAtRent = vehicles;
    }
}
