package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTester {

  // Test getArea
  @Test
  public void testSquareSide0()
  {
    Square square = new Square(0);
    assertEquals(0,square.getArea(), 0.01);
  }
  @Test
  public void testSquareSide1()
  {
    Square square = new Square(1);
    assertEquals(1,square.getArea(), 0.01);
  }
  @Test
  public void testSquareSide2()
  {
    Square square = new Square(2);
    assertEquals(4,square.getArea(), 0.01);
  }
  @Test
  public void testSquareSide5()
  {
    Square square = new Square(5);
    assertEquals(25,square.getArea(), 0.01);
  }
  @Test
  public void testSquareSideEightAndThreeFifths()
  {
    Square square = new Square(8.6);
    assertEquals(73.96,square.getArea(), 0.01);
  }

  // Test getPerimeter
  @Test
  public void testPerimeterSide0()
  {
    Square square = new Square(0);
    assertEquals(0,square.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide1()
  {
    Square square = new Square(1);
    assertEquals(4,square.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide2()
  {
    Square square = new Square(2);
    assertEquals(8,square.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide5()
  {
    Square square = new Square(5);
    assertEquals(20,square.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide8AndThreeFifths()
  {
    Square square = new Square(8.6);
    assertEquals(34.4,square.getPerimeter(), 0.01);
  }


  // Test Polygon Interface and numberOfSides method.
  @Test
  public void testSquareNumberOfSides()
  {
    Square square = new Square(10);
    assertEquals(4, square.numberOfSides());
  }

}
