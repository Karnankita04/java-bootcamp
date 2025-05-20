package LiquidMeasurements;

import java.util.Objects;

public class Liters {
    private final double liters;

    public Liters(double liters) {
        this.liters = liters;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Liters liters1 = (Liters) o;
        return Double.compare(liters, liters1.liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liters);
    }
}
