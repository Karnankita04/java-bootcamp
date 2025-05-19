import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void areaOfPerfectSquare() {
        Square square = new Square(2);
        assertEquals(4,square.area());
    }

    @Test
    void areaIfSideIsZero() {
        Square square = new Square(0);
        assertEquals(0,square.area());

    }

    @Test
    void perimeterOfPerfectSquare() {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
    }

    @Test
    void perimeterIfSideIsZero() {
        Square square = new Square(0);
        assertEquals(0, square.perimeter());
    }
}