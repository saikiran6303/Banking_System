import java.util.ArrayList;
import java.util.Scanner;
public class Bank
{
  static ArrayList<Customer> customers;
  static ArrayList<Account> accounts;
  static Scanner sc;
    public static void  showAccounts()
    {
      for(int i=0;i<accounts.size();i++)
      {
        accounts.get(i).show();
      }
    }
    
    public static void addAccount()
    {
      sc.nextLine();
      System.out.println("enter customer Name:");
      String name = sc.nextLine();
      System.out.println("enter address of the customer :");
      String address=sc.nextLine();
      System.out.println("enter the age of the customer:");
      int age = sc.nextInt();
      System.out.println("enter the branch name:");
      String branch=sc.nextLine();
      sc.nextLine();
      System.out.println("enter gender:");
      String gender=sc.nextLine();
       Customer newcustomer = new Customer(name,address,age,branch,gender);
        Account newaccount = null;
       System.out.println("enter the balance");
       double balance=sc.nextDouble();
        newaccount = new Account(balance);
        accounts.add(newaccount);
        customers.add(newcustomer);
        System.out.println("account created:::!!!!");
    }


     public static void main(String args[])
     {
       customers = new ArrayList<Customer>();
       accounts = new ArrayList<Account>();
       sc=new Scanner(System.in);
       addAccount();
       showAccounts();
       
     } 
    }