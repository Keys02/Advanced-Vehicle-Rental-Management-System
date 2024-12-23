package avrms;

public class AVRMS {

    public static void main(String[] args) {
        // Creating RentalAgency object
        RentalAgency Alamo = new RentalAgency("Alamo", "San Francisco California", new String[]{"Cars", "Planes", "Jet", "Motorcycles"});
        
        // Creating Customer object
        Customer firstCustomer = new Customer("000", "Steve", "Rogers", "0244083723", "San Jose California", 20, true);
        
        // Creating Car object
        Car firstCar = new Car("100", "Honda Civic", 800.0, true, "2021", "ZA-094383", 4, "Honda", new Integer[]{4,5}, 3000, 4, "gasoline", "red");
        
        // Creating RentalTransaction object
        RentalTransaction firstRentalTransaction = new RentalTransaction("98637", "000", "100", 800.98, "21st December 2024", "31st December 2024", "Unpaid", 0, 5, 200);
        
        // Creating a motorcycle object
        Motorcycle firstMotorcycle = new Motorcycle("300", "Ducati", 400, true, "2021", "AZ-4530-93", 2, "Honda", new Integer[]{3,5}, "2", "Telescopic Forks", "Disc brake");
        
        
        // Testing Customer class
        System.out.println("Testing Customer class");
        System.out.println(firstCustomer.putOnLoyaltyProgram());
        System.out.println(firstCustomer.checkEligibility());
        System.out.println("###################################################");
        
        // Testing RentalAgency class
        System.out.println("Testing RentalAgency class");
        Alamo.setVehiclesFleet(new String[]{"Aeroplane", "Cars", "Motorcycles"});
        System.out.println(Alamo.getVehiclesFleet());
        System.out.println("###################################################");
        
        // Testing Car class
        System.out.println("Testing Car class");
        firstCar.rent(firstCustomer, 14);
        System.out.println(firstCar.calculateLateReturnFine(firstRentalTransaction));
        System.out.println(firstCar.getRentalStatus());
        System.out.println(firstCar.returnVehicle());
        System.out.println("###################################################");
        
        // Testing Motorcycle class
        System.out.println("Testing Motorcycle class");
        System.out.println(firstMotorcycle.getModel());
        firstMotorcycle.rent(firstCustomer, 20);
        System.out.println(firstMotorcycle.getRentalStatus());
        System.out.println("###################################################");
        
        // Testing RentalTransaction class
        System.out.println("Testing RentalTransaction class");
        System.out.println(firstRentalTransaction.getStartDate());
        System.out.println("###################################################");
        
    }
}
