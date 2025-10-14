import java.util.Scanner;

class Subject {
    int subjectMarks;
    int grade;
    int credits;
}

class Student {
    String name, usn;
    double SGPA;
    Subject subjects[];
    Scanner s;

    Student() {
        s = new Scanner(System.in);
        subjects = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
    }

    void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter Student USN: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("\nEnter details for Subject " + (i + 1));
            System.out.print("Marks (out of 100): ");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Credits: ");
            subjects[i].credits = s.nextInt();

            if (subjects[i].subjectMarks > 100 || subjects[i].subjectMarks < 0) {
                System.out.println("Invalid marks entered! Setting to 0.");
                subjects[i].subjectMarks = 0;
            }

            subjects[i].grade = subjects[i].subjectMarks / 10;
            if (subjects[i].grade == 11)
                subjects[i].grade = 10;
            else if (subjects[i].grade <= 4)
                subjects[i].grade = 0;
        }
    }

    void computeSGPA() {
        int effectiveScore = 0, totalCredits = 0;
        for (int i = 0; i < 8; i++) {
            effectiveScore += subjects[i].grade * subjects[i].credits;
            totalCredits += subjects[i].credits;
        }
        if (totalCredits > 0)
            SGPA = (double) effectiveScore / totalCredits;
        else
            SGPA = 0.0;
    }

    void displayResult() {
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Enter details for Student " + (i + 1) + " ===");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
        }

        System.out.println("\n========= ALL STUDENTS RESULT =========");
        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }

        sc.close();
    }
}
