import java.util.Scanner;

public class TestArea {

    // Overloaded constructor

    TestArea(int radius){            //Constructor for area
        calculateArea(radius);
    }

    TestArea(int length,int width){   //Constructor for rectangle
        calculateArea(length,width);
    }

    TestArea(int base,int height,String shapeType){    //Constructor for triangle
        calculateArea(base,height,shapeType);
    }

     
    // Overloaded methods

    // There are three methods named calculateArea with different parameter lists.


    // Methods to calculate the area of a circle
    void calculateArea(int radius) {
        System.out.println("Area of Circle: " +(Math.PI*radius*radius));
    }

    // Methods to calculate the area of a rectangle
    void calculateArea(int length,int width){
        System.out.println("Area of Rectangle: " +(length*width));
    }

    // Methods to calculate the area of a triangle
    void calculateArea(int base,int height,String shapeType){
        switch (shapeType.toLowerCase()){
            case "triangle" :
               System.out.println("Area of Triangle: " +(0.5*base*height));
               break;
            default:
                System.out.println("Invalid shape type");   
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the shape(circle/rectangle/triangle): ");
        String shapeType = sc.nextLine();


        // using switch case to determine the shape & create the corresponding object
        switch (shapeType.toLowerCase()) {

          case "circle" :
              System.out.print("Enter the radius: ");
              int radius = sc.nextInt();                           //reads the next integer input from the user using the Scanner object sc.
                                                                  //This line declares an integer variable named radius and assigns it the value entered by the user (the radius of the circle).

              new TestArea(radius);  // Creating an object with the specified constructor
              break;

          case "rectangle" : 
              System.out.print("Enter the length: ");
              int length = sc.nextInt();
              System.out.print("Enter the width: ");
              int width = sc.nextInt();

              new AreaShape(length,width);  // Creating an object with the specified constructor
              break;

          case "triangle" :
              System.out.print("Enter the base: ");
              int base = sc.nextInt();
              System.out.print("Enter the height: ");
              int height = sc.nextInt();

              new AreaShape(base,height);  // Creating an object with the specified constructor
              break;

           default :
            System.out.println("Invalid shape type");
        }

        sc.close();  // closing the scanner


        } 


      }

