package LiquidMeasurements;

public class Gallon {
    private final int gallon;

    public Gallon(int gallon) {
        this.gallon = gallon;
    }

    public Liters toLiters() {
        return new Liters(this.gallon * 3.78);
    }
}
