package org.area;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test {
    @Test
    public void testSquare() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
        assertEquals(5, square.getWidth());

        square.setWidth(10);
        assertEquals(100, square.getArea());
        assertEquals(10, square.getWidth());

    }

    @Test
    public void testReactangle() {
        Reactangle rectangle = new Reactangle(10, 20);
        assertEquals(rectangle.getHeight(), 20);
        assertEquals(rectangle.getWidth(), 10);
        assertEquals(rectangle.getArea(), 200);

        rectangle.setHeight(30);
        rectangle.setWidth(40);

        assertEquals(rectangle.getHeight(), 30);
        assertEquals(rectangle.getWidth(), 40);
        assertEquals(rectangle.getArea(), 1200);
    }

}