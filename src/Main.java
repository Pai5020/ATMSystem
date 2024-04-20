
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(10254, 2001);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PIN : ");
        int epin = sc.nextInt();

        try {
            if (!ac.comparePin(epin)) {
                throw new PinValidationException("Invalid PIN");
            }
            System.out.println("Enter transaction amount");
            double amt = sc.nextDouble();
            ac.transaction(amt);}

        catch (PinValidationException e) {
        System.out.println(e.getMessage());
    }
        catch(IllegalArgumentException | InsufficiencyException e){
            System.out.println(e.getMessage());

        }

    finally {
        System.out.println("Transaction cancelled....");
    }
        sc.close();

        }
}