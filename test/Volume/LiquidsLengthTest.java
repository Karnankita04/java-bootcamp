package Volume;

import org.junit.jupiter.api.Test;

class LiquidsLengthTest {
    @Test
    void litersEqualsToGallon() {
        Gallon gallon = new Gallon(1);
        Volume liters = new Volume(3.78);
        LiquidsMeasurement liquidsMeasurement = new LiquidsMeasurement(gallon, liters);
        assert(liquidsMeasurement.compare());
    }
}