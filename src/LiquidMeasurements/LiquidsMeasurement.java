package LiquidMeasurements;

public class LiquidsMeasurement {
    private final Gallon gallon;
    private final Liters liters;

    public LiquidsMeasurement(Gallon gallon, Liters liters) {
        this.gallon = gallon;
        this.liters = liters;
    }

    public boolean compare() {
        return this.gallon.toLiters().equals(liters);
    }
}

