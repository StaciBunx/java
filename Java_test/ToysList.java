import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ToysList<T extends Toy> implements Iterable<Toy> {

    List<Toy> toysList = new ArrayList<>();

    public void add(Toy toy) {
        toysList.add(toy);
    }

    private int getSize() {
        int size = toysList.size();
        return size;
    }

    public int getTotalChance() {
        int total = 0;
        for (int i = 0; i < toysList.size(); i++) {
            total += Integer.parseInt(toysList.get(i).getWeight());
        }
        return total;
    }

    public void getToy() {
        int totalChance = getTotalChance();
        Random random = new Random();
        int randomChance = random.nextInt(totalChance);
        //System.out.printf("Рандом %d\n", randomChance);
        for (int i = 0; i < toysList.size(); i++) {
            randomChance -= Integer.parseInt(toysList.get(i).getWeight());
            if (randomChance <= 0) {
                System.out.printf("Текущее значение стало меньше нуля: %d!!!!\n", randomChance);
                System.out.printf("Выпала игрушка %s", toysList.get(i).getName() );
                break;
            }
        }

    }

    @Override
    public Iterator<Toy> iterator() {
        return toysList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Toy item : this) {
            sb.append(item + "\n");
        }
        return sb.toString();
    }
}
