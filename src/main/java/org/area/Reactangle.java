package org.area;

public class Reactangle extends Square {
    private int height;

    public Reactangle(int width, int height) {
        super(width);
        this.height = height;
    }

    public int getArea() {
        return this.height * super.getWidth();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

