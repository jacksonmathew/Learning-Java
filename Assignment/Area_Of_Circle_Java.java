import java.util.Scanner;

public class Area_Of_Circle_Java_Program {
    public static void main(String[] args) {
        System.out.println("give the radius");

        Scanner in = new Scanner(System.in);


        while (true){
            int num = in.nextInt();
            double ans = 3.14 * (num *num);
            if (num == 0){
                System.out.println("Radius cannot be Zero");
            } else {
                System.out.println(ans);
                break;

            }

        }

    }
}
