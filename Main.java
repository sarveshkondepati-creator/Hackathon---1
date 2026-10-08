import java.util.Scanner;

class Student {
    private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    
    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

   
    public boolean checkEligibility() {
        return this.marks >= 50;
    }

    
    public double calculateFee() {
        return this.courseCredits * 1500.0;
    }

        public double calculateScholarship() {
        if (this.marks >= 85) {
            return 20.0; 
        } else if (this.marks >= 70 && this.marks <= 84) {
            return 10.0; 
        } else {
            return 0.0;
        }
    }

    public double calculateFinalFee() {
        double baseFee = calculateFee();
        double scholarshipPercent = calculateScholarship();
        double scholarshipAmount = (baseFee * scholarshipPercent);
        return baseFee - scholarshipAmount;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Registration Details ---");
        System.out.println("Student Name      : " + studentName);
        System.out.println("Roll Number       : " + rollNumber);
        System.out.println("Marks             : " + marks);
        System.out.println("Course Name       : " + courseName);
        System.out.println("Course Credits    : " + courseCredits);
        System.out.println("Eligibility Status: Eligible");
        System.out.println("Total Base Fee    : Rs. " + calculateFee());
        System.out.println("Scholarship       : " + calculateScholarship() + "%");
        System.out.println("Final Payable Fee : Rs. " + calculateFinalFee());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter Course Name: ");
        String course = scanner.nextLine();

        System.out.print("Enter Course Credits: ");
        int credits = scanner.nextInt();

        
        Student student = new Student(name, roll, marks, course, credits);

        
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Denied: Student is not eligible (Marks are below 50).");
        }
    }
}