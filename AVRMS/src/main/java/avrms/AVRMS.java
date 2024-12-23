package avrms;

public class AVRMS {

    public static void main(String[] args) {
        // Creating RentalAgency object
        RentalAgency Alamo = new RentalAgency("Alamo", "San Francisco California", new String[]{"Cars", "Planes", "Jet", "Motorcycles"});
        
        // Creating RentalTransaction object
        RentalTransaction firstRentalTransaction = new RentalTransaction("98637", "000", "100", 800.98, "21st December 2024", "31st December 2024", "Unpaid", 0, 5, 200);
        
        // Creating Customer object
        Customer firstCustomer = new Customer("000", "Steve", "Rogers", "0244083723", "San Jose California", 10, true);
        
        // Creating Customer object
        Customer secondCustomer = new Customer("001", "Joe", "Regan", "0534564321", "Houston Texas", 20, false);
        
        // Creating Car object
        Car firstCar = new Car("100", "Honda Civic", 800.0, true, "2021", "ZA-094383", 4, "Honda", new Integer[]{4,5}, 3000, 4, "gasoline", "red");
        
        
        // Creating a Motorcycle object
        Motorcycle firstMotorcycle = new Motorcycle("300", "Ducati", 400, true, "2021", "AZ-4530-93", 2, "Honda", new Integer[]{3,5}, "2", "Telescopic Forks", "Disc brake");
        
        // Creating a Truck object
        Truck firstTruck = new Truck("400", "Volvo", 1000, true, "2020", "ER-343-232", 2, "Volvo", new Integer[]{5,8}, 200, 400, "Heavy", 2);
        
        
        // Testing Customer class
        System.out.println("Testing Customer class");
        System.out.println(firstCustomer.putOnLoyaltyProgram());
        System.out.println(firstCustomer.checkEligibility());
        System.out.println(secondCustomer.checkEligibility());
        System.out.println("###################################################");
        
        // Testing RentalAgency class
        System.out.println("Testing RentalAgency class");
        Alamo.setVehiclesFleet(new String[]{"Aeroplane", "Cars", "Motorcycles"});
        System.out.println(Alamo.getVehiclesFleet());
        System.out.println("###################################################");
        
        // Testing Car class
        System.out.println("Testing Car class");
        firstCar.rent(secondCustomer, 14);
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
        
        // Testing Truck class
        System.out.println("Testing Truck class");
        System.out.println(firstTruck.getModel());
        firstTruck.rent(secondCustomer, 100);
        System.out.println(firstTruck.getRentalStatus());
        System.out.println("###################################################");
        
        // Testing RentalTransaction class
        System.out.println("Testing RentalTransaction class");
        System.out.println(firstRentalTransaction.getStartDate());
        System.out.println("###################################################");
        
    }
}
