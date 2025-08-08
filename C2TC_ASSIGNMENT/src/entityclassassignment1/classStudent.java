package entityclassassignment1;

public class classStudent {
    public String name;
    public int age;
    public String department;

    public classStudent(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }

    public static void main(String[] args) {
        classStudent student1 = new classStudent("Alice", 20, "Computer Science");
        student1.display();
    }
}
