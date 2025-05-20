package Measurements;

import java.util.Objects;

public class Length {
    private final double inch;

    public Length(double inch) {
        this.inch = inch;
    }

    private static Length toInch(double value, int multiplicationFactor, double divisionFactor) {
        return new Length((value * multiplicationFactor) / divisionFactor);
    }

    public static Length convertToInch(double value, Units unit) {
        switch (unit) {
            case CM:
                return toInch(value, 1, 2.5);
            case MM:
                return toInch(value, 1, 25);
            case FEET:
                return toInch(value, 12, 1.0);
            default:
                return new Length(value);
        }

    }


    @Override
    public String toString() {
        return "Length{" +
                "dimension=" + inch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(inch, length.inch) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }

    public Length add(Length other) {
        return new Length(this.inch + other.inch);
    }
}
