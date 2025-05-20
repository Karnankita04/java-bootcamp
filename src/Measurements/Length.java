package Measurements;

import java.util.Objects;

public class Length {


    private final double inch;

    public Length(double inch) {
        this.inch = inch;
    }


    private static double toInch(double value, int multiplicationFactor, double divisionFactor) {
        return (value * multiplicationFactor) / divisionFactor;
    }

    public static Length fromCmToInch(int cm) {
        return new Length(toInch(cm, 1, 2.5));
    }

    public static Length fromMMToInch(int mm) {
        return new Length(toInch(mm, 1, 25));
    }


    public static Length fromFeetToInch(double feet) {
        return new Length(toInch(feet,12, 1.0));
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
