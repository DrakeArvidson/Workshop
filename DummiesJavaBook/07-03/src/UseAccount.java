class UseAccount {

    public static void main(String args[]) {
        Account Account1 = new Account();
        Account Account2 = new Account();
        Account Account3 = new Account();

        Account1.name = "Barry Burd";
        Account1.address = "222 Cyberspace Lane";
        Account1.balance = 24.02;

        Account2.name = "Jane Q. Public";
        Account2.address = "111 Consumer Street";
        Account2.balance = 55.63;

        Account3.name = "Johnny Smith";
        Account3.address = "3rd cardboard box on the left";
        Account3.balance = 999999.01;


        Account1.display();
        Account2.display();
        Account3.display();
    }
}
