package Measurements;

import java.util.Objects;

public class Millimeter {
    private final double mm;

    public Millimeter(double mm) {
        this.mm = mm;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Millimeter that = (Millimeter) o;
        return Double.compare(mm, that.mm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mm);
    }
}
