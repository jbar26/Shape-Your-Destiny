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

    // Part 2:  Square and Isos Right Triangle
    Square square = new Square(9);
    IsoscelesRightTriangle isosRt = new IsoscelesRightTriangle(9);

    System.out.println("A square with a side length of 9 calculations:");
    System.out.println("Area: " + square.getArea());
    System.out.println("Perimeter: " + square.getPerimeter());
    System.out.println();

    System.out.println("An isosceles right triangle with a side length of 9 calculations:");
    System.out.println("Area: " + isosRt.getArea());
    System.out.println("Perimeter: " + isosRt.getPerimeter());
    System.out.println();

    // Part 3:  Implement Polygon Interface
    System.out.println("A rectangle has " + rect.numberOfSides() + " sides.");
    System.out.println("A square has " + square.numberOfSides() + " sides.");
    System.out.println("A right triangle has " + rightTriangle.numberOfSides()+ " sides.");
    System.out.println("An isosceles right triangle has " + isosRt.numberOfSides() + " sides.");
    System.out.println();


    //Add-On:  Parallelogram
    Parallelogram pgram = new Parallelogram(7, 4);
    System.out.println("A parallelogram with a base of 7 and height of 4 calculations:");
    System.out.println("Area: " + pgram.getArea());
    System.out.println("Perimeter: " + pgram.getPerimeter());
    System.out.println("An parallelogram has " + pgram.numberOfSides() + " sides.");


  }
}
