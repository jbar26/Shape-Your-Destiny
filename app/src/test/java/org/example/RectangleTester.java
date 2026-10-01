package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTester {

  // Test getArea
  @Test
  public void testAreaLength0width0()
  {
    Rectangle rect = new Rectangle(0, 0);
    assertEquals(0,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength1Width1()
  {
    Rectangle rect = new Rectangle(1, 1);
    assertEquals(1,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength1Width2()
  {
    Rectangle rect = new Rectangle(1, 2);
    assertEquals(2,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength2Width1()
  {
    Rectangle rect = new Rectangle(2, 1);
    assertEquals(2,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength2Width2()
  {
    Rectangle rect = new Rectangle(2, 2);
    assertEquals(4,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength3Width5()
  {
    Rectangle rect = new Rectangle(3, 5);
    assertEquals(15,rect.getArea(), 0.01);
  }
  @Test
  public void testAreaLength5AndTwoFifthsWidth2AndAHalf()
  {
    Rectangle rect = new Rectangle(5.4, 2.5);
    assertEquals(13.5,rect.getArea(), 0.01);
  }


  // Test getPerimeter
  @Test
  public void testPerimeterLength0width0()
  {
    Rectangle rect = new Rectangle(0, 0);
    assertEquals(0,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength1width1()
  {
    Rectangle rect = new Rectangle(1, 1);
    assertEquals(4,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength1width2()
  {
    Rectangle rect = new Rectangle(1, 2);
    assertEquals(6,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength2width1()
  {
    Rectangle rect = new Rectangle(2, 1);
    assertEquals(6,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength2Width2()
  {
    Rectangle rect = new Rectangle(2, 2);
    assertEquals(8,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength3Width5()
  {
    Rectangle rect = new Rectangle(3, 5);
    assertEquals(16,rect.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterLength5AndTwoFifthsWidth2AndAHalf()
  {
    Rectangle rect = new Rectangle(5.4, 2.5);
    assertEquals(15.8,rect.getPerimeter(), 0.01);
  }


}
