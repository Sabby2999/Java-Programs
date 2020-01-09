import javax.swing.*;
import java.awt.event.*;
class Notepad_Swing implements ActionListener
{
	JFrame jf;
	JTextArea jta;
	JMenuBar jmb1;
	JMenu file,edit,hlp,open;
	JMenuItem New,save,ext, file1,file2;
	Notepad_Swing()
	{
		jf = new JFrame("Notepad");
		jta = new JTextArea();
		jta.setBounds(0,0,600,600);


		jmb1 = new JMenuBar();	
		
		file = new JMenu("File");
		edit = new JMenu("Edit");
		hlp = new JMenu("Help");
	
		New = new JMenuItem("New");
		open = new JMenu("Open");
		save = new JMenuItem("Save");
		ext = new JMenuItem("Exit");
		file1 = new JMenuItem("File1");
		file2 = new JMenuItem("File2");
		
		jf.setJMenuBar(jmb1);
		jf.add(jta);
		jmb1.add(file);
		jmb1.add(edit);
		jmb1.add(hlp);
		file.add(New);
		file.add(open);
		file.add(save);
		file.add(ext);
		open.add(file1);
		open.add(file2);
	
		New.addActionListener(this);
			
		jf.setSize(600,600);
		jf.setLayout(null);
		jf.setVisible(true); 
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==New)
		{
		 	jf.setVisible(false);
			//jf.dispose(); //clean the working of current frame	
			new NewNotepad();
			//new Notepad_Swing();
		}
	}
	public static void main(String s[])
	{
		new Notepad_Swing();
	}
}





















