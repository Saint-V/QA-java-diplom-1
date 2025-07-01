import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class BurgerRemoveIngredientTest {
    private Burger burger;

    @Mock
    private Ingredient mockIngredient;

    @Before
    public void setUp() {
        burger = new Burger();
    }
    /**
     * Проверка метода removeIngredient: проверяет, что ингредиент удаляется корректно.
     */
    @Test
    public void testRemoveIngredient() {
        burger.addIngredient(mockIngredient);
        burger.removeIngredient(0);
        assertFalse("Ингредиент не удален", burger.ingredients.contains(mockIngredient));
    }
}