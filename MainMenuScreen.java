import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
 
public class MainMenuScreen extends JFrame implements ActionListener{
 
    JMenu customerMenu, accountMenu, transactionMenu, fileMenu;
    ArrayList<Customer> custList;
    ArrayList<BankAccount> accountList;
    ArrayList<Transaction> transactionList;
    JTextArea area;
 
    public static void main(String args[]){
         JOptionPane.showMessageDialog(null, "Welcome to my Bank!" );
        MainMenuScreen win = new MainMenuScreen();
        win.setVisible(true);
    }
 
    public MainMenuScreen(){
            setTitle("My Bank");
            setSize(600,600);
            setLocation(250,200);
            // exit as the default closing operation
            // see the other possibilities in JFrame class
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            JMenuBar bar = new JMenuBar();
            setJMenuBar(bar);
            createFileMenu();
            bar.add(fileMenu);
            createCustomerMenu();
            bar.add(customerMenu);
            createAccountMenu();
            bar.add(accountMenu);
            createTransactionMenu();
            bar.add(transactionMenu);
            custList = new ArrayList<Customer>();
            accountList = new ArrayList<BankAccount>();
            transactionList = new ArrayList<Transaction>();
            area = new JTextArea();
 
            createUserInterface();
    } // end constructor
 
    public void saveData() {
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("banktrans.data"));
            os.writeObject(custList);
            os.writeObject(accountList);
            os.writeObject(transactionList);
            os.close();
                JOptionPane.showMessageDialog (null,"Data Saved");
        }
        catch (IOException e){
            JOptionPane.showMessageDialog (null,"Save Aborted");
            e.printStackTrace();
        }
    }
 
    public void loadData() {
    try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("banktrans.data"));
            custList = (ArrayList<Customer>) is.readObject();
            accountList = (ArrayList<BankAccount>) is.readObject();
            transactionList = (ArrayList<Transaction>) is.readObject();
            is.close();
            JOptionPane.showMessageDialog (null,"Data loaded");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog (null,"Load Aborted");
            e.printStackTrace();
        }
    }
 
    public void addCustomer(){
        String fname = JOptionPane.showInputDialog(null, "Enter Customers First Name");
 
        custList.add(new Customer(fname));
 
        String lname = JOptionPane.showInputDialog(null, "Enter Customers  Surname");
 
        custList.add(new Customer(lname));
 
        //int age = JOptionPane.showInputDialog(null, "Enter Customers age");
 
    //  custList.add(new Customer(age));
 
        //char gender = JOptionPane.showInputDialog(null, "Enter Customers gender");
        //custList.add(new Customer(gender));
    }
 
 
    public void displayCustomers(){
        area.setText("Customer List\n");
        for (Customer c : custList)
             area.append(c.toString() + "\n");
             JOptionPane.showMessageDialog(null,area);
    }
    public void addAccount() {
        String AccNo = JOptionPane.showInputDialog(null,"Account No: ");
 
 
 
 
        }
 
 
    public void displayAccounts() {
        area.setText("Account List\n");
        for (BankAccount a : accountList)
            area.append(a.toString() + "\n");
        JOptionPane.showMessageDialog(null,area);
    }
 
    public void Transaction(){
 
        int cusId = Integer.parseInt(JOptionPane.showInputDialog("Enter a customer number " +
            " between 1 and " + custList.size()));
 
        int accountId = Integer.parseInt(JOptionPane.showInputDialog("Pick an account number " +
            " between 1 and " + accountList.size()));
 
 
        Transaction transaction = new Transaction(custList.get(cusId - 1), accountList.get(accountId - 1));
        accountList.get(accountId-1).lodgement();
        Transaction.setAmount(0.00);
        Transaction.setDate("Thursday");
 
        transactionList.add(transaction);
 
    }
    public void displayTransactions(){
 
        area.setText("Transaction List\n");
        for (Transaction t : transactionList){
            area.append(t.toString());
//          if (t.getTransaction() instanceof Lodgement){
 
            }
        }
 
    //  JOptionPane.showMessageDialog(null,area);
 
 
    public void Withdrawal() {
 
 
 
    }
 
        public void actionPerformed(ActionEvent c){
            String c = c.getActionCommand();
            if (c.equalsIgnoreCase("Add a customer"))
 
                addCustomer();
            else if (c.equalsIgnoreCase("Display All Customers")){
 
                displayCustomers();
 
        }
        else
            JOptionPane.showMessageDialog(null, "something strange happening");
}
 
    private void createFileMenu(){
        fileMenu = new JMenu("File");
        JMenuItem item = new JMenuItem("Save All Data");
        item.addActionListener(this);
        fileMenu.add(item);
 
        item = new JMenuItem("Load All Data");
        item.addActionListener(this);
        fileMenu.add(item);
        fileMenu.addSeparator();
 
        item = new JMenuItem("Quit");
        item.addActionListener(this);
        fileMenu.add(item);
    }
 
        private void createAccountMenu(){
        accountMenu = new JMenu("Accounts");
        JMenuItem item = new JMenuItem("Add an Account");
        item.addActionListener(this);
        accountMenu.add(item);
 
        item = new JMenuItem("Display All Accounts");
        item.addActionListener(this);
        accountMenu.add(item);
    }
    private void createTransactionMenu(){
        transactionMenu = new JMenu("Transactions");
        JMenuItem item = new JMenuItem("Process a Transaction");
        item.addActionListener(this);
        transactionMenu.add(item);
 
        item = new JMenuItem("Display All Transactions");
        item.addActionListener(this);
        transactionMenu.add(item);
 
    }
 
 
    private void createCustomerMenu(){
        customerMenu = new JMenu("Customer");
        JMenuItem item = new JMenuItem("Add a customer");
        item.addActionListener(this);
        customerMenu.add(item);
 
        item = new JMenuItem("Display All Customers");
        item.addActionListener(this);
        customerMenu.add(item);
    }
//  accountList = (ArrayList<BankAccount>)
 private void createUserInterface() {
 
    private JPanel inputDetailJPanel;
 
     private JLabel NameJLabel;
    private JTextField NameJTextField;
    inputDetailJPanel
 
    private JLabel AccountnumJLabel;
    private JTextField AccountnumJTextField;
 
    private JLabel BalanceJLabel;
    private JTextField BalanceJTextField;
 
     private JLabel LodgeJLabel;
    private JTextField LodgeJTextField;
 
     private JLabel WithdrawJLabel;
    private JTextField WithdrawJTextField;
 
     private JButton CreateAccountJButton;
 
     private JButton DeleteAccountJButton;
 
    private JButton TransactionJButton;
 
     private JLabel displayJLabel;
    private JTextArea displayJTextArea;
 
    inputDetailJPanel.add(area);
      private int BankCount = 0;
 
      private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
 
 
        // get content pane for attaching GUI components
       Container contentPane = getContentPane();
        contentPane.setLayout(null);
 
        inputDetailJPanel = new JPanel();
        inputDetailJPanel.setBounds(16, 16, 208, 218);
        inputDetailJPanel.setBorder(new TitledBorder("Input Details"));
        inputDetailJPanel.setLayout(null);
        contentPane.add(inputDetailJPanel);
 
       NameJLabel = new JLabel();
        NameJLabel.setBounds(8, 32, 90, 23);
        NameJLabel.setText("Name:");
        inputDetailJPanel.add(NameJLabel);
 
 
        NameJTextField = new JTextField();
        NameJTextField.setBounds(104, 32, 88, 21);
        NameJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(NameJTextField);
 
 
 
       AccountnumJLabel = new JLabel();
        AccountnumJLabel.setBounds(8, 56, 100, 23);
        AccountnumJLabel.setText("Account Number:");
        inputDetailJPanel.add(AccountnumJLabel);
 
 
       AccountnumJTextField = new JTextField();
        AccountnumJTextField.setBounds(112, 56, 80, 21);
        AccountnumJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(AccountnumJTextField);
 
 
        BalanceJLabel = new JLabel();
        BalanceJLabel.setBounds(8, 80, 60, 23);
        BalanceJLabel.setText("Balance:");
        inputDetailJPanel.add(BalanceJLabel);
 
 
        BalanceJTextField = new JTextField();
        BalanceJTextField.setBounds(112, 80, 80, 21);
        BalanceJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(BalanceJTextField);
 
 
         LodgeJLabel = new JLabel();
        LodgeJLabel.setBounds(8, 104, 80, 23);
        LodgeJLabel.setText("Lodgement:");
        inputDetailJPanel.add(LodgeJLabel);
 
 
        LodgeJTextField = new JTextField();
        LodgeJTextField.setBounds(112, 104, 80, 21);
        LodgeJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(LodgeJTextField);
 
        WithdrawJLabel = new JLabel();
        WithdrawJLabel.setBounds(8, 128, 60, 23);
        WithdrawJLabel.setText("Withdraw:");
        inputDetailJPanel.add(WithdrawJLabel);
 
 
 
        WithdrawJTextField = new JTextField();
        WithdrawJTextField.setBounds(112, 128, 80, 21);
        WithdrawJTextField.setHorizontalAlignment(JTextField.RIGHT);
        inputDetailJPanel.add(WithdrawJTextField);
 
 
         CreateAccountJButton = new JButton();
        CreateAccountJButton.setBounds(112, 152, 80, 24);
        CreateAccountJButton.setText("Create");
        inputDetailJPanel.add(CreateAccountJButton);
        CreateAccountJButton.addActionListener(
 
        new ActionListener() {
            // event handler called when CreateAccountJButton
            // is clicked
            public void actionPerformed(ActionEvent event) {
                CreateAccountJButtonActionPerformed(event);
            }
 
        }
 
        ); // end call to addActionListener
 
        // set up DeleteAccountButton
        DeleteAccountJButton = new JButton();
        DeleteAccountJButton.setBounds(16, 152, 80, 24);
        DeleteAccountJButton.setText("Delete");
        inputDetailJPanel.add(DeleteAccountJButton);
        DeleteAccountJButton.addActionListener(
 
        new ActionListener() // anonymous inner class
                {
                    // event handler called when DeleteAccountJButton
                    // is clicked
                    public void actionPerformed(ActionEvent event) {
                        DeleteAccountJButtonActionPerformed(event);
 
                    }
 
                }
 
                ); // end call to addActionListener
 
        // set up TransactionJButton
        TransactionJButton = new JButton();
        TransactionJButton.setBounds(16, 180, 176, 24);
        TransactionJButton.setText("Make Transaction");
        inputDetailJPanel.add(TransactionJButton);
        TransactionJButton.addActionListener(
 
        new ActionListener() // anonymous inner class
                {
                    // event handler called when TransactionJButton
                    // is clicked
                    public void actionPerformed(ActionEvent event) {
                        TransactionJButtonActionPerformed(event);
                    }
 
                } // end anonymous inner class
 
                ); // end call to addActionListener
 
        // set up displayJLabel
        displayJLabel = new JLabel();
        displayJLabel.setBounds(240, 16, 150, 23);
        displayJLabel.setText("Account Details:");
        contentPane.add(displayJLabel);
 
        // set up displayJTextArea
        displayJTextArea = new JTextArea();
        displayJTextArea.setBounds(240, 48, 402, 184);
        displayJTextArea.setEditable(false);
        contentPane.add(displayJTextArea);
 
        // set properties of application's window
        setTitle("Bank Accounts"); // set title bar string
        setSize(670, 308); // set window size
        setVisible(true); // display window
 
    } // end method createUserInterface
 
    private void CreateAccountJButtonActionPerformed(ActionEvent event) {
        // System.out.println("Create Account Button Clicked");
        Name = NameJTextField.getText();
        Accountnum = Integer.parseInt(AccountnumJTextField.getText());
        Balance = Integer.parseInt(BalanceJTextField.getText());
 
        displayJTextArea.setText(Name + " " + Accountnum +" " + Balance);

    }
 
}
 
// end  class


