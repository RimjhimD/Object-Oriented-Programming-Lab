abstract class Shape{
 abstract int shapeArea();  
    
}
class Rectangle extends Shape{  
int shapeArea();    
}  
class Circle extends Shape{ 
int shapeArea();     
}

class TestAbstraction1{  
public static void main(String args[]){  
Shape s;
s = new(Rectangle);
System.out.println("The area of the rectangle is:" + shapeArea());

s = new(Circle)
System.out.println("The area of the circle is:" + shapeArea());

}  
}
