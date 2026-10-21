class Employee {

    static int count = 0;

    String name;

    void register(String n) {
        name = n;
        count++;
    }

    void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.register("Akash");
        e2.register("Divakar");
        e3.register("Ramesh");

        e1.display();
        e2.display();
        e3.display();

        System.out.println("Total Employees: " + count);
    }
}
