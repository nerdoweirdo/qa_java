import com.example.Cat;
import com.example.Feline;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class CatTest {
    private Feline felineMock;
    private Cat cat;

    @Before
    public void setUp() {
        felineMock = mock(Feline.class);
        cat = new Cat(felineMock);
    }
    @Test
    public void getSoundCat() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodCat() throws Exception {
        when(felineMock.eatMeat()).thenReturn(List.of("Еда для котика"));
        assertEquals(List.of("Еда для котика"), cat.getFood());
    }
}