import java.util.Scanner;

public class VolOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give the radius of the cube");
        int r = input.nextInt();
        vol(r);
        System.out.println("The volume of the cube is " + vol(r));

    }

    static double vol(int r) {
        double cube = (r * r * r);
        double ans = (1.3) * (3.14) * (cube);
        return ans;
    }
}
