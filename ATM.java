import java.lang.System;
import java.util.*;

class ATM {

    public static void main(String args[])
    {
       int pin = 2219;
       int balance = 1000;
       
       int creditamount = 0;
       int debitamount = 0;

       Scanner scan = new Scanner(System.in);

       System.out.println("Enter Your PIN Number");
       int password =  scan.nextInt();
       scan.nextLine();

       if(password==pin)
       {
        System.out.println("Enter Your Name");
        
        String name = scan.nextLine();
        System.out.println("Welcome " + name);
        boolean flag = true;
        while(flag)
        {
        System.out.println("/PRESS 1 TO CHECK YOUR BALANCE/");
        System.out.println("/PRESS 2 TO CREDIT AMOUNT/");
        System.out.println("/PRESS 3 TO DEBIT AMOUNT/");
        System.out.println("/PRESS 4 TO PRINT RECEIPT/");
        System.out.println("/PRESS 5 TO EXIT/");

        int option = scan.nextInt();

        switch(option)
        {
        case 1:
            System.out.println("YOUR CURRENT BALANCE IS " + balance);
            break;
        case 2:
            System.out.println("HOW MUCH AMOUNT YOU WANT TO ADD");
            System.out.println("ONLY 100's , 200's , 500's");
            creditamount = scan.nextInt();
            System.out.println("PROCESSING.........");
            System.out.println("YOUR MONEY HAS SUCCESSFULLY CREDITED");
            balance = creditamount + balance;
            System.out.println("YOUR CURRENT BALANCE IS " + balance);
            break;
        case 3:
            System.out.println("ENTER THE AMOUNT YOU WANT TO DEBIT");
            debitamount = scan.nextInt();
            System.out.println("PROCESSING.........");
            if(debitamount>balance)
            {
                System.out.println("INSUFFICIENT BALANCE");
            }
            else{
                System.out.println("MONEY DEBITED SUCSESSFULLY");
            }
            balance = balance - debitamount;
            System.out.println("YOUR CURRENT BALANCE IS " + balance);
            break;
        case 4:
        System.out.println("DO YOU WANT RECEIPT ?");
        System.out.println(" FOR Credited 'c' FOR debited 'd' ");
            char ch = scan.next().charAt(0);
            if(ch=='C' || ch=='c')
            {
            System.out.println("**********ALL INDIA BANK**********");
            System.out.println("DATE : 02/07/2024      TIME : 20:05 ");
            System.out.println("CARD NUMBER **** **** **** 5638");
            System.out.println("DEPOSIT Rs " + creditamount);
            System.out.println("TOTAL BALANCE IS " + balance);
            System.out.println("**********THANKYOU FOR USING ALL INDIA BANK**********");
            }
            else if(ch=='D' || ch=='d'){
                System.out.println("**********ALL INDIA BANK**********");
                System.out.println("DATE : 02/07/2024      TIME : 20:05 ");
                System.out.println("CARD NUMBER **** **** **** 5638");
                System.out.println("DEBITED Rs " + debitamount);
                System.out.println("TOTAL BALANCE IS " + balance);
                System.out.println("**********THANKYOU FOR USING ALL INDIA BANK**********");
            }
            break;
           
        case 5:
            System.out.println("REMOVE YOUR CARD");
            flag=false;
            break;
            
        default:
            System.out.println("Invalid");
            break;
        }
        }}

else{
    System.out.println("THE ENTERED PIN IS WRONG ");
       }
    }
}

