package stu1;

public class stu {
    public static void main(String[] args) {
        
        String studentName = "Alice";
        String studentPhone = "9876543210";
        int tokensIssued = 10;
        String distributionStatus = "Distributed"; 

        
        
        System.out.println("Student Registered");
        System.out.println("Name : " + studentName);
        System.out.println("Phone: " + studentPhone);
        System.out.println("Tokens Issued: " + tokensIssued);
        System.out.println("Distribution Status: " + distributionStatus);

        System.out.println("\n--- SMS Sent ---");
        System.out.println("To: " + studentPhone);
        System.out.println("Message: Hello " + studentName + ", you have received " + tokensIssued + " tokens.");
    }
}
