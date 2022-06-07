import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();

        if (x1 % 3 == 0 && x1 % 5 == 0) {
            System.out.println("fizzbuzz");

        } else if (x1 % 5 == 0){
            System.out.println("buzz");

        } else if (x1 % 3 == 0) {
            System.out.println("fizz");
        }

    }
}
