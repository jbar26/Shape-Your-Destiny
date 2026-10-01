package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsosRightTriangleTester {

  // Test getArea
  @Test
  public void testIsosRightTriangleSide0()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(0);
    assertEquals(0,isos.getArea(), 0.01);
  }
  @Test
  public void testIsosRightTriangleSide1()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(1);
    assertEquals(0.5,isos.getArea(), 0.01);
  }
  @Test
  public void testIsosRightTriangleSide2()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(2);
    assertEquals(2,isos.getArea(), 0.01);
  }
  @Test
  public void testIsosRightTriangleSide5()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(5);
    assertEquals(12.5,isos.getArea(), 0.01);
  }
  @Test
  public void testIsosRightTriangleSide8AndOneFifth()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(8.2);
    assertEquals(33.62,isos.getArea(), 0.01);
  }


  // Test getPerimeter
  @Test
  public void testPerimeterSide0()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(0);
    assertEquals(0,isos.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide1()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(1);
    assertEquals(3.41,isos.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide2()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(2);
    assertEquals(6.83,isos.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide5()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(5);
    assertEquals(17.07,isos.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterSide8AndTwoFifths()
  {
    IsoscelesRightTriangle isos = new IsoscelesRightTriangle(8.4);
    assertEquals(28.68,isos.getPerimeter(), 0.01);
  }




}
