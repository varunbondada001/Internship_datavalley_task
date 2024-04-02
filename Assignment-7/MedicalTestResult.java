import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MedicalTestResult {
    private String patientName;
    private double resultValue;

    public MedicalTestResult(String patientName, double resultValue) {
        this.patientName = patientName;
        this.resultValue = resultValue;
    }

    public double getResultValue() {
        return resultValue;
    }
}

public class MedicalTestAnalyzer {
    public static void main(String[] args) {
        List<MedicalTestResult> testResults = new ArrayList<>();
        testResults.add(new MedicalTestResult("John", 80.0));
        testResults.add(new MedicalTestResult("Alice", 100.0));
        testResults.add(new MedicalTestResult("Bob", 60.0));

        Map<String, MedicalTestStats> analysis = analyzeTestResults(testResults);
        for (Map.Entry<String, MedicalTestStats> entry : analysis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, MedicalTestStats> analyzeTestResults(List<MedicalTestResult> testResults) {
        Map<String, MedicalTestStats> result = new HashMap<>();

        result.put("Normal", new MedicalTestStats());
        result.put("Borderline", new MedicalTestStats());
        result.put("High", new MedicalTestStats());

        for (MedicalTestResult testResult : testResults) {
            double value = testResult.getResultValue();

            if (value >= 70 && value <= 90) {
                result.get("Normal").addValue(value);
            } else if (value > 90 && value <= 110) {
                result.get("Borderline").addValue(value);
            } else if (value > 110) {
                result.get("High").addValue(value);
            }
        }

        return result;
    }
}

class MedicalTestStats {
    private double totalValue;
    private int count;

    public MedicalTestStats() {
        this.totalValue = 0.0;
        this.count = 0;
    }

    public void addValue(double value) {
        totalValue += value;
        count++;
    }

    public double getAverageValue() {
        return count > 0 ? totalValue / count : 0.0;
    }

    @Override
    public String toString() {
        return "Average Value: " + getAverageValue();
    }
}
