import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count <= num){

            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }

        System.out.println(i);

    }
}
