package avrms;

public interface Rentable {
    void rent(Customer customer, int days);
    
    String getRentalStatus();
    
    String returnVehicle();
}
