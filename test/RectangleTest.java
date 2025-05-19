import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void perfectArea() {
        int height = 10;
        int width = 20;
        Rectangle rectangle = new Rectangle(height,width);
        assertEquals(200,rectangle.area());
    }

    @Test
    void bothDimensionsAreZero() {
        int height = 0;
        int width = 0;
        Rectangle rectangle = new Rectangle(height, width);
        assertEquals(0,rectangle.area());
    }
}