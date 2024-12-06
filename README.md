# Movie Ticket Booking Management System (MTBMS)

## **Project Overview**
The **Movie Ticket Booking Management System (MTBMS)** is a robust desktop application developed using JavaFX, providing a seamless solution for cinema staff and administrators to manage movie ticket bookings and other operational activities efficiently. Designed with a user-centric approach, MTBMS simplifies workflows like ticket booking, movie scheduling, and sales tracking while ensuring data integrity and ease of use.

## **Development Team**
This project was collaboratively developed by a skilled and dedicated team:
- **Mostafa Ahmed Lotfy Moghazy**
- **Youssef Ayman Ibrahim**
- **Amr Nabil Ibrahim**
- **Alaa Hazem**
- **Radwa Amr**
- **Shahd Ehab**

## **Technologies Used**
- **Frontend**: JavaFX for a dynamic and interactive user interface.
- **Backend**: Java for core application logic and business processes.
- **Database**: MySQL for secure and efficient data storage.
- **Reporting**: Jaspersoft Studio for generating receipts and analytical reports.

## **Key Features**
1. **User Authentication**:
   - Secure signup and login functionality with role-based access.
2. **Movie Management**:
   - Add, update, or remove movies with detailed information.
3. **Ticket Booking**:
   - Streamlined booking process with real-time seat availability.
4. **Receipt Generation**:
   - Automated receipt generation with customizable templates.
5. **Customer Management**:
   - Maintain a customer database with contact and booking history.
6. **Screening Management**:
   - Manage movie schedules, including screening times and theater allocations.
7. **Dashboard with Sales Analytics**:
   - Interactive dashboard showcasing key metrics such as daily/weekly sales, ticket availability, and customer trends.

## **Setup Instructions**

### **Prerequisites**
Before setting up the system, ensure you have the following installed:
- **Java Development Kit (JDK)** (version 11 or above)
- **MySQL Server** (or compatible database management system)
- **JavaFX SDK** (compatible with your JDK version)
- **Jaspersoft Studio** (for report design and generation)

### **Database Setup**
1. Import the provided `moviebook.sql` database file using a tool such as MySQL Workbench or XAMPP.
2. Ensure the database credentials in the application match your MySQL setup (update them in the configuration files if necessary).

### **Login Credentials for Testing**
Use the following admin credentials to test the application:
- **Username**: `mostafa77`
- **Password**: `mostafa77`

### **Important Notes**
1. If you experience runtime issues, re-add all JAR files located in the `dist/lib` directory to your project's classpath.
2. Update the receipt file path in `dashboardController.java` (line 482) to reflect your local system directory structure.

## **UML Diagrams**
The project includes the following diagrams to provide a detailed understanding of the system design:
1. **Class Diagram**: Visualizing the system's classes and their relationships.
2. **Use Case Diagram**: Highlighting user interactions and key functionalities.
3. **Sequence Diagram**: Illustrating the sequence of operations for major workflows.

## **Project Purpose**
The primary goal of MTBMS is to **streamline cinema operations** by offering a fully integrated system for movie ticket management. It aims to:
- Enhance operational efficiency for theater staff.
- Provide a centralized platform for managing bookings, customer data, and sales reports.
- Ensure data security and minimize human error during ticketing processes.
- Deliver valuable insights through sales analytics, aiding decision-making for theater administrators.

By automating manual workflows and delivering a user-friendly interface, MTBMS significantly reduces the time and effort required for managing cinema operations, enabling staff to focus on providing exceptional service to customers.

---

Let us know if you have any questions or suggestions for improvement!
