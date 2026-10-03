package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParallelogramTester {

  // Test getArea
  @Test
  public void testAreaBase0Height0()
  {
    Parallelogram pgram = new Parallelogram(0, 0);
    assertEquals(0,pgram.getArea(), 0.01);
  }
  @Test
  public void testAreaBase1Height1()
  {
    Parallelogram pgram = new Parallelogram(1, 1);
    assertEquals(1,pgram.getArea(), 0.01);
  }@Test
  public void testAreaBase2Height1()
  {
    Parallelogram pgram = new Parallelogram(2, 1);
    assertEquals(2,pgram.getArea(), 0.01);
  }@Test
  public void testAreaBase1Height2()
  {
    Parallelogram pgram = new Parallelogram(1, 2);
    assertEquals(2,pgram.getArea(), 0.01);
  }@Test
  public void testAreaBase2Height2()
  {
    Parallelogram pgram = new Parallelogram(2, 2);
    assertEquals(4, pgram.getArea(), 0.01);
  }@Test
  public void testAreaBase5Height7()
  {
    Parallelogram pgram = new Parallelogram(5, 7);
    assertEquals(35,pgram.getArea(), 0.01);
  }@Test
  public void testAreaBase5And2FifthsHeight7AndAHalf()
  {
    Parallelogram pgram = new Parallelogram(5.4, 7.5);
    assertEquals(40.5,pgram.getArea(), 0.01);
  }


  // Test getPerimeter
  @Test
  public void testPerimeterBase0Height0()
  {
    Parallelogram pgram = new Parallelogram(0, 0);
    assertEquals(0,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase1Height1()
  {
    Parallelogram pgram = new Parallelogram(1, 1);
    assertEquals(4,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase2Height1()
  {
    Parallelogram pgram = new Parallelogram(2, 1);
    assertEquals(6,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase1Height2()
  {
    Parallelogram pgram = new Parallelogram(1, 2);
    assertEquals(6,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase2Height2()
  {
    Parallelogram pgram = new Parallelogram(2, 2);
    assertEquals(8,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase6Height3()
  {
    Parallelogram pgram = new Parallelogram(6, 3);
    assertEquals(18,pgram.getPerimeter(), 0.01);
  }
  @Test
  public void testPerimeterBase4AndAHalfHeight8AndOneFifth()
  {
    Parallelogram pgram = new Parallelogram(4.5, 8.2);
    assertEquals(25.4,pgram.getPerimeter(), 0.01);
  }

  @Test
  public void testRectangleNumberOfSides()
  {
    Parallelogram pgram = new Parallelogram(4, 8.2);
    assertEquals(4, pgram.numberOfSides());
  }

}
