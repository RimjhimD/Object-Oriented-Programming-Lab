
import java.util.Scanner;

public class Calculator {
    int numberOne;
    int numberTwo;

    Calculator(int numberOne, int numberTwo)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void add()
    { System.out.println("sum: " + (numberOne+numberTwo));          
    }
    void sub()
    { System.out.println("Difference: " + (numberOne-numberTwo));
    }
 
    public static void main(String[] args)
    {
        // Taking input for numberOne and numberTwo
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the first number: ");
         int inputOne = sc.nextInt();

         System.out.print("Enter the second number: ");
         int inputTwo = sc.nextInt();

         // Creating Calculator object with user input
        Calculator c1 = new Calculator(inputOne, inputTwo);

        // Calling add and sub methods
        c1.add();
        c1.sub();

        // Closing the scanner to prevent resource leak
        sc.close();
    
   }
}
