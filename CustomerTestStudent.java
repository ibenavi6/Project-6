package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {
    @Test
    public void testCopyConstructor() {
        Customer c1 = new Customer("Amy", 22);
        Customer c2 = new Customer(c1);
        assertEquals("Amy", c2.getName());
        assertEquals(22, c2.getAge());
    }
}
