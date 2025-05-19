package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipCoinTest {

    @Test
    void probabilityOfGettingTail() {
        FlipCoin coin = new FlipCoin(1,2);
        assertEquals(0.5, coin.tailsProbability());
    }

    @Test
    void probabilityOfNotGettingTail() {
        FlipCoin coin = new FlipCoin(1, 2);
        assertEquals(0.5, coin.notGettingTails());
    }
}