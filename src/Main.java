
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(10254, 2001, 4);
        Scanner sc = new Scanner(System.in);


        try {


                ac.errorPin(sc);



                System.out.println("Enter transaction amount");
                double amt = sc.nextDouble();
                ac.transaction(amt);
        } catch (PinValidationException | IllegalArgumentException | InsufficiencyException e) {
            System.out.println(e.getMessage());


        }

        sc.close();

    }
}