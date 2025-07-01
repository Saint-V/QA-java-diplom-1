import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class BurgerAddIngredientTest {
    private Burger burger;

    @Mock
    private Ingredient mockIngredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }
    /**
     * Проверка метода addIngredient: проверяет, что ингредиент добавляется корректно.
     */
    @Test
    public void testAddIngredient() {
        burger.addIngredient(mockIngredient);
        assertTrue("Ингредиент не добавлен", burger.ingredients.contains(mockIngredient));
    }
}
