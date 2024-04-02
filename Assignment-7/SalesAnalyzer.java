import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesAnalyzer {
    public static Map<String, Double> analyzeSales(List<Product> sales) {
        Map<String, Double> result = new HashMap<>();

        result.put("$0-50", 0.0);
        result.put("$50-100", 0.0);
        result.put("$100-200", 0.0);
        result.put("$200+", 0.0);

        for (Product product : sales) {
            double price = product.getPrice();
            if (price >= 0 && price <= 50) {
                result.put("$0-50", result.get("$0-50") + price);
            } else if (price > 50 && price <= 100) {
                result.put("$50-100", result.get("$50-100") + price);
            } else if (price > 100 && price <= 200) {
                result.put("$100-200", result.get("$100-200") + price);
            } else {
                result.put("$200+", result.get("$200+") + price);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<Product> sales = List.of(
                new Product(25.0),
                new Product(75.0),
                new Product(150.0),
                new Product(250.0)
        );

        Map<String, Double> analysis = analyzeSales(sales);
        for (Map.Entry<String, Double> entry : analysis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
