import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Bun;
import praktikum.Burger;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerSetBunsTest {
    private Burger burger;

    @Mock
    private Bun mockBun;

    @Before
    public void setUp() {
        burger = new Burger();
    }
    /**
     * Проверка метода setBuns: проверяет, что булочка устанавливается корректно.
     */
    @Test
    public void testSetBuns() {
        burger.setBuns(mockBun);
        assertEquals("Булочка не установлена правильно", mockBun, burger.bun);
    }
}
