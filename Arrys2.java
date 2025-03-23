import java.util.Scanner;

public class Arrys2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The numbers you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
