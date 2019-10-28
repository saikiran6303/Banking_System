import java.util.*;
import java.sql.Timestamp;
public class sample
{
    public static double balance;
    public  static double anAmount;
    public static double accountNumber;
   public  static boolean canDebit(double anAmount)
   {
     return anAmount<=balance;
   } 
   public static String debit(double anAmount)
   {
      if(canDebit(anAmount))
      {
       System.out.println("current balance is Rs"+balance);       
       balance -= anAmount;
       System.out.println("current balance after the transaction is Rs"+ balance);
       Date date= new Date();
       long time = date. getTime();
       Timestamp ts = new Timestamp(time);
       System.out.println("Current Time Stamp: " + ts);
       return "Rs" + anAmount +" has been debited from Account number " +   accountNumber;
      }
      else
      {
        return "Account number " +  accountNumber  +" has insufficient funds to debit Rs"    +anAmount;
      }
   }
   public static String credit(double anAmount)
   {
       System.out.println("current balance is Rs " +balance);
       balance += anAmount;
       System.out.println("current balance after the transaction is Rs"+ balance);
       Date date= new Date();
       long time = date. getTime();
       Timestamp ts = new Timestamp(time);
       return "Rs" + anAmount +" has been credited from Account number " + accountNumber +" at "+ts;
   }
   public Customer getCustomer()
   {
      return customer ;
   }
   public static void main(String[]args)
   {
     
   }
}
 