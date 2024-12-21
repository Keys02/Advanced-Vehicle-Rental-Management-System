package avrms;

public class RentalAgency {
    private String agencyName;
    private String location;
    private String[] vehiclesFleet;
    
    public RentalAgency(String agencyName, String location, String[] vehiclesFleet) {
        this.agencyName = agencyName;
        this.location = location;
        this.vehiclesFleet = vehiclesFleet;
    }
    
    /******************************
                Getters
    *******************************/
    public String getAgencyName() { return this.agencyName; }
    
    public String getLocation() { return this.location; }
    
    public String getVehiclesFleet(){
        String vehiclesList = "";
       for(int i = 0; i < vehiclesFleet.length; i++) {
           if(i < vehiclesFleet.length - 1){
               vehiclesList += vehiclesFleet[i] + "," + " ";
           } else {
               vehiclesList += vehiclesFleet[i];           }
       }
       return vehiclesList;
    }
    
    /******************************
                Setters
    *******************************/
    public void setAgencyName(String name) { this.agencyName = name; }
    
    public void setLocation(String location) { this.location = location; }
    
    public void setVehiclesFleet(String[] vehicles){ this.vehiclesFleet = vehicles; }
}
