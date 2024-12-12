package Finals;

public class EmergencyService {
    private String serviceName;
    private String phoneNumber;

    // Constructor
    public EmergencyService(String serviceName, String phoneNumber) {
        this.serviceName = serviceName;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Method to simulate dialing and connecting
    public void dialEmergency() {
        System.out.println("Dialing " + serviceName + " at " + phoneNumber + "...");

        try {
            // Simulate delay for dialing
            Thread.sleep(2000); // 2 seconds
            System.out.println("...Connecting...");
            Thread.sleep(1000); // 1 second
            System.out.println("Connected to " + serviceName + " at " + phoneNumber + ".");
        } catch (InterruptedException e) {
            System.out.println("An error occurred while dialing. Please try again.");
        }
    }
}
