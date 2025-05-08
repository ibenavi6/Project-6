package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTestStudent {
    @Test
    public void testAddBeveragesAndTotal() {
        Order order = new Order(9, Day.TUESDAY, new Customer("Jake", 30));
        order.addNewBeverage("Latte", Size.SMALL, false, false);
        order.addNewBeverage("Green", Size.MEDIUM, 2, true);
        assertEquals(2, order.getTotalItems());
        assertTrue(order.calcOrderTotal() > 0);
    }
}