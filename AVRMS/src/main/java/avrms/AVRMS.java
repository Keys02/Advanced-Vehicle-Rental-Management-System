package avrms;

public class AVRMS {

    public static void main(String[] args) {
        // Creating RentalAgency object
        RentalAgency Alamo = new RentalAgency("Alamo", "San Francisco California", new String[]{"Cars", "Planes", "Jet", "Motorcycles"});
        
        // Creating Customer object
        Customer firstCustomer = new Customer("000", "Steve", "Rogers", "0244083723", "San Jose California", 20, true);
        
        // Creating Car object
        Car firstCar = new Car("100", "Honda Civic", 800.0, true, "2021", "ZA-094383", 4, "Honda", "0244083723", new Integer[]{4,5}, 3000, 4, "gasoline", "red");
        
        // Creating RentalTransaction object
        RentalTransaction firstRentalTransaction = new RentalTransaction("98637", "000", "100", 800.98, "21st December 2024", "31st December 2024", "Unpaid", 0, 5, 200);
        
        
        // Testing Customer class
        System.out.println(firstCustomer.putOnLoyaltyProgram());
        System.out.println(firstCustomer.checkEligibility());
        System.out.println("###################################################");
        
        // Testing RentalAgency class
        Alamo.setVehiclesFleet(new String[]{"Aeroplane", "Cars", "Motorcycles"});
        System.out.println(Alamo.getVehiclesFleet());
        System.out.println("###################################################");
        
        // Testing car class
        System.out.println(firstCar.getTrunkSize());
        System.out.println(firstCar.rent(firstCustomer, 14));
        System.out.println(firstCar.returnVehicle());
        System.out.println(firstCar.calculateLateReturnFine(firstRentalTransaction));
        
        // Testing RentalTransaction class
        System.out.println(firstRentalTransaction.getStartDate());
        
    }
}
