class Main {
  public static void main(String[] args) {

    // create cust1
    Account cust1 =  new Account(); // CReate an account object
    cust1.deposit(500);

    // Create cust2
    Account cust2 = new Account();
    cust2.deposit(100);

    System.out.println("Cust1 has " + cust1.getBalance() + " in thier account\n");

    System.out.print("Cust2 has a balanance of ");
    System.out.println(cust2.getBalance());

  }
}