import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientGetTypeTest {
    private Ingredient ingredient;
    private final IngredientType expectedType = IngredientType.SAUCE;
    private final String expectedName = "hot sauce";
    private final float expectedPrice = 100.0f;

    @Before
    public void setUp() {
        ingredient = new Ingredient(expectedType, expectedName, expectedPrice);
    }

    /**
     * Проверка метода getType: проверяет, что тип ингредиента возвращается корректно.
     */
    @Test
    public void testGetType() {
        assertEquals("Тип ингредиента некорректен", expectedType, ingredient.getType());
    }
}