package com.kolmikra.figures;

public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();

    @Override
    protected Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
