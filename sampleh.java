public class Bank
{ 
  public void makeTransaction(String from, String to)
    {
        Transactions t1 = new Transactions(from, to);
        t.add(t1);
    }
   


public static void main(String args[])
{
  ArrayList<Customer> c = new ArrayList<Customer>();
  ArrayList<Branch> b =  new ArrayList<Branch>();
   Customer sai = new Customer("Sai Kiran", "678916","Siddipet","Hyderabad");
        Customers yash = new Customers("Yashash", "826382","Bachupally","Hyderabad");
        c.add(sai);
        c.add(yash);

 public void check(String cname,double Account_no,String Branch_Name, String Address, String Gender)
  {
    for(int i=0;i<c.length;i++)
    {
      if(cname==c.get(i).CName||Account_no==c.get(i).Account_No||Branch_Name==c.get(i).Branch_Name||Gender==c.get(i).Gender)
       {
        System.out.println("Customer exists in the bank, Details are NAME :"+c.get(i).CName+"ACCno :"+c.get(i).Account_No+"BRANCH_NAME"+c.get(i).Branch_Name+"GENDER :"+c.get(i).Gender);
        }
      }
    }
  }  
}
