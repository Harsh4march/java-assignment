 // A-1 Ques9

public class FactorialCalculator {
    public static void main(String[] args) {

        int number = 12;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

