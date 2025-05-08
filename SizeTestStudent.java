package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class SizeTestStudent {
    @Test
    public void testEnum() {
        assertEquals(Size.SMALL.toString(), "SMALL");
        assertEquals(Size.LARGE.ordinal(), 2);
    }
}