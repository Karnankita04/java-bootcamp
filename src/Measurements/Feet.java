package Measurements;

public class Feet {
    private final int feet;

    public Feet(int feet) {
        this.feet = feet;
    }

    public Inch toInch() {
        return new Inch(this.feet * 12);
    }

    public Millimeter toMilliMeter() {
        return toInch().toMilliMeter();
    }
}
