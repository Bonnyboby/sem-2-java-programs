import java.util.Scanner;

class employee {

    int eno;
    String ename;
    int salary;

   
    public void read() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the id: ");
        eno = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter the employee name: ");
        ename = sc.nextLine();

        System.out.print("Enter the salary: ");
        salary = sc.nextInt();
    }

    
    public void display() {

        System.out.println("Employee id: " + eno);
        System.out.println("Employee name: " + ename);
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of employees: ");
        int n = sc.nextInt();

        employee[] emp = new employee[n];

        
        for (int i = 0; i < n; i++) {
            emp[i] = new employee();
            emp[i].read();
        }

        System.out.println("Search");

        while (true) {

            System.out.print("Enter ID to search (-1 to exit): ");
            int no = sc.nextInt();

            if (no == -1)
                break;

            boolean found = false;

            for (int i = 0; i < n; i++) {

                if (emp[i].eno == no) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }
        }
    }
}

