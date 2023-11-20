package Model;

interface CreditCardInterface {
    void viewCreditAmount();
    void viewPin();
    void changePin(int newPin);
    void payBalance(double amount);
}


class Customer implements CreditCardInterface {
    private String name;
    private String cardNumber;
    private int pin;
    private double creditAmount;

    public Customer(String name, String cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditAmount = 0; // Initialized to 0
    }

    @Override
    public void viewCreditAmount() {
        System.out.println("Credit Amount: " + creditAmount);
    }

    @Override
    public void viewPin() {
        System.out.println("PIN: " + pin);
    }

    @Override
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully to: " + newPin);
    }

    @Override
    public void payBalance(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Payment of " + amount + " processed successfully.");
        } else {
            System.out.println("Insufficient credit balance for payment.");
        }
    }
}

public class CreditCard {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3]; // Creating an array of Customer objects

        customers[0] = new Customer("Alice", "1111 2222 3333 4444", 1234);
        customers[1] = new Customer("Bob", "5555 6666 7777 8888", 5678);
        customers[2] = new Customer("Charlie", "9999 0000 1111 2222", 9876);

        // Pay Balance for first customer
        System.out.println("Before Payment - Customer 1:");
        customers[0].viewCreditAmount(); // View credit amount before payment
        customers[0].payBalance(50); // Attempt to pay 50

        System.out.println("\nAfter Payment - Customer 1:");
        customers[0].viewCreditAmount(); // View credit amount after payment

        // Change PIN for third customer
        System.out.println("\nBefore PIN Change - Customer 3:");
        customers[2].viewPin(); // View current PIN
        customers[2].changePin(5432); // Change PIN
        customers[2].viewPin(); // View new PIN
    }
}
