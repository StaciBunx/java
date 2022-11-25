import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(
                Arrays.asList(new Fish("robert", "karp", "golden", 0, 1), new Cat("barsik", "vislauh", "black", 4, 6),
                        new Dog("sedi", "ratvailer", "brown", 4, 2), new Duck("kru", "rat", "white", 2, 1)));
    }

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
