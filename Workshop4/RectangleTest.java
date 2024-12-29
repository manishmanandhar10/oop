package Workshop4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setUp() {
        rectangle = new Rectangle(4, 5); 
    }

    @Test
    public void testArea() {
        assertEquals(20, rectangle.area()); 
    }

    @Test
    public void testPerimeter() {
        assertEquals(18, rectangle.perimeter()); 
    }
}
