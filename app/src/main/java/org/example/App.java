package org.example;

public class App {
  public static void main(String[] args)
  {
    Circle circle = new Circle(7);
    Rectangle rect = new Rectangle(7, 8);
    RightTriangle rightTriangle = new RightTriangle(3, 4);

    System.out.println("A circle with a radius of 7 calculations:");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());
    System.out.println();
    System.out.println("A rectangle with a length of 7 and width of 8 calculations:");
    System.out.println("Area: " + rect.getArea());
    System.out.println("Perimeter: " + rect.getPerimeter());
    System.out.println();
    System.out.println("A right triangle with a base of 3 and height of 4 calculations:");
    System.out.println("Area: " + rightTriangle.getArea());
    System.out.println("Perimeter: " + rightTriangle.getPerimeter());
    System.out.println();


  }
}
