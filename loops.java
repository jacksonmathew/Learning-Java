import java.sql.SQLOutput;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        for (int num = 1; num <= 5; num ++){
//            System.out.println(num);
//        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        for (int num = 1; num <= n ; num++) {
//           System.out.print(num + " ");
//            System.out.println("Hello, World!!");
//        }
//

        /* WHILE  LOOP
        *
        * SYNTAX::
        *   initialization
        *   while(condition){
        *    body
        *    increment
        *   }
        *
        *
        * */

//        int num = 1;
//        while(n>=num){
//            System.out.print(num +" ");
//            num++;
//        }
        int num = 1;
        do {
            System.out.println("Hello Java");
            num++;
        } while (n >= num);


    }
}
