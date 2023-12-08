import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionManeParamTest {
    private String sex;
    private boolean expectedHasMane;

    public LionParamTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]
                {
                        {"Самец", true},
                        {"Самка", false},
                });
    }

    @Test
    public void testLionSex() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}