import java.util.Scanner;
public class Account {
    private final double balance;
    private final int pin ;
    private final int pinl;
    private int pinm;


    public  Account(double balance, int pin, int pinl){
        this.balance = balance;
        this.pin = pin;
        this.pinl = pinl;
        this.pinm = 0;
    }

    public boolean comparePin(int epin){
        return epin == pin;
    }
    public boolean checkLength(int epin) {
        return String.valueOf(epin).length()==pinl;

    }

    public void transaction ( double amt) throws IllegalArgumentException, InsufficiencyException {
        if (amt <= 0) {
            throw new IllegalArgumentException("Invalid transaction...");
        }

        if (amt > balance) {
            throw new InsufficiencyException("Amount insufficient...");
        }
        System.out.println("Amount withdrawn");

    }
    public void errorPin(Scanner sc) throws PinValidationException{
        if(pinm == 3) {
            throw new PinValidationException("3 attempts over...");
        }

        System.out.println("Enter PIN : ");
            int epin = sc.nextInt();

        if(!comparePin(epin)) {
            System.out.println("Invalid pin..you have " + (3 - pinm) + " chances");
            pinm++;
            errorPin(sc);
        }


    }


}

