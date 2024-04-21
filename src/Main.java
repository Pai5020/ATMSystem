
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(10254, 2001,4);
        Scanner sc = new Scanner(System.in);
        int pina=0;
        int pinm=3;
        while(pina < pinm) {
            System.out.println("Enter PIN : ");
            int epin = sc.nextInt();

            try {
                if (!ac.checkLength(epin)) {
                    throw new PinDigitException("The length is incorrect");
                }
                if (!ac.comparePin(epin)) {
                    throw new PinValidationException("Invalid PIN");
                }
                System.out.println("Enter transaction amount");
                double amt = sc.nextDouble();
                ac.transaction(amt);
            } catch (PinValidationException | IllegalArgumentException | InsufficiencyException | PinDigitException e) {
                System.out.println(e.getMessage());
                pina++;
                System.out.println("Remaining attempts: " + (pinm-pina));
            }
        }
        if(pina == pinm){
            System.out.println("the maximum limit for entering pin has reached...");
        }
        sc.close();

        }
}