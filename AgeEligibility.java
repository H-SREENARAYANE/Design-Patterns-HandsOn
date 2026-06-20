public class AgeEligibility {
    public static void main(String[] args) {

        int age = 23;

        System.out.println("Age: " + age);

        if (age < 0) {
            System.out.println("Invalid age");
        } 
        else if (age < 18) {
            System.out.println("Not eligible to vote");
        } 
        else if (age >= 18 && age <= 100) {
            System.out.println("Eligible to vote");
        } 
        else {
            System.out.println("Age exceeds valid range");
        }
    }
}