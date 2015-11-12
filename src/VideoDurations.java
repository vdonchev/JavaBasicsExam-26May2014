import java.util.Scanner;
import java.util.stream.Stream;

public class VideoDurations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = 0;
        String time;
        while (!(time = scanner.nextLine()).equals("End")) {
            int[] duration = Stream.of(time.split(":"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            minutes += (duration[0] * 60) + duration[1];
        }

        System.out.printf("%d:%02d", minutes / 60, minutes % 60);
    }
}