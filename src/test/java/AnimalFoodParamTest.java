import com.example.Animal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalFoodParamTest {
    private final String animalKindType;
    private final List<String> expectedFood;

    public AnimalFoodParamTest(String animalKindType, List<String> expectedFood) {
        this.animalKindType = animalKindType;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodGroup() {
        return new Object[][]{
                {"Травоядное",
                        List.of("Трава", "Различные растения")},
                {"Хищник",
                        List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodAnimal() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expectedFood, animal.getFood(animalKindType));
    }
}