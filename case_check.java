import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z' ){
            System.out.println("LowerCase");
        }

        if (ch >= 'A' && ch <= 'Z' ){
            System.out.println("Uppercase");
        }
    }
}
