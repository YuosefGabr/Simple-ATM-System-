import java.util.Scanner;

public class ATM
{
    int bankAccountNumber,pin,userChoice;
    String CustomerName;
    float balanc,Money;

    Scanner scancard = new Scanner(System.in);
    public void setCustomerDetails(){
        System.out.println("What is your PIN ");
        scancard = new Scanner(System.in);
        pin = scancard.nextInt();

        System.out.println("What is your name ");
        Scanner scanCardName = new Scanner(System.in);
        CustomerName = scanCardName.nextLine();

        System.out.println("What is your bank Account number ");
        bankAccountNumber = scancard.nextInt();

        System.out.println("Can you pleas enter your Balance ");
        balanc = scancard.nextInt();

    }
    public void getCustomerDetails(){
        System.out.println("Welcome " + CustomerName);
        System.out.println("Your Bank account number is : " + bankAccountNumber);
        System.out.println("You have " + balanc + " in your card ");
        System.out.println("How can I help you : ");
        Askforservice();

        }
    public void deposit(){
        System.out.println("Pleas enter the amount of money you want to deposit :");
        Scanner scanmoney = new Scanner(System.in);
        Money = scanmoney.nextFloat();
        balanc = balanc+Money;
        System.out.println("Ok , we nade the deposit ");
        System.out.println("You have can : " + balanc);
        System.out.println("Do you something else ");
        Askforservice();
    }
    public void withdrow() {
        System.out.println("How much youy want to withdrow ");
        Scanner scanwithdrowMony = new Scanner(System.in);
        Money = scanwithdrowMony.nextFloat();
        if (Money>balanc){
            System.out.println(" Sorry , you dont have enough money ");
        }
        else {
            balanc = balanc - Money;
            System.out.println("Ok , please take your money");
            System.out.println("you have : " + balanc);

        }
        System.out.println("Do you something else ");

        Askforservice();
    }
    public void checkbalance() {
        System.out.println("Your balance is : " + balanc);
        System.out.println("Do you something else ");

        Askforservice();
    }
    public void Askforservice(){
        System.out.println("1- Deposite \n2- Withdrow \n3- Check Balance Quickly \n4- No");
        userChoice =scancard.nextInt();

        switch (userChoice){
            case 1 :
                deposit();
                break;
            case 2 :
                withdrow();
                break;
            case 3 :
                checkbalance();
                break;
            case 4 :
                System.out.println(" OK , Have a nice day ");
                break;

        }
    }
}
