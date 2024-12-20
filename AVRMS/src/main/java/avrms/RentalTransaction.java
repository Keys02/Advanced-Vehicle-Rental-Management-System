package avrms;

public class RentalTransaction {
    private String transactionId;
    private String customerId;
    private String vehicleId;
    private float rentalAmount;
    private String startDate;
    private String endDate;
    private String paymentStatus;
    private float lateFees;
    private float securityDeposit;
    
    public RentalTransaction(
            String transactionId, 
            String customerId, 
            String vehicleId, 
            float rentalAmount, 
            String startDate, 
            String endDate, 
            String paymentStatus, 
            float lateFees, 
            float securityDeposit
    ) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.vehicleId = vehicleId;
        this.rentalAmount = rentalAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentStatus = paymentStatus;
        this.lateFees = lateFees;
        this.securityDeposit = securityDeposit;
    }
    
    /******************************
                Getters
    *******************************/
    public String getTransactionId() { return this.transactionId; }
    
    public String getCustomerId() { return this.customerId; }
    
    public String getVehicleId() { return this.vehicleId; }
    
    public float getRentalAmount(){ return this.rentalAmount; }
    
    public String getStartDate() { return this.startDate; }
    
    public String getEndDate() { return this.endDate; }
    
    public String getPaymentStatus() { return this.paymentStatus; }
    
    public float getLateFees() { return this.lateFees; }
    
    public float getSecurityDeposit() { return this.securityDeposit; }
    
    /******************************
                Setters
    *******************************/
    public void setTransactionId(String id) { this.transactionId = id; }
    
    public void setCustomerId(String id) { this.customerId = id; }
    
    public void setVehicleId(String id) { this.vehicleId = id; }
    
    public void setRentalAmount(float amount){ this.rentalAmount = amount; }
    
    public void setStartDate(String date) { this.startDate = date; }
    
    public void setEndDate(String date) { this.endDate = date; }
    
    public void setPaymentStatus(String status) { this.paymentStatus = status; }
    
    public void setLateFees(float amount) { this.lateFees = amount; }
    
    public void setSecurityDeposit(float amount) { this.securityDeposit = amount; }
    
}
