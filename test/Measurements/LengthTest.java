package Measurements;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthTest {
    @Test
    void feetEqualsToInches() {
        Length length1 = Length.convertToInch(1, Units.FEET);;
        Length length2 = Length.convertToInch(12, Units.INCH);;
        assert(length1.equals(length2));
    }

    @Test
    void inchesEqualToCm() {
        Length length1 = Length.convertToInch(5, Units.CM);;
        Length length2 = Length.convertToInch(2, Units.INCH);;
        assert(length1.equals(length2));
    }

    @Test
    void centimeterEqualToMM() {
        Length length1 = Length.convertToInch(25,Units.MM);
        Length length2 = Length.convertToInch(1, Units.INCH);
        assert(length1.equals(length2));
    }

    @Test
    void addTwoInches() {
        Length length1 = Length.convertToInch(2, Units.INCH);;
        Length length2 = Length.convertToInch(2, Units.INCH);;
        assert(new Length(4).equals(length1.add(length2)));
    }

    @Test
    void addCmToInch() {
        Length length1 = Length.convertToInch(2.5, Units.CM);
        Length length2 = Length.convertToInch(2, Units.INCH);
        assert(new Length(3).equals(length1.add(length2)));
    }

    @Test
    void addMmToInch() {
        Length length1 = Length.convertToInch(25, Units.MM);
        Length length2 = Length.convertToInch(1, Units.INCH);
        assert(new Length(2).equals(length1.add(length2)));
    }

    @Test
    void addMmToCm() {
        Length length1 = Length.convertToInch(25, Units.MM);
        Length length2 = Length.convertToInch(5, Units.CM);
        assert(new Length(3).equals(length1.add(length2)));
    }
}