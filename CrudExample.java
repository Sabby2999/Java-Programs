import javax.swing.*;
import java.awt.event.*;
class CrudExample
{
	JFrame jf;
	JLabel ern,en,eb,eem;
	JTextField rn,n,b,em;
	JButton sav,delet,search,reset,edit,e;
	CrudExample()
	{
		jf = new JFrame("CRUD EXAMPLE");
		
		ern = new JLabel("Roll No");
		ern.setBounds(10,10,200,30);		
		en = new JLabel("Name");
		en.setBounds(10,50,200,30);
		eb = new JLabel("Branch");
		eb.setBounds(10,90,200,30);
		eem = new JLabel("E-Mail Id");
		eem.setBounds(10,130,200,30);

		rn = new JTextField();
		rn.setBounds(220,10,200,30);		
		n = new JTextField();
		n.setBounds(220,50,200,30);
		b = new JTextField();
		b.setBounds(220,90,200,30);
		em = new JTextField();
		em.setBounds(220,130,200,30);
		
		sav = new JButton("Save");
		sav.setBounds(20,170,120,30);
//		sav.addActionListener(this);
		delet = new JButton("Delete");
		delet.setBounds(20,210,120,30);
//		delet.addActionListener(this);
		reset = new JButton("Reset");
		reset.setBounds(160,210,120,30);
//		reset.addActionListener(this);
		edit = new JButton("Edit");
		edit.setBounds(300,170,120,30);
//		edit.addActionListener(this);
		search = new JButton("Search");
		search.setBounds(160,170,120,30);
//		search.addActionListener(this);
		e = new JButton("Exit");
		e.setBounds(600,410,120,30);
//		e.addActionListener(this);

		jf.add(ern);
		jf.add(rn);
		jf.add(en);
		jf.add(n);
		jf.add(eb);
		jf.add(b);
		jf.add(eem);
		jf.add(em);
		jf.add(sav);
		jf.add(delet);
		jf.add(reset);
		jf.add(edit);
		jf.add(search);

		jf.setVisible(true);
		jf.setLayout(null);
		jf.setSize(800,800);	
	}
	public static void main(String s[])
	{
		new CrudExample();
	}
}






















