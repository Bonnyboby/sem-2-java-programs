import java.util.Scanner;

interface Sports {
    void sports_getData();
    void sports_dispData();
}

class Student {

    String name;
    int roll_no;
    int score;

    Student(String name, int roll, int mark) {
        this.name = name;
        this.roll_no = roll;
        this.score = mark;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name of Student: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Academic score: " + score);
    }
}

class Result extends Student implements Sports {

    int sportsScore;
    Scanner sc = new Scanner(System.in);

    Result(String name, int roll, int mark) {
        super(name, roll, mark);
    }

    public void sports_getData() {
        System.out.print("Enter the score you have obtained in sports: ");
        sportsScore = sc.nextInt();
    }

    public void sports_dispData() {
        System.out.println("Sports score: " + sportsScore);
    }
}

public class co3_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the roll no: ");
        int roll = sc.nextInt();

        System.out.print("Enter the academic score: ");
        int mark = sc.nextInt();

        Result re = new Result(name, roll, mark);

        re.sports_getData();
        re.display();
        re.sports_dispData();

        sc.close();
    }
}
