package _99练习;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _02Cal extends JFrame	implements ActionListener
{
	JLabel label;
	String ys = "";
	String l1 = null,l2;
	int a1=0,a2=0,a=0;
	public _02Cal ()
	{
		JPanel p = new JPanel();
		GridLayout l = new GridLayout(4,4,2,2);
		p.setLayout(l);
		this.add(p);
		String[] str = new String[]{"/","c","-","*",
									"7","8","9","+",
									"4","5","6","=",
									"1","2","3","0",
									};
		for(int i=0;i<16;i++)
		{
			JButton b = new JButton(""+str[i]);
			b.addActionListener(this);
			p.add(b);
		}
		label = new JLabel("0");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(label,BorderLayout.NORTH);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 参考windows计算器，制作一个简单计算器（只有1234567890加减乘除=清除 这些按钮）
		_02Cal f = new _02Cal();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String s =label.getText();
		if(ys != null)
		{
			label.setText(e.getActionCommand());
		}
		if(s.charAt(1) == '0')
		{
			label.setText(s.substring(2, s.length()));
		}
		
		switch(e.getActionCommand())
		{
		case "c":
			label.setText("0");
			break;
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "0":
			label.setText(label.getText()+e.getActionCommand());
			l1 = label.getText();
			a1 = Integer.valueOf(l1);
			break;
		case "+":
			ys = "+";
			a2 = a1;
			break;
		case "-":
			ys = "-";
			a2 = a1;
			break;
		case "*":
			ys = "*";
			a2 = a1;
			break;
		case "/":
			ys = "/";
			a2 = a1;
			break;
		case "=":
			switch(ys)
			{
			case"+":
				a = a1 + a2;
				ys = "";
				label.setText(a+" ");
			break;
			case"-":
				a = a2 - a1;
				ys = "";
				label.setText(a+" ");
			break;
			case"*":
				a = a1 * a2;
				ys = "";
				label.setText(a+" ");
			break;
			case"/":
				a = a2 / a1;
				ys = "";
				label.setText(a+" ");
			break;
			}
		}
	}
}
