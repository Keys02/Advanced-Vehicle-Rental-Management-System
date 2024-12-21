package avrms;

public class RentalTransaction {
    private String transactionId;
    private String customerId;
    private String vehicleId;
    private double rentalAmount;
    private String startDate;
    private String endDate;
    private String paymentStatus;
    private double lateFees;
    private int lateReturnInHours;
    private double securityDeposit;
    
    /******************************
            Constructor
    *******************************/
    public RentalTransaction(
            String transactionId, 
            String customerId, 
            String vehicleId, 
            double rentalAmount, 
            String startDate, 
            String endDate, 
            String paymentStatus, 
            double lateFees,
            int lateReturnInHours,
            double securityDeposit
    ) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.rentalAmount = rentalAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentStatus = paymentStatus;
        this.lateFees = lateFees;
        this.lateReturnInHours = lateReturnInHours;
        this.securityDeposit = securityDeposit;
    }
    
    /******************************
                Getters
    *******************************/
    public String getTransactionId() { return this.transactionId; }
    
    public String getCustomerId() { return this.customerId; }
    
    public String getVehicleId() { return this.vehicleId; }
    
    public double getRentalAmount(){ return this.rentalAmount; }
    
    public String getStartDate() { return this.startDate; }
    
    public String getEndDate() { return this.endDate; }
    
    public String getPaymentStatus() { return this.paymentStatus; }
    
    public double getLateFees() { return this.lateFees; }
    
    public int getLateReturnInHours() { return this.lateReturnInHours; }
    
    public double getSecurityDeposit() { return this.securityDeposit; }
    
    /******************************
                Setters
    *******************************/
    public void setTransactionId(String id) { this.transactionId = id; }
    
    public void setCustomerId(String id) { this.customerId = id; }
    
    public void setVehicleId(String id) { this.vehicleId = id; }
    
    public void setRentalAmount(double amount){ this.rentalAmount = amount; }
    
    public void setStartDate(String date) { this.startDate = date; }
    
    public void setEndDate(String date) { this.endDate = date; }
    
    public void setPaymentStatus(String status) { this.paymentStatus = status; }
    
    public void setLateFees(double amount) { this.lateFees = amount; }
    
    public void setLateReturnInHours(int noOfHours){ this.lateReturnInHours = noOfHours; }
    
    public void setSecurityDeposit(double amount) { this.securityDeposit = amount; }
    
}
