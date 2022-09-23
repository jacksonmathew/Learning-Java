import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Largest numbver of the three

//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);
        int max = 0;
        max = Math.max(a,b);

        max = Math.max(max,c);
        System.out.println(max);

    }
}
