public class ATM {
    private  int ATM_ID;
    private String Location;
    private String Status;
    private String Status;
    private double Cash_Availability;

    public ATM(int ATM_ID, String location, String status, double cash_Availability) {
        this.ATM_ID = ATM_ID;
        Location = location;
        Status = status;
        Cash_Availability = cash_Availability;
    }

    public int getATM_ID() {
        return ATM_ID;
    }

    public void setATM_ID(int ATM_ID) {
        this.ATM_ID = ATM_ID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public double getCash_Availability() {
        return Cash_Availability;
    }

    public void setCash_Availability(double cash_Availability) {
        Cash_Availability = cash_Availability;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "ATM_ID=" + ATM_ID +
                ", Location='" + Location + '\'' +
                ", Status='" + Status + '\'' +
                ", Cash_Availability=" + Cash_Availability +
                '}';
    }
}
