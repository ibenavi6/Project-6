package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeTestStudent {
    @Test
    public void testPriceWithExtras() {
        Coffee coffee = new Coffee("Latte", Size.LARGE, true, true);
        assertEquals(4.5, coffee.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        Coffee coffee = new Coffee("Espresso", Size.SMALL, false, false);
        assertTrue(coffee.toString().contains("Espresso"));
    }
}