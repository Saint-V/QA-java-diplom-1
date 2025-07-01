import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunGetPriceTest {
    /**
     * Проверка метода getPrice: проверяет, что цена булочки возвращается корректно.
     */
    @Test
    public void testGetPrice() {
        Bun bun = new Bun("black bun", 100.0f);
        assertEquals("Цена булочки некорректна", 100.0f, bun.getPrice(), 0.0f);
    }
}