package com.kolmikra.figures;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        Point center = new Point((to.x + point.x) / 2, (to.y + point.y) / 2);
        return center;
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return new Line(point, to);
    }
}
