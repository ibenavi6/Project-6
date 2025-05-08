package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TypeTestStudent {
    @Test
    public void testEnum() {
        assertEquals(Type.COFFEE.name(), "COFFEE");
        assertEquals(Type.SMOOTHIE.ordinal(), 1);
    }
}
