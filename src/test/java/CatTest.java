
import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Before
    public void setup() {
        cat = new Cat(new Feline());
    }

    @Test
    public void checkGetSound() {
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, cat.getFood());
    }
}
