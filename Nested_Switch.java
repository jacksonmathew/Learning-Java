import java.util.Scanner;

public class Neste_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int EmpID = in.nextInt();

        switch (EmpID){
            case 1-> System.out.println("HR");
            case 2-> System.out.println("IT");
            case 3 -> {
                System.out.println("DEVs");
                String DeptID = in.next();
                switch (DeptID){
                    case "A" -> System.out.println("Web2");
                    case "B" -> System.out.println("Web3");
                    case "C" -> System.out.println("DevOps");
                }
            }
            case 4-> System.out.println("Marketing");

        }
    }
}
