import com.example.Animal;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void getFamilyAnimal() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void otherAnimalGroup() {
        String expectedString = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = Assert.assertThrows(Exception.class, () -> animal.getFood("Насекомоядное"));
        Assert.assertEquals(expectedString, exception.getMessage());
    }
}