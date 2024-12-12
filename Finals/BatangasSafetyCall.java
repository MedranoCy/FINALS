package Finals;

import java.util.Scanner;
import java.util.ArrayList;

public class BatangasSafetyCall {
    private static ArrayList<Report> reports = new ArrayList<>();  // Encapsulated list of reports
    private static EmergencyHotline emergencyHotline = new EmergencyHotline();  // Encapsulated instance of EmergencyHotline

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize emergency services
        initializeEmergencyServices();

        // Login - accepts any username and password
        if (!login(scanner)) {
            System.out.println("Login failed. Exiting the system.");
            return;  // Exit if login fails
        }

        // Main menu loop
        boolean done = false;
        while (!done) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Emergency hotlines");
            System.out.println("2. Report an incident anonymously");
            System.out.println("3. Update emergency contact");
            System.out.print("Enter the number of your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1 -> handleEmergencyHotlines(scanner);
                case 2 -> submitAnonymousReport(scanner);
                case 3 -> submitEmergencyNumberUpdate(scanner);
                default -> System.out.println("Invalid choice. Returning to the main menu.");
            }

            System.out.println("\nWould you like to return home? (yes/no)");
            String returnHome = scanner.nextLine();
            if (returnHome.equalsIgnoreCase("no")) {
                done = true;
                System.out.println("Thank you for using the system. Exiting...");
            }
        }

        scanner.close();
    }

    private static void initializeEmergencyServices() {
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Batangas Provincial Police Office (BPPO)", "(043) 723-3011"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Batangas Provincial Fire Station", "(043) 723-7112"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Batangas Provincial Health Office (PHO)", "(043) 723-0161"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Batangas Provincial Disaster Risk Reduction and Management Office (PDRRMO)", "(043) 723-3200"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Coast Guard Batangas Station", "(043) 723-0388 / (0917) 827-0249"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("Philippine Red Cross Batangas Chapter", "(043) 723-5269 / (0917) 560-0761"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("BATELEC I", "(043) 723-0601 to (043) 723-0606"));
        emergencyHotline.addOrUpdateEmergencyService(new EmergencyService("BATELEC II", "(043) 756-1014"));
    }

    public static boolean login(Scanner scanner) {
        while (true) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            if (username.isEmpty() || !username.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid username. Please try again.");
                continue;
            }

            System.out.println("Enter your password: ");
            String password = scanner.nextLine();
            if (password.isEmpty() || password.length() < 6 || !password.matches("[a-zA-Z0-9]+")) {
                System.out.println("Invalid password. Please try again.");
                continue;
            }

            System.out.println("Login successful!");
            return true;
        }
    }

    public static void handleEmergencyHotlines(Scanner scanner) {
        System.out.println("\n--- Emergency Hotlines ---");
        emergencyHotline.showEmergencyServices();

        System.out.print("Enter the number of the service to select it: ");
        int serviceChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        EmergencyService selectedService = emergencyHotline.getServiceByIndex(serviceChoice);
        if (selectedService != null) {
            selectedService.dialEmergency();
        } else {
            System.out.println("Invalid choice. Returning to the main menu.");
        }
    }

    public static void submitAnonymousReport(Scanner scanner) {
        System.out.println("Enter your anonymous report: ");
        String reportContent = scanner.nextLine();
    
        Report report = new Report.AnonymousReport(reportContent);
        reports.add(report);
        report.submitReport();
    }
    
    public static void submitEmergencyNumberUpdate(Scanner scanner) {
        System.out.println("\n--- Update Emergency Contact ---");
        System.out.println("Please enter your username for verification:");
        String username = scanner.nextLine();

        emergencyHotline.showEmergencyServices();

        System.out.print("Select the number of the emergency service to update: ");
        int serviceChoice = scanner.nextInt();
        scanner.nextLine();

        EmergencyService selectedService = emergencyHotline.getServiceByIndex(serviceChoice);
        if (selectedService != null) {
            System.out.println("Enter the new phone number for " + selectedService.getServiceName() + ": ");
            String newPhoneNumber = scanner.nextLine();
            selectedService.setPhoneNumber(newPhoneNumber);
            System.out.println("Note: The update contact you have submitted will be verified first");
        } else {
            System.out.println("Invalid choice. Returning to the main menu.");
        }
    }
}
