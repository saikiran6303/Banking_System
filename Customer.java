import java.io.*;
import java.lang.*;
import java.util.*;
public class Customer implements Serializable
{
    public String CName;
    public  account;
    public  String Branch_Name;
    public  String Address;
    public String Gender;
    public int age;
    ArrayList<Transactions> t;
    public Customer(String Cname , String Address, int age ,String Branch_Name, String Gender)
   {
     this.CName=Cname;
     this.Branch_Name = Branch_Name;
     this.Address = Address;
     this.age=age;
     this.Gender=Gender;
    // t = new ArrayList<Transactions>();
   }
   public Customer()
   {
     // t = new ArrayList<Transactions>();
   }
   public int getAge()
    {
      return age;
    }
    public String getGender() 
    {
      return Gender;
    }
     public void setCname(String name)
     {
         this.CName = name;
     } 
     public String GetBranch_Name()
     {
       return Branch_Name;
     } 
     public String getname()
     {
       return CName;
     }
     public Account GetAccount()
     {
       return account;
     }    
     public void setAccount(Account account)
     {
       this.account=account;
     }   
     public  void Show()
     {
       System.out.println();
       System.out.println("Name of the customer :"+CName);
       System.out.println("Branch name is :"+Branch_Name);
       System.out.println("age is "+age);
       System.out.println("address is "+Address);
       System.out.println("gender :"+Gender);
     }
 /* public void makeTransaction(String from, String to)
  {
      Transactions t1 = new Transactions(from, to);
      Transactions t2 = new Transactions(from, to); 
      t.add(t1);
      t.add(t2);
  }*/
  
}