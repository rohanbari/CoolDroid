package com.rohanbari.cooldroid;

/**
 * @author rohanbari
 * @version 1.0
 * @implNote In order to make calculations related to Circle using mathematics.
 * @since 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0.0f;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
