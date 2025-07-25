import java.util.*;
import java.util.function.Function;

public class ProductDiscount {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();

        productPrices.put("Laptop", 50000.0);
        productPrices.put("Phone", null);
        productPrices.put("Tablet", 20000.0);

        Function<Double, Double> applyDiscount = ProductDiscount::discount;

        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            Optional<Double> optionalPrice = Optional.ofNullable(entry.getValue());
            Double finalPrice = optionalPrice.map(applyDiscount).orElse(0.0);
            System.out.println(entry.getKey() + " final price: " + finalPrice);
        }
    }
    
    public static Double discount(Double price) {
        return price - (price * 0.10);
    }
}
