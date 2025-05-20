package LiquidMeasurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidsLengthTest {
    @Test
    void litersEqualsToGallon() {
        Gallon gallon = new Gallon(1);
        Liters liters = new Liters(3.78);
        LiquidsMeasurement liquidsMeasurement = new LiquidsMeasurement(gallon, liters);
        assert(liquidsMeasurement.compare());
    }
}