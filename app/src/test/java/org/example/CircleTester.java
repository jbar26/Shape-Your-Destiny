package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTester {

  // Test getArea
  @Test
  public void testAreaRadius0()
  {
    Circle circle = new Circle(0);
    assertEquals(0,circle.getArea(), 0.01);
  }
  @Test
  public void testAreaRadius1()
  {
    Circle circle = new Circle(1);
    assertEquals(3.14,circle.getArea(), 0.01);
  }
  @Test
  public void testAreaRadius2()
  {
    Circle circle = new Circle(2);
    assertEquals(12.57,circle.getArea(), 0.01);
  }
  @Test
  public void testAreaRadius5()
  {
    Circle circle = new Circle(5);
    assertEquals(78.54,circle.getArea(), 0.01);
  }
  @Test
  public void testAreaRadius8AndThreeFifths()
  {
    Circle circle = new Circle(8.6);
    assertEquals(232.35,circle.getArea(), 0.01);
  }

  // Test getPerimeter
  @Test
  public void testPerimeterRadius0()
  {
    Circle circle = new Circle(0);
    assertEquals(0,circle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterRadius1()
  {
    Circle circle = new Circle(1);
    assertEquals(6.28,circle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterRadius2()
  {
    Circle circle = new Circle(2);
    assertEquals(12.57,circle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterRadius10()
  {
    Circle circle = new Circle(10);
    assertEquals(62.83,circle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterRadius8AndThreeFifths()
  {
    Circle circle = new Circle(8.6);
    assertEquals(54.04,circle.getPerimeter(), 0.01);
  }


}
