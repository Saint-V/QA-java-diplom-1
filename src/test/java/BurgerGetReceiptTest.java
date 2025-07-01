import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetReceiptTest {
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
     * Проверка метода getReceipt: проверяет, что квитанция о бургере возвращается корректно.
     */
    @Test
    public void testGetReceipt() {
        Mockito.when(mockBun.getName()).thenReturn("black bun");
        Mockito.when(mockBun.getPrice()).thenReturn(100.0f);
        Mockito.when(mockIngredient.getName()).thenReturn("hot sauce");
        Mockito.when(mockIngredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(mockIngredient.getPrice()).thenReturn(50.0f);

        burger.setBuns(mockBun);
        burger.addIngredient(mockIngredient);

        String expectedReceipt = String.format("(==== %s ====)%n= sauce %s =%n(==== %s ====)%n%nPrice: %f%n",
                "black bun", "hot sauce", "black bun", 250.0f);

        assertEquals("Квитанция о бургере не соответствует ожидаемой", expectedReceipt, burger.getReceipt());
    }
}