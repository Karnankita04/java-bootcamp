package Measurements;

import java.util.Objects;

public class Inch {
    private final int inch;

    @Override
    public String toString() {
        return "Measurements.Inch{" +
                "inch=" + inch +
                '}';
    }

    public Inch(int inch) {
        this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch1 = (Inch) o;
        return inch == inch1.inch;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inch);
    }


    private Centimeter toCentimeter() {
        return new Centimeter(this.inch * 2.5);
    }

    public Millimeter toMilliMeter() {
        return toCentimeter().toMilliMeter();
    }

}
