import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("ACC001", "Zhahanger", 50000);
        BankAccount acc2 = new BankAccount("ACC002", "Anastasia", 10000);
        TransferService service = new TransferService();

        System.out.print("Сумма: ");
        String line = scan.nextLine();

        try {
            double sum = Double.parseDouble(line);
            service.transfer(acc1, acc2, sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Операция перевода завершена");
        }

        System.out.println(acc1.getOwner() + ": " + acc1.getBalance());
        System.out.println(acc2.getOwner() + ": " + acc2.getBalance());

        scan.close();
    }
}