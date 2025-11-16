import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter numbers (end with 0):");
        int num = sc.nextInt();

        while (num != 0) {
            count++;
            num = sc.nextInt();
        }

        System.out.println("Length of the sequence (excluding 0): " + count);
        sc.close();
    }
}
