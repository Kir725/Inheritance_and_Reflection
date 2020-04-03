package com.kolmikra.figures;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return new Circle(point, radius);
    }
}
