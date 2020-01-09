import javax.swing.*;
import java.awt.event.*;
class Sum_Swing implements ActionListener
 {
	JFrame jf;
	JLabel en1,en2,ssum;
	JTextField n1,n2,sum_txt;
	JButton ad;
	Sum_Swing()
	{
		jf = new JFrame("ADDITION");
		
		en1 = new JLabel("Enter the Number A ");
		en2 = new JLabel("Enter the Number B ");
		ssum = new JLabel("SUM");
		
		n1 = new JTextField();
		n2 = new JTextField();
		sum_txt = new JTextField();

		ad = new JButton("ADD");

		en1.setBounds(10,10,200,30);
		en2.setBounds(10,50,200,30);
		ssum.setBounds(10,90,200,30);
		n1.setBounds(220,10,200,30);
		n2.setBounds(220,50,200,30);
		sum_txt.setBounds(220,90,200,30);
		ad.setBounds(100,130,200,30);		

		jf.add(en1);		
		jf.add(en2);
		jf.add(ssum);
		jf.add(n1);
		jf.add(n2);
		jf.add(sum_txt);		
		jf.add(ad);

		ad.addActionListener(this);

		jf.setSize(470,230);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == ad)
		{

			int a= Integer.parseInt(n1.getText());
			int b= Integer.parseInt(n2.getText());
			int c=a+b;
		
			sum_txt.setText(""+c);
		}
	}	
 	public static void main(String s[])
	{
		new Sum_Swing();
	}
}