import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(
                Arrays.asList(new Fish("robert", "karp", "golden", 0, 1), new Cat("barsik", "vislauh", "black", 4, 6),
                        new Dog("sedi", "ratvailer", "brown", 4, 2), new Duck("kru", "rat", "white", 2, 1),
                        new Dolphin("Vasya", "striped", "white", 0, 5)));
    }

    // Блок с кодом для домашнего задания, дельфин в список добавлен в методе Zoo()
    public List<SwimAble> getSwimAble() {
        List<SwimAble> result = new ArrayList<>();
        for (Animal swimItem : animals) {
            if (swimItem instanceof SwimAble) {
                result.add((SwimAble) swimItem);
            }
        }
        return result;
    }

    public void swim() {
        for (SwimAble item : getSwimAble()) {
            System.out.printf("%s,%s\n", item.toString(), item.swim());

        }
    }

    // конец блока с домашним заданием

    public List<SpeakAble> getSpeakAble() {
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof SpeakAble) {
                result.add((SpeakAble) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunAble() {
        List<Runable> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof Runable) {
                result.add((Runable) speakItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAble() {
        List<FlyAble> result = new ArrayList<>();
        for (Animal speakItem : animals) {
            if (speakItem instanceof FlyAble) {
                result.add((FlyAble) speakItem);
            }
        }
        return result;
    }

    public void talk() {
        for (SpeakAble item : getSpeakAble()) {
            System.out.printf("%s\n", item.speak());
        }
    }

    public void run() {
        for (Runable item : getRunAble()) {
            System.out.printf("%s,%s\n", item.toString(), item.run());

        }
    }

    public void fly() {
        for (FlyAble item : getFlyAble()) {
            System.out.printf("%s,%s\n", item.toString(), item.fly());

        }
    }
}
