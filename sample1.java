public static void main(String args[])
  {
    ArrayList<Customer> customer = new ArrayList<Customer>();
    Customer oc = new Customer();
    Customer s = new Customer();
    oc.setCname("saikiran");
    s.setCname("yash");
    System.out.println(oc.GetAccount_No());
    System.out.println(oc.getname());
    System.out.println(s.GetAccount_No());
    System.out.println(s.getname());
    customer.add(oc);
    customer.add(s);
    System.out.println(customer.get(0).getname());
  }