import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);

        
    }
}
