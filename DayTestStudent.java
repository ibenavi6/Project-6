package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;;

public class DayTestStudent {
    @Test
    public void testEnumValues() {
        assertEquals(Day.MONDAY.name(), "MONDAY");
        assertEquals(Day.FRIDAY.ordinal(), 4);
    }
}
