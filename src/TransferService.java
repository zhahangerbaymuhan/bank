public class TransferService {
    public void transfer(BankAccount from, BankAccount to, double amount) throws InsufficientFundsException {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Ошибка");
        }
        if (from.getAccountNumber().equals(to.getAccountNumber())) {
            throw new IllegalArgumentException("Ошибка");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Ошибка");
        }

        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Успешно");
    }
}