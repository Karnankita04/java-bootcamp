package probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProbabilityTest {

    @Test
    void probabilityOfNotGettingTail() {
        Probability probability = Probability.createProbability(0.5);
        Probability complement = probability.complement();
        assertEquals(Probability.createProbability(0.5), complement);
    }

    @Test
    void shouldNotAllowInvalidProbability() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> Probability.createProbability(12.2));
        assertEquals(exception.getMessage(), "Invalid probability");
    }

    @Test
    void probabilityOfNotGettingOfTailsWithTwoTails() {
        Probability probability1 = Probability.createProbability(0.5);
        Probability probability2 = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.25), probability2.and(probability1));
    }
}