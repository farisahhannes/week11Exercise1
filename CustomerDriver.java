import javax.swing.JOptionPane; //asal dri javax
//JOptionPane is a dialogue

public class CustomerDriver {
	public static void main(String[] args) {
		int accountNo;
		double balance;
		String input;

		// accountNo = 0;
		// balance = 0;
		
		input = JOptionPane.showInputDialog(null, "Enter account no: ");
		accountNo = Integer.parseInt(input);
		System.out.println("Acc no: " + accountNo);
		input = JOptionPane.showInputDialog(null, "Enter balance: ");
		balance = Integer.parseInt(input);
		System.out.println("Acc balance: " + balance);

		Customer cus1 = new Customer(accountNo, balance);
		try {
			cus1.SemakBaki();
			// Customer cus1 = new Customer(accountNo, balance);
		} catch(HighBalanceException e) {
			System.out.println(e);
			// System.out.println(e.getMessage());
		}
		System.out.println("Semua OK :)");
	}
}