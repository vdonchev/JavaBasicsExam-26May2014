import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        boolean match = false;
        for (int num1 = 0; num1 < nums.length; num1++) {
            for (int num2 = 0; num2 < nums.length; num2++) {
                for (int num3 = 0; num3 < nums.length; num3++) {
                    boolean isValidSet = nums[num1] <= nums[num2];
                    if (isValidSet) {
                        boolean isPythagorean = (nums[num1] * nums[num1]) + (nums[num2] * nums[num2]) == nums[num3] * nums[num3];
                        if (isPythagorean) {
                            System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d\n", nums[num1], nums[num2], nums[num3]);
                            match = true;
                        }
                    }
                }
            }
        }

        if (!match) {
            System.out.println("No");
        }
    }
}
