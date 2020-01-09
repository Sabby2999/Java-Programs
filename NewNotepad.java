import javax.swing.*;
class NewNotepad
{
	JFrame jf;
	JTextArea jta;
	NewNotepad()
	{
		jf = new JFrame("Notepad");
		jta = new JTextArea();
		jta.setBounds(0,0,600,600);
		jf.add(jta);
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true);
	}	
	public static void main(String s[])
	{
		new NewNotepad();
	}
}