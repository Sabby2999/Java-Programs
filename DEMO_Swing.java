import javax.swing.*;
class DEMO_Swing
{
	JFrame jf;
	JLabel jl;
	JButton jb;
	JTextField jtf;
	JPasswordField jpf;
	JTextArea jta;
	JRadioButton jrb1,jrb2;
	DEMO_Swing()
	{
		jf = new JFrame();
		jl = new JLabel("Hello Swing");
		jb = new JButton("Click Here");
		jtf = new JTextField("Hii");
		
		jrb1 = new JRadioButton("Male");		
		jrb2 = new JRadioButton("Female");		
		jrb1.setBounds(30,230,100,50);
		jrb2.setBounds(150,230,100,50);
		ButtonGroup bg = new ButtonGroup(); //For Single Selection 
		bg.add(jrb1);
		bg.add(jrb2);

		jpf = new JPasswordField();
		jpf.setBounds(30,270,100,50);
		jta = new JTextArea();
		jta.setBounds(150,270,100,50);

		jtf.setBounds(30,170,100,50);
		jb.setBounds(30,100,100,50);
		jl.setBounds(30,30,300,50);

		jf.add(jpf);
		jf.add(jta);
		jf.add(jrb1);
		jf.add(jrb2);
		jf.add(jtf);
		jf.add(jl);
		jf.add(jb);
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main(String s[])
	{
		new DEMO_Swing();
	}
}