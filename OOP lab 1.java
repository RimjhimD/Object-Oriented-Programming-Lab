public class Calculator {
    int numberOne,numberTwo;
    Calculator(int numberOne, int numberTwo)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void add()
    { System.out.println(numberOne+numberTwo);          
    }
 
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator(3,4);
        c1.add();
    
   }
}
