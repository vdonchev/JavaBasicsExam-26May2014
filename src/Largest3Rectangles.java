import java.util.Scanner;
import java.util.stream.Stream;

public class Largest3Rectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = Stream.of(scanner.nextLine().trim().split("[\\]\\[ x]+"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        int biggestRecatngle = Integer.MIN_VALUE;
        for (int i = 0; i < sides.length - 5; i += 2) {
            int currentRectangle = (sides[i] * sides[i + 1]) +
                    (sides[i + 2] * sides[i + 3]) +
                    (sides[i + 4] * sides[i + 5]);

            if (currentRectangle > biggestRecatngle) {
                biggestRecatngle = currentRectangle;
            }
        }

        System.out.println(biggestRecatngle);
    }
}