import java.util.ArrayList;
import java.util.List;

class AnimalFeederGeneric<T> {
    private Class<T> type;

    AnimalFeederGeneric(Class<T> type) {
        this.type = type;
    }

    List<T> feed(List<Animal> animals) {
        List<T> list = new ArrayList<>();
        animals.forEach(animal -> {
            if (type.isInstance(animal)) {
                T objAsType = type.cast(animal);
                list.add(objAsType);
            }
        });
        return list;
    }
}
