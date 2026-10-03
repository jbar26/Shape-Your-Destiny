package org.example;

public class RightTriangle extends Shape implements Polygon
{
    private double base;
    private double height;

    public RightTriangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getArea()
    {
        return 0.5 * base * height;
    }
    public double getPerimeter()
    {
        return base + height + Math.sqrt(base*base + height*height);
    }
    public int numberOfSides()
    {
        return 3;
    }
}
