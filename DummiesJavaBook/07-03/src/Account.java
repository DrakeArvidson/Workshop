import static java.lang.System.out;

public class Account {
    String name;
    private String address;
    double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") has $");
        out.print(balance);
        out.println("");
    }
}
