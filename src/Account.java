public class Account {
    private final double balance;
    private final int pin ;
    private  int pinl;
    private int epin;

    public  Account(double balance, int pin, int pinl){
        this.balance = balance;
        this.pin = pin;
        this.pinl = pinl;
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



}
