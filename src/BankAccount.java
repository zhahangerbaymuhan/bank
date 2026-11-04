public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Ошибка");
        }
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Ошибка");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Ошибка");
        }
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Ошибка");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Ошибка");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Мало денег");
        }
        balance -= amount;
    }
}