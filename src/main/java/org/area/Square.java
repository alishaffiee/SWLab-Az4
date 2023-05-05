package org.area;

public class Square {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.width * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}