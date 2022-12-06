import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    private Hero hero;

    public Team(Hero hero) {
        this.hero = hero;
    }

    private List<T> teamList = new ArrayList<>();

    public void add(T character) {
        teamList.add(character);
    }

    @Override
    public Iterator<T> iterator() {
        return teamList.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(hero.toString());
        for (T item : this) {
            sb.append(item.toString() + "\n");
        }
        return sb.toString();
    }

    public Integer getTeamHP() {
        int summ = hero.getHealthPoint();
        for (T member : this) {
            summ += member.getHealthPoint();
        }
        return summ;

    }
}
