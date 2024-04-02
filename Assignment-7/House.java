import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class House {
    private double price;
    private double squareFootage;

    public House(double price, double squareFootage) {
        this.price = price;
        this.squareFootage = squareFootage;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareFootage() {
        return squareFootage;
    }
}

public class HousingAnalyzer {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new House(150000.0, 1200.0));
        houses.add(new House(250000.0, 1800.0));
        houses.add(new House(350000.0, 2000.0));

        Map<String, HousingStats> analysis = analyzeHousing(houses);
        for (Map.Entry<String, HousingStats> entry : analysis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, HousingStats> analyzeHousing(List<House> houses) {
        Map<String, HousingStats> result = new HashMap<>();

        result.put("$100,000-$200,000", new HousingStats());
        result.put("$200,000-$300,000", new HousingStats());
        result.put("$300,000-$400,000", new HousingStats());
        result.put("$400,000+", new HousingStats());

        for (House house : houses) {
            double price = house.getPrice();
            double squareFootage = house.getSquareFootage();

            if (price >= 100000 && price < 200000) {
                result.get("$100,000-$200,000").addHouse(price, squareFootage);
            } else if (price >= 200000 && price < 300000) {
                result.get("$200,000-$300,000").addHouse(price, squareFootage);
            } else if (price >= 300000 && price < 400000) {
                result.get("$300,000-$400,000").addHouse(price, squareFootage);
            } else {
                result.get("$400,000+").addHouse(price, squareFootage);
            }
        }

        return result;
    }
}

class HousingStats {
    private double totalSquareFootage;
    private int count;

    public HousingStats() {
        this.totalSquareFootage = 0.0;
        this.count = 0;
    }

    public void addHouse(double price, double squareFootage) {
        totalSquareFootage += squareFootage;
        count++;
    }

    public double getAverageSquareFootage() {
        return count > 0 ? totalSquareFootage / count : 0.0;
    }

    @Override
    public String toString() {
        return "Average Square Footage: " + getAverageSquareFootage();
    }
}
