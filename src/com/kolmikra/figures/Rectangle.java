package com.kolmikra.figures;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(this.point.x + width / 2, this.point.y - height / 2);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle(point, width, height);
    }
}
