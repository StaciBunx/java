import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<Product>();

    private final static List<Product> initProduct = new ArrayList<>();

    static {
        initProduct.add(new Product("Сникерс", 40.0));

    };

    public VendingMachine() {
        this(initProduct); // вызов функии по умолчанию
    }

    public VendingMachine(List<Product> products) {
        this.products = products; // расширение конструктора

    }

    public VendingMachine(String name, Double price) {
        this.products = new ArrayList<>(); // два аргумента
        products.add(new Product(name, price));
    }

    public Product getProductBy(String inputName) {
        for (Product product : products) {

            if (product.getName().contains(inputName)) {
                return product;
            }
        }
        return null; // на будущее лучше null не возвращать, так как могут быть проблемы (ошибка на
                     // миллиард долларов)
    }

    public Product getProductBy(Double inputPrice) { // если бы double был с маленькой буквы (примитив), тогда
                                                          // можно было бы использовать ==
        for (Product product : products) {

            if (product.getPrice().equals(inputPrice)) {
                return product;
            }
        }
        return null; // на будущее лучше null не возвращать, так как могут быть проблемы (ошибка на
                     // миллиард долларов)
    }

    @Override
    public String toString() {
        String result = "";
        for (Product product : products) {
            result = result.concat(product.toString());
        }
        return result;
    }
}
