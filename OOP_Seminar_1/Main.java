import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // создаем продукт
        Product prod1= new Product("Чипсы", 60.0);
        // prod.name = "Чипсы";
        // prod.price = 60.0;
        // System.out.printf("%s: %,.1f\n", prod.name, prod.price);
        // prod.name = "Лимонад";
        System.out.println(prod1);
        // prod.setPrice(100.0);
        // System.out.printf("%s: %,.1f\n", prod.getName(), prod.getPrice());

        //создаем список с продуктами
        List <Product> prods = new ArrayList<>();
        prods.add(prod1);
        prods.add(new Product("Лимонад", 80.0));
        prods.add(new Product("Кола", 99.0));
        prods.add(new Product("Мюсли", 40.0));
        prods.add(new Product("Батончик", 78.0));

        VendingMachine v1 = new VendingMachine(prods);
        System.out.println(v1);

        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy("Батон"));
        System.out.println(v1.getProductBy(99.0));



    }
}
