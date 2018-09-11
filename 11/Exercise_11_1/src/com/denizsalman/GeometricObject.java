package com.denizsalman;

public class GeometricObject {
    private String color;
    private  boolean filled;
    private final static String name = "f";

    public GeometricObject() {
        color = "white";
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometric object " +
                "\ncolor: " + color +
                "\nfilled: " + filled;
    }
}
