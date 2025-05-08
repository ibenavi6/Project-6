package defult;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class BevShopTestStudent {
    @Test
    public void testStartNewOrderAndAlcoholLimit() {
        BevShop shop = new BevShop();
        shop.startNewOrder(10, Day.MONDAY, "John", 25);
        shop.processAlcoholOrder("Beer", Size.SMALL);
        shop.processAlcoholOrder("Wine", Size.MEDIUM);
        shop.processAlcoholOrder("Vodka", Size.LARGE);
        assertFalse(shop.isEligibleForMore());
    }
}