package com.rohanbari.cooldroid;

/**
 * @author rohanbari
 * @version 1.0
 * @implNote In order to make calculations related to Circle using mathematics.
 * @since 1.0
 */
public class Circle {
    private float radius;
    private final float PI = 3.1415926535f;

    public Circle() {
        radius = 0.0f;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float rad) {
        radius = rad;
    }

    public float getArea() {
        return (float) (PI * Math.pow(radius, 2));
    }

    public float getPerimeter() {
        return 2 * PI * radius;
    }
}
