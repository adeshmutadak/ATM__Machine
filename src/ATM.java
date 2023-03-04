public class ATM {
    private double balance;   //Giving a properties to the ATM class
    private double depositrMoney;
    private  double withDrawMoney;

    public   ATM(){       //created a default consturctor

    }
    //created a getter and setter

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositrMoney() {
        return depositrMoney;
    }

    public void setDepositrMoney(double depositrMoney) {
        this.depositrMoney = depositrMoney;
    }

    public double getWithDrawMoney() {
        return withDrawMoney;
    }

    public void setWithDrawMoney(double withDrawMoney) {
        this.withDrawMoney = withDrawMoney;
    }
}
