package entityclassassignment1;

public class Main {
    String name;
    int age;
    String department;

    // Constructor
    public Main(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student info
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}
