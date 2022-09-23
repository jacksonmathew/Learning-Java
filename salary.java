public class salary {
    public static void main(String[] args) {
        int salary = 15000;
        if (salary > 10000){
            salary += 3000;
        }
        else if (salary < 5000){
            salary += 1000;
        }
        else if (salary == 10000){
            salary += 2000;
        }
        System.out.println(salary);


    }
}
