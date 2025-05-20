package Measurements;

public class Centimeter {
    private final double cm;

    public Centimeter(double cm) {
        this.cm = cm;
    }

    public Millimeter toMilliMeter() {
        return new Millimeter(this.cm * 10);
    }
}
