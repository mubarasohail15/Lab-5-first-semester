import java.util.Scanner;

public class Task1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers (N): ");
        int N = sc.nextInt();
        int sum = 0;

        System.out.println("Enter " + N + " numbers:");
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("Sum of all numbers = " + sum);
        sc.close();
    }
}
