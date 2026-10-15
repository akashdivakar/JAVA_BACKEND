public class EmployeeCounter {
    // Static variable: Shared by all objects to count total employees
    static int count = 0;

    // Instance variables
    int id;
    String name;

    // Method to register employee
    void register(int empId, String empName) {
        id = empId;
        name = empName;
        count++; // Increases count each time an employee is registered
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating employee objects
        EmployeeCounter e1 = new EmployeeCounter();
        EmployeeCounter e2 = new EmployeeCounter();
        EmployeeCounter e3 = new EmployeeCounter();

        // Registering each employee
        e1.register(1, "Suresh");
        e2.register(2, "Ramesh");
        e3.register(3, "Mahesh");

        // Displaying details
        System.out.println("--- Employee Details ---");
        e1.display();
        e2.display();
        e3.display();

        // Printing total count
        System.out.println("\nTotal Employees Registered: " + count);
    }
}
