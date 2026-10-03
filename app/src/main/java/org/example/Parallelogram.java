package org.example;

public class Parallelogram extends Shape implements Polygon
{
    private double base;
    private double height;

    public Parallelogram(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    public double getArea()
    {
        return base * height;
    }
    public double getPerimeter()
    {
        return 2 * (base + height);
    }
    public int numberOfSides()
    {
        return 4;
    }
}

