import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создаем продукт
        Product prod1 = new Product("Чипсы", 60.0);
        System.out.println(prod1);

        // создаем список с продуктами и добавляем в него новые продукта
        List<Product> prods = new ArrayList<>();
        prods.add(prod1);
        prods.add(new Product("Лимонад", 80.0));
        prods.add(new Product("Кола", 99.0));
        prods.add(new Product("Мюсли", 40.0));
        prods.add(new Product("Батончик", 78.0));
        prods.add(new Milk("Петмол", 60.0, 2));

        // добавляем Protein Drink из домашнего задания
        prods.add(new ProteinDrink("Whey Protein", 150.0, 106, 20));

        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);

    }
}
