package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class AlcoholTestStudent {
    @Test
    public void testCalcPriceWeekend() {
        Alcohol a = new Alcohol("Wine", Size.MEDIUM, true);
        assertEquals(3.1, a.calcPrice(), 0.01);
    }

    @Test
    public void testCalcPriceWeekday() {
        Alcohol a = new Alcohol("Beer", Size.SMALL, false);
        assertEquals(2.0, a.calcPrice(), 0.01);
    }
}