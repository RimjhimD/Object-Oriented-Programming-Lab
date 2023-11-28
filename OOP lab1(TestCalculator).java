public class TestCalculator {
    int numberOne,numberTwo;
    TestCalculator(int numberOne, int numberTwo)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }
    void add()
    { System.out.println(numberOne+numberTwo);          
    }
 
    public static void main(String[] args)
    {
        TestCalculator calc1 = new TestCalculator(7,4);
        TestCalculator calc2 = new TestCalculator(6,7);
        calc1.add();
        
        calc2.add();
   // Calculator calc1 = new Calculator(4,5);
    //Calculator calc2 = new Calculator(6,7);
        
       // calc1.add();
       // calc2.add();
    
   }
}
