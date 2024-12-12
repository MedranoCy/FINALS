package Finals;

import java.util.Map;
import java.util.HashMap;

public class EmergencyHotline {
    private Map<String, EmergencyService> emergencyServices = new HashMap<>();

    // Add or update an emergency service
    public void addOrUpdateEmergencyService(EmergencyService service) {
        emergencyServices.put(service.getServiceName(), service);
    }

    // Display all emergency services
    public void showEmergencyServices() {
        int index = 1;
        for (EmergencyService service : emergencyServices.values()) {
            System.out.println(index + ". " + service.getServiceName() + ": " + service.getPhoneNumber());
            index++;
        }
    }

    // Retrieve an emergency service by its index
    public EmergencyService getServiceByIndex(int index) {
        int i = 1;
        for (EmergencyService service : emergencyServices.values()) {
            if (i == index) return service;
            i++;
        }
        return null;
    }

    // Retrieve all emergency services
    public Map<String, EmergencyService> getEmergencyServices() {
        return emergencyServices;
    }
}
