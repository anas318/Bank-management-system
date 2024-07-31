package def_pkg;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import javax.swing.*;

public class Bm_System {
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("Bank Managment System");
		
		
		GUI interf = new GUI();
		Login_Account user = new Login_Account();
	    interf.openSignInForm(frame, user);
		frame.setSize(800,500);  
		frame.setVisible(true);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}