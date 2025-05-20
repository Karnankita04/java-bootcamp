package Volume;

import java.util.Objects;

public class Volume {
    private final double liters;

    public Volume(double liters) {
        this.liters = liters;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume liters1 = (Volume) o;
        return Double.compare(liters, liters1.liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liters);
    }
}
