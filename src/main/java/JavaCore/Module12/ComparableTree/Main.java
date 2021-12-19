package JavaCore.Module12.ComparableTree;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();
        set.add(new Product("СуперБренд", "Колбаса", 1L, LocalDateTime.now()));
        set.add(new Product("ЛучшийБренд", "Сыр", 2L, LocalDateTime.now()));
        set.add(new Product("ХорошийБренд", "Хлеб", 3L, LocalDateTime.now()));

        System.out.println("Brand | Name | SN");
        for(Product product : set) {
            System.out.println(product.getBrand() + " | " + product.getName() + " | " + product.getSerialNumber());
        }
    }
}