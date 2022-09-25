import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int answer = 0;
        while (input > 0){
            int rem = input % 10;
            input /= 10;

            answer = answer*10 + rem;
        }


        System.out.println(answer);
    }
}
