//print the table of a number input by the user, n=2.
import java.util.*;
public class Example2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < 11; i++){
            System.out.println(i*n);
        }
    }
}
