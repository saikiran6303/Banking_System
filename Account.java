public class Account 
{
    public double Account_id;
    public static double iDcounter=10024;
    public double Balance;
    public Customer customer;
     
     public Account()
     {
         Balance=0;
         this.Account_id=iDcounter++;
     }
     public Account(double Balance)
     {
         this.Balance=Balance;
         this.Account_id=iDcounter++;
     }
     public double getAccountId()
     {
         return Account_id;
     }
     public double getBalance()
     {
         return Balance;
     }
     public void setBalance(double Balance)
     {
         this.Balance=Balance;
     }
     public void setIdcounter(double iDcounter)
     {
         Account.iDcounter=iDcounter;
     }
     public void setCustomer(Customer customer)
     {
         this.customer=customer;
     }
     public Customer getCustomer()
     {
         return customer;
     }
     public void  show()
     {
       
       System.out.println("account No is "+Account_id);
       System.out.println("balance in rs"+Balance);
       System.out.println("*******************************");
        customer.Show();
     }
}