import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmoperationInter op=new AtmoprationImple();

   int atmNumber=12345;
   int atmPin=1520;
   Scanner scn=new Scanner(System.in);
        System.out.println("----------Welcome to ATM Machine--------");
        System.out.print("Enter ATM Number : ");
        int atmnumber=scn.nextInt();
        System.out.print("Enter ATM Pin : ");
        int pin=scn.nextInt();;
        if(atmnumber==atmNumber && pin==atmPin) {
            while(true){
                System.out.println("1.View Avalilable Balance\n2.Withdraw Amount\n3.Deposite Money\n4.viewMiniStatement\n5.Exit");
                System.out.println("Enter Your Choice : ");
                int Choice=scn.nextInt();
                if(Choice==1){
                   op.viewBalance();
                }

                else if(Choice==2){
                    System.out.println("Enter WithDraw Amount : ");
                    double withdraw=scn.nextDouble();
                    op.withDrawAmount(withdraw);

                }

                else if(Choice==3){
                    System.out.println("Enter Deposite Money : ");
                     double depositeMoney=scn.nextDouble();
                     op.depositeMoney(depositeMoney);


                }else if(Choice==4){
                    op.viewMiniStatement();

                }else if(Choice==5){
                    System.out.println("Collect Your ATM card \n Thank You For Visiting ATM Machine.");
                    System.exit(0);
                }else{
                    System.out.println("Please Enter Valid Choice : ");
                }
            }
        }
        else {
            System.out.println("Check Your ATM pin OR ATM Number !!");
            System.exit(0);
        }
    }
}