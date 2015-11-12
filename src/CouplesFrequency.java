import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CouplesFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().trim().split("\\s+");
        Map<String, Integer> couples = new LinkedHashMap<>();

        for (int i = 0; i < tokens.length - 1; i++) {
            String currentCouple = tokens[i] + " " + tokens[i + 1];
            if (!couples.containsKey(currentCouple)) {
                couples.put(currentCouple, 0);
            }

            int currentCoupleCount = couples.get(currentCouple);
            couples.put(currentCouple, currentCoupleCount + 1);
        }

        couples.keySet().stream()
                .forEach(e -> System.out.printf("%s -> %.2f%%\n", e, couples.get(e) * 100d / (tokens.length - 1)));
    }
}
