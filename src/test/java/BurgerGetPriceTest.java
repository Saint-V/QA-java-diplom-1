import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTest {
    private Burger burger;

    @Mock
    private Bun mockBun;

    @Mock
    private Ingredient mockIngredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }
    /**
     * Проверка метода getPrice: проверяет, что цена бургера рассчитывается корректно.
     */
    @Test
    public void testGetPrice() {
        Mockito.when(mockBun.getPrice()).thenReturn(100.0f);
        Mockito.when(mockIngredient.getPrice()).thenReturn(50.0f);
        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient);
        assertEquals("Цена бургера рассчитана неправильно", 250.0f, burger.getPrice(), 0.0f);
    }
}
