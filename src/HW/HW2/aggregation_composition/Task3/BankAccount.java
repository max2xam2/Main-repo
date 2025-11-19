package HW.HW2.aggregation_composition.Task3;

public class BankAccount {
  private String accountNumber;
  private final String firstname;
  private final String lastname;
  private double balance;

  private double sumStorage = 382947;
  private double sumStorageCapacity = 1000000;

  protected BankAccount(String accountNumber, String firstname, String lastname, double balance) {
    this.accountNumber = accountNumber;
    this.firstname = firstname;
    this.lastname = lastname;
    this.balance = balance;
  }

  protected double getBalance() {
    return balance;
  }

  protected String getAccountNumber() {
    return accountNumber;
  }

  private boolean withdrawalCheck(double amount) {
    if(amount > balance) {
      return false;
    } else if (amount > sumStorage) {
      return false;
    }
    return true;
  }

  private boolean depositCheck(double amount) {
    if((sumStorageCapacity - sumStorage) < amount) {
      return false;
    }
    else {
      return true;
    }
  }

  protected void withdrawal(double amount) {
    if(withdrawalCheck(amount)) {
      this.balance = (balance - amount);
      System.out.println("Снятие завершено");
    } else {
      if(amount > sumStorage){
        System.out.println("Уменьшите сумму снятия до " + sumStorage + " и повторите снятие");
      } else {
        System.out.println("На вашем счете не достаточно средств для снятия: " + (amount - getBalance()));
      }
    }
  }

  protected void deposit(double amount) {
    if(depositCheck(amount)) {
      this.balance = (balance + amount);
      System.out.println("Внесение средств завершено");
    }
    else {
      System.out.println("Внесение средств невозможно, уменьшите сумму на: " + (amount - sumStorageCapacity - sumStorage));
    }
  }

  protected String checkFirstName() {
    return firstname;
  }

  protected String checkLastName() {
    return lastname;
  }

  protected void info(){
    System.out.println(checkFirstName() + " " + checkLastName());
  }

}