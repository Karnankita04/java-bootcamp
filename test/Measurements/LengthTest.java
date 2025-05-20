package Measurements;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthTest {
    @Test
    void feetEqualsToInches() {
        Length length1 = Length.fromFeetToInch(1);
        Length length2 = new Length(12);
        assert(length1.equals(length2));
    }

    @Test
    void inchesEqualToCm() {
        Length length1 = Length.fromCmToInch(5);
        Length length2 = new Length(2);
        assert(length1.equals(length2));
    }

    @Test
    void centimeterEqualToMM() {
        Length length1 = Length.fromMMToInch(25);
        Length length2 = new Length(1);
        assert(length1.equals(length2));
    }

    @Test
    void addTwoInches() {
        Length length1 = new Length(2);
        Length length2 = new Length(2);
        assert(new Length(4).equals(length1.add(length2)));
    }
}