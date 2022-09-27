import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit){

            case "Apple":
                System.out.println("healthiest fruit");
                break;
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Banana":
                System.out.println("Potassium Factory");
                break;
            case "Orange":
                System.out.println("Citric Fruit");
                break;

            default:
                System.out.println("Give a valid fruit");

        }
    }
}
