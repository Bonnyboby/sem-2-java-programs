import java.util.Scanner;

class Employee {

    int id;
    String name;
    int salary;
    String address;

    Employee(int id, String name, int salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee address: " + address);
    }
}

class Teacher extends Employee {

    String dept;
    String subject;

    Teacher(int id, String name, int salary, String address,
            String dept, String subject) {

        super(id, name, salary, address);
        this.dept = dept;
        this.subject = subject;
    }

    public void display() {
        super.display();
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }
}

class co3_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for teacher " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        System.out.println("\nTeacher Details:\n");

        for (int i = 0; i < n; i++) {
            t[i].display();
            System.out.println();
        }

        sc.close();
    }
}
