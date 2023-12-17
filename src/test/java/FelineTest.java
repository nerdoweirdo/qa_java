import com.example.Feline;
import org.junit.Test;
import  org.junit.Assert;
import java.util.List;
public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getOneKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithCount() {
        Assert.assertEquals(3, feline.getKittens(3));
    }

}