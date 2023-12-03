import java.util.Scanner;

public class Calculator {
    int numberOne;
    int numberTwo;

    static Scanner sc = new Scanner(System.in);

    Calculator(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    void add() {
        System.out.println("Sum: " + (numberOne + numberTwo));
    }

    void sub() {
        System.out.println("Difference: " + (numberOne - numberTwo));
    }

    public static void main(String[] args) {
        // Taking input for numberOne and numberTwo
        System.out.print("Enter the first number: ");
        int inputOne = sc.nextInt();

        System.out.print("Enter the second number: ");
        int inputTwo = sc.nextInt();

        // Creating Calculator object with user input
        Calculator c1 = new Calculator(inputOne, inputTwo);

        // Calling add and sub methods
        c1.add();
        c1.sub();
    }
}
