import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalFeederGenericTest {
    @Test
    public void whenParameterCat_thenOnlyCatsFed() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        AnimalFeederGeneric<Cat> catFeeder
                = new AnimalFeederGeneric<>(Cat.class);
        List<Cat> fedAnimals = catFeeder.feed(animals);

        assertEquals(1, fedAnimals.size());
        assertTrue(fedAnimals.get(0) instanceof Cat);
    }
}
