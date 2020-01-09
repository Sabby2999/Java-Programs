import javax.swing.*;
import java.awt.event.*;

class Login_Swing implements ActionListener
{
	JFrame jf;
	JLabel eun,epass;
	JTextField un;
	JPasswordField pass;
	JButton login,register;
	Login_Swing()
	{
		jf = new JFrame("LOGIN");
		
		eun = new JLabel("User Name ");
		eun.setBounds(10,10,150,30);
		epass = new JLabel("Password ");
		epass.setBounds(10,50,150,30);	

		un = new JTextField();
		un.setBounds(170,10,150,30);
		
		pass = new JPasswordField();
		pass.setBounds(170,50,150,30);

		login = new JButton("LOGIN");
		login.setBounds(35,120,100,30);
		login.addActionListener(this);
		register = new JButton("REGISTER");
		register.setBounds(195,120,100,30);
//		register.addActionListener(this);
	
		jf.add(eun);
		jf.add(epass);
		jf.add(un);
		jf.add(pass);
		jf.add(login);
		jf.add(register);
		
		jf.setSize(400,300);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
			String name = un.getText();
			String password = pass.getText();
			if(name.equals("Sahib")&&password.equals("12345"))
				
			else 
				
		}
	}
	public static void main(String s[])
	{
		new Login_Swing();
	}
}













