import java.util.*;
import java.sql.Timestamp;
class Transactions
{  
    String from;
    String to;
    String TimeStamp;
    double Amount_Value;
   private double balance;
  /* public Transactions(String from,String to)
   {
     this.from=from;
     this.to=to;
   }
   public double Getbalance()
    {
     return balance;
    }
    public boolean canDebit(double Amount_Value)
    {
      return (Amount_Value<=balance);
    }
    public String debit(double Amount_Value)
     {
       if(canDebit(Amount_Value))
       {
         System.out.println("Current balance is Rs"+balance);       
         balance -= Amount_Value;
         System.out.println("Current balance after the transaction is Rs"+ balance);
         Date date= new Date();
         long time = date. getTime();
         Timestamp ts = new Timestamp(time);
         System.out.println("Amount debited at "+TimeStamp+"from account number"+Account_No);
         return "Rs" + Amount_Value +" has been debited from Acount number " + Account_No;
        }
       else
        {
         return "Account number " + Account_No +" has insufficient amounts to debit" +Amount_Value;
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
     return "Rs" + anAmount +" has been credited from Account number " + Account_No +" at "+ts;
    }*/
  
}