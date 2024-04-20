public class Account {
    private final double balance;
    private final int pin ;

    public  Account(double balance, int pin){
        this.balance = balance;
        this.pin = pin;
    }

    public boolean comparePin(int epin){
        return epin == pin;
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
