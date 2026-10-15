public class StudentRegistration {
    // Instance variables: Each student gets their own copy
    String name;
    int rollNo;

    // Method to register student details
    void register(String n, int r) {
        name = n;
        rollNo = r;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll Number: " + rollNo + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating three student objects
        StudentRegistration s1 = new StudentRegistration();
        StudentRegistration s2 = new StudentRegistration();
        StudentRegistration s3 = new StudentRegistration();

        // Calling method to set details for each student
        s1.register("Rahul", 101);
        s2.register("Priya", 102);
        s3.register("Amit", 103);

        // Displaying details
        System.out.println("--- Student Details ---");
        s1.display();
        s2.display();
        s3.display();
    }
}
