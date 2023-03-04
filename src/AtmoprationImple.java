import java.util.HashMap;
import java.util.Map;

public class AtmoprationImple implements AtmoperationInter{
    ATM atm=new ATM();
    Map<Double,String> miniState=new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance" +
                " is : "+atm.getBalance());
    }

    @Override
    public void withDrawAmount(double withDrawAmount) {
        if(atm.getBalance()-withDrawAmount<0){

            System.out.println("Insufficient Balance !!");
        }else {

            atm.setBalance(atm.getBalance()-withDrawAmount);
            System.out.println("Congrats , WithDraw Successful \n Collect Your Cash : " +withDrawAmount);
            miniState.put(withDrawAmount," WithDraw Amount");
            viewBalance();
        }
    }

    @Override
    public void depositeMoney(double depositeMoney) {
        miniState.put(depositeMoney," Deposited Money");
        System.out.println(depositeMoney+" Deposite Successful !!");
        atm.setBalance(atm.getBalance()+depositeMoney);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
     for(Map.Entry<Double,String> m:miniState.entrySet()){
         System.out.println(m.getKey()+""+m.getValue());
     }
    }
}
