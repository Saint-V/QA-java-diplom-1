import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunGetNameTest {
    /**
     * Проверка метода getName: проверяет, что название булочки возвращается корректно.
     */
    @Test
    public void testGetName() {
        Bun bun = new Bun("black bun", 100.0f);
        assertEquals("Название булочки некорректно", "black bun", bun.getName());
    }
}
