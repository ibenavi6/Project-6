package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class SmoothieTestStudent {
    @Test
    public void testSmoothiePrice() {
        Smoothie s = new Smoothie("Berry", Size.MEDIUM, 3, true);
        assertEquals(4.5, s.calcPrice(), 0.01);
    }

    @Test
    public void testEquals() {
        Smoothie s1 = new Smoothie("Green", Size.SMALL, 1, false);
        Smoothie s2 = new Smoothie("Green", Size.SMALL, 1, false);
        assertTrue(s1.equals(s2));
    }
}