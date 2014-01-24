import javax.swing.*; 
  
public class TestAcountApplication { 
	public static void main(String[] args) { 
    	boolean done = false; 
        	String option = 
            	JOptionPane.showInputDialog("Enter an account type (checking or savings):"); 
        	
            if(option.equalsIgnoreCase("checking")){ 
            	String str = JOptionPane.showInputDialog("Enter an account ID (5 integers):"); 
                int ID = Integer.parseInt(str); 
                String name = JOptionPane.showInputDialog("Enter an account name:"); 
                CheckingAccount cAccount = new CheckingAccount(ID, name, 0.0); 
                
                while(!done){ 
                	str = JOptionPane.showInputDialog("Enter an transaction (deposit or withdraw):"); 
                    if(str.equalsIgnoreCase("deposit")){ 
                    	str = JOptionPane.showInputDialog("Enter the amount to deposit:"); 
                        double m = Double.parseDouble(str); 
                        cAccount.deposit(ID, m); 
                    } 
                    else if (str.equalsIgnoreCase("withdraw")){ 
                    str = JOptionPane.showInputDialog("Enter the amount to withdraw:"); 
                    double n = Double.parseDouble(str); 
                    cAccount.withdraw(ID, n); 
                    } 

                    str = JOptionPane.showInputDialog("Enter a choice (quit or not):"); 
                    if(str.equalsIgnoreCase("quit")){ 
                	done = true; 
                    } 
                }              
            } 
        
            else if(option.equalsIgnoreCase("savings")){ 
            	//supply the missing code 
            } 
            
            else { 
            	System.out.println("Wrong input, system exits."); 
            } 
} 
} 