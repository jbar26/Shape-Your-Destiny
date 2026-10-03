package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RightTriangleTester {

  // Test getArea
  @Test
  public void testAreaBase0Height0()
  {
    RightTriangle rightTriangle = new RightTriangle(0, 0);
    assertEquals(0,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase1Height1()
  {
    RightTriangle rightTriangle = new RightTriangle(1, 1);
    assertEquals(0.5,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase1Height2()
  {
    RightTriangle rightTriangle = new RightTriangle(1, 2);
    assertEquals(1,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase2Height1()
  {
    RightTriangle rightTriangle = new RightTriangle(2, 1);
    assertEquals(1,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase2Height2()
  {
    RightTriangle rightTriangle = new RightTriangle(2, 2);
    assertEquals(2,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase3Height5()
  {
    RightTriangle rightTriangle = new RightTriangle(3, 5);
    assertEquals(7.5,rightTriangle.getArea(), 0.01);
  }
  @Test
  public void testAreaBase2AndAHalfHeight5And3Fifths()
  {
    RightTriangle rightTriangle = new RightTriangle(2.5, 5.6);
    assertEquals(7,rightTriangle.getArea(), 0.01);
  }


  // Test getPerimeter
  @Test
  public void testPerimeterBase0Height0()
  {
    RightTriangle rightTriangle = new RightTriangle(0, 0);
    assertEquals(0,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase1Height1()
  {
    RightTriangle rightTriangle = new RightTriangle(1, 1);
    assertEquals(3.41,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase2Height1()
  {
    RightTriangle rightTriangle = new RightTriangle(2, 1);
    assertEquals(5.24,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase1Height2()
  {
    RightTriangle rightTriangle = new RightTriangle(1, 2);
    assertEquals(5.24,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase2Height2()
  {
    RightTriangle rightTriangle = new RightTriangle(2, 2);
    assertEquals(6.83,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase5Height3()
  {
    RightTriangle rightTriangle = new RightTriangle(5, 3);
    assertEquals(13.83,rightTriangle.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase6AndOneHalfHeight8AndTwoFifths()
  {
    RightTriangle rightTriangle = new RightTriangle(6.5, 8.4);
    assertEquals(25.52,rightTriangle.getPerimeter(), 0.01);
  }

  @Test
  public void testRightTriangleNumberOfSides()
  {
    RightTriangle rightTriangle = new RightTriangle(9, 4);
    assertEquals(3, rightTriangle.numberOfSides());
  }
}
