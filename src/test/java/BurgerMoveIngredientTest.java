import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerMoveIngredientTest {
    private Burger burger;

    @Mock
    private Ingredient mockIngredient;

    @Mock
    private Ingredient mockIngredient2;

    @Before
    public void setUp() {
        burger = new Burger();
    }
    /**
     * Проверка метода moveIngredient: проверяет, что ингредиенты перемещаются корректно.
     */
    @Test
    public void testMoveIngredient() {
        burger.addIngredient(mockIngredient);
        burger.addIngredient(mockIngredient2);
        burger.moveIngredient(0, 1);
        assertEquals("Ингредиенты не перемещены правильно", mockIngredient2, burger.ingredients.get(0));
        assertEquals("Ингредиенты не перемещены правильно", mockIngredient, burger.ingredients.get(1));
    }
}
