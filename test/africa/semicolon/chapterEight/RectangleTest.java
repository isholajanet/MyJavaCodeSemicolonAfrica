package africa.semicolon.chapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setUp(){
        rectangle = new Rectangle();
    }
    @Test
    void rectangleCanSetLengthTest(){
        rectangle.setLength(4.0);
        assertEquals(4.0, rectangle.getLength());
    }
    @Test
    void rectangleCanSetWidthTest(){
        rectangle.setWidth(5.0);
        assertEquals(5.0, rectangle.getWidth());
    }
    @Test
    void rectangleCanCalculatePerimeterTest(){
        Rectangle rectangle1 = new Rectangle(4.0,7.0);
        assertEquals(22.0, rectangle1.getPerimeter());
    }
    @Test
    void rectangleCanCalculateAreaTest(){
        Rectangle rectangle1 = new Rectangle(4.0,7.0);
        assertEquals(28.0, rectangle1.getArea());
    }
}
