import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a Number");

        int num = in.nextInt();
        int i = 1;
        int ans = 1;
        while(num >= i){
            ans *= i;
            i++;
        }

        System.out.println(ans);
    }
}
