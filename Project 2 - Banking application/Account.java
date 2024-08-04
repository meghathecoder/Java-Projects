public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;
    
    public Account(String accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public Account(Account account){
        accountNumber=account.accountNumber;
        balance=account.balance;
        name=account.name;
        email=account.email;
        phoneNumber=account.phoneNumber;
    }
    public void depositMoney(double depositedMoney){
        this.balance+=depositedMoney;
        System.out.println("Deposit is successful, new balance is: "+this.balance);
    }

    public void withdrawMoney(double withdrawMoney){
        if(balance<withdrawMoney){
            System.out.println("Insufficient funds!");
        }else{
            balance-=withdrawMoney;
            System.out.println("Successfully withdrawed Rs."+withdrawMoney+" .Your new balance is: Rs."+balance);
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
}
