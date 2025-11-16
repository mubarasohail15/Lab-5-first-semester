import java.util.Scanner;

public class Task1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i * i * i;
        }

        System.out.println("Sum of cubes = " + sum);
        sc.close();
    }
}
