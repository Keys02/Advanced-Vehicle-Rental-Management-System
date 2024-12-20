package avrms;

public interface Rentable {
    String rent(Customer customer, int days);
    
    String returnVehicle();
}
