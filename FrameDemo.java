import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.BorderLayout;
// import java.awt.GridLayout;
import java.awt.FlowLayout;

public class FrameDemo implements ActionListener{
	public void createAndShowGUI() {
		JFrame frame = new JFrame("Frame Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setTitle("Title test Frame Demo");
		frame.setSize(300, 300);
		// frame.setLayout(new FlowLayout());
		//helps auto set margins so that it shows no the inside no matter what window size used

		// JPanel panel = new JPanel();
		// panel.setSize(100, 50);	//will ignored cause frame overrules panel 
		// //unless do frame.setLayout(null);
		// panel.setBackground(Color.lightGray);

		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Long named Button 2");
		// JButton button3 = new JButton("3");
		// JButton button4 = new JButton("4");
		// JButton button5 = new JButton("5");
		// JButton button6 = new JButton("6");

		JLabel label = new JLabel("DITP3113 - OOP");
		JTextField name = new JTextField(20);
		JTextArea address = new JTextArea(5, 20);
		String[] pilih = {"1", "2", "3", "4", "5"};
		JComboBox box = new JComboBox(pilih);
		box.setSelectedIndex(0);
		JRadioButton b1 = new JRadioButton("Pizza");
		JRadioButton b2 = new JRadioButton("Maccaroni");
		JRadioButton b3 = new JRadioButton("Burger", true);
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		// JTextField name = new JTextField("Enter name");
		// JTextField name = new JTextField("Enter name", 20);

		// frame.add(panel);
		frame.setLayout(new FlowLayout());
		button2.addActionListener(this);
		// frame.setLayout(new GridLayout(3, 2));
		frame.add(button1);
		frame.add(button2);
		frame.add(label);
		frame.add(name);
		frame.add(address);
		frame.add(box);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		// frame.add(button3);
		// frame.add(button4);
		// frame.add(button5);
		// frame.add(button6);
		// frame.add(button1, BorderLayout.NORTH);
		// frame.add(button2, BorderLayout.CENTER);
		// frame.add(button3, BorderLayout.SOUTH);
		// frame.add(button4, BorderLayout.EAST);
		// frame.add(button5, BorderLayout.WEST);
		frame.setVisible(true); //mesti buat klu x, dia x visible
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("DITP3113 dupdida");
	}

	public static void main(String[] args) {
		FrameDemo demo1 = new FrameDemo();
		demo1.createAndShowGUI();
	}
}