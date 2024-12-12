
## Project Name: Batangas Safety Call

## I. Project Overview
Batangas Safety Call is a Java application designed to enhance emergency response and community safety in the province of Batangas. This system centralizes access to critical emergency services, enabling users to quickly contact the appropriate authorities, report incidents anonymously, and update emergency contacts as necessary.

The project aims to empower citizens by promoting public safety and improving communication during emergencies, ensuring a more resilient and prepared community.

## II. Application of OOP Principles
This project demonstrates the comprehensive application of Object-Oriented Programming (OOP) principles:

    1. Encapsulation
Private Fields and Controlled Access:
Classes such as EmergencyService, Report, and EmergencyHotline have private fields that are accessed and modified through getter and setter methods.

For example, the EmergencyHotline class maintains a private collection of emergency services, ensuring that data can only be manipulated through controlled methods like addOrUpdateEmergencyService or getEmergencyService.

Separation of Concerns:
Each class focuses on a specific aspect of the application, such as managing emergency contacts (EmergencyHotline), handling reports (Report), or representing individual services (EmergencyService).

    2. Abstraction
Abstract Class Implementation:
The Report class is abstract, representing the concept of a report. Specific report types, such as AnonymousReport, inherit from this class and provide concrete implementations of abstract methods.

Simplified Interface:
The EmergencyHotline class abstracts the management of services by providing user-friendly methods like showEmergencyServices and getEmergencyService, without exposing the underlying collection details.

    3. Inheritance
Hierarchical Relationships:
The AnonymousReport class inherits from the abstract Report class, inheriting common fields and behaviors while providing its unique implementation of the submitReport method.

    4. Polymorphism
Method Overriding:
Methods like submitReport in AnonymousReport and dialEmergency in EmergencyService showcase polymorphism by tailoring inherited methods to specific functionalities.

Dynamic Method Calls:
The handleEmergencyHotlines method in the BatangasSafetyCall class interacts generically with different emergency services, demonstrating polymorphism through method calls on diverse EmergencyService objects.

    5. Modularity and Reusability:
Each class is self-contained and reusable. For example, EmergencyHotline can be reused in other projects to manage emergency contacts without modification.
## III. Sustainable Development Goal (SDG)
SDG 11: Sustainable Cities and Communities

    Target 11.5: Significantly reduce deaths and the number of people affected by disasters.

Integration into the Project:
This project directly contributes to disaster risk reduction by centralizing emergency contact information and facilitating efficient communication during emergencies.

Features like anonymous reporting allow users to report issues discreetly, potentially preventing disasters before they escalate.
By promoting swift response and collaboration between emergency services, the application supports safer, more resilient communities in Batangas.

SDG 17: Partnerships for the Goals
    
    Target 17.16: Enhance partnerships for sustainable development.

Integration: The app fosters collaboration among emergency services, local government units, and citizens, ensuring coordinated efforts during crises.

   Target 17.18: Enhance the availability of high-quality, timely, and reliable data.

Integration: Through incident reporting and emergency contact management, the app can help authorities collect data to improve disaster preparedness and response strategies.
## IV. Instructions for Running the Program
    1. Pre-requisites:
Install the Java Development Kit (JDK) 8 or later.
Use any Java IDE, such as IntelliJ IDEA, Eclipse, or NetBeans, or run the program through a terminal/command prompt.
    
    2. Setup:
Clone or download the project repository to your local system.
Open the project in your preferred Java IDE or compile it manually in a terminal.

    3. Execution:
Run the BatangasSafetyCall class, which contains the program's main method.

    4. Program Features:
Login: Enter a username and password to access the system.
Valid credentials must meet these criteria:

Username: Non-empty and alphanumeric.
Password: Minimum of 6 alphanumeric characters.

Main Menu:
The program presents three options:

Emergency Hotlines: View a list of emergency services and their contact details. Select a service to simulate dialing its number.

Anonymous Reporting: Submit an anonymous incident report. The report is added to a list and confirmed via a console message.

Update Emergency Contact: Update the phone number of an existing emergency service after selecting it from the list.

    5. User Inputs:
Select menu options by typing the corresponding number.
Input text when prompted for details like a report, username, password, or updated phone numbers.

    6. Exiting the Program:
When prompted with "Would you like to return home? (yes/no)", type no to terminate the application.

    7. Expected Outputs:
Console messages guide the user through each action, confirming successful operations like report submission or contact updates.
V. Additional Notes

Error Handling:
The program validates all inputs (e.g., username and password format, valid menu choices).

Invalid inputs prompt users to re-enter data until a valid response is provided.

Extensibility:
Additional emergency services or report types can be integrated by extending the existing classes or adding new ones.

# VI. Example Usage

  # 1. Login 

    Enter your username: user123
    Enter your password: password123
    Login successful!

#2. Main Menu 

    Choose an option:
    1. Emergency hotlines
    2. Report an incident anonymously
    3. Update emergency contact
    Enter the number of your choice: 1

#3. Emergency Hotlines:

    --- Emergency Hotlines ---
     1. Batangas Provincial Police Office (BPPO): (043) 723-3011
     2. Batangas Provincial Fire Station: (043) 723-7112
    ...
    Enter the number of the service to select it: 2
    Dialing Batangas Provincial Fire Station at (043) 723-7112...


