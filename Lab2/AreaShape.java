import java.util.Scanner;

class AreaShape {

      //Overloaded Constructor

      //In the AreaShape class, there are three constructors with different parameter lists. 
      //These constructors are overloaded because they have the same name (AreaShape) but different parameter types.

    AreaShape(int radius){    //Constructor for circle
        calculateArea(radius);
    }

    AreaShape(int length,int width){   //Constructor for rectangle
        calculateArea(length,width);
    }

    AreaShape(int base,int height,String shapeType){    //Constructor for triangle
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
        if(shapeType.equalsIgnoreCase("triangle")){ 
        System.out.println("Area of Triangle: " +(0.5*base*height));
    }  else{
        System.out.println("Invalid shape type");
      }
  }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the shape (circle/rectangle/triangle): ");
         String shapeType = sc.nextLine();

         if(shapeType.equalsIgnoreCase("circle")){
            System.out.print("Enter the radius: ");
            int radius = sc.nextInt();

            new AreaShape(radius);  // Creating an object with the specified constructor
           }

         else if(shapeType.equalsIgnoreCase("rectangle")){
            System.out.print("Enter the length: ");
            int length = sc.nextInt();
            System.out.print("Enter the width: ");
            int width = sc.nextInt();

            new AreaShape(length,width);  // Creating an object with the specified constructor
        }

        else if(shapeType.equalsIgnoreCase("triangle")){
            System.out.print("Enter the base: ");
            int base = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();

            new AreaShape(base,height);  // Creating an object with the specified constructor
        }

        else{
            System.out.println("Invalid shape type");
        }

        sc.close();  // closing the scanner


       }  

    
   }
