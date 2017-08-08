package _05常用控件;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtonAdnCheckBoxDemo extends JFrame
{
	public RadioButtonAdnCheckBoxDemo()
	{
		JPanel p = new JPanel();
		this.add(p);
		//单选框
		ButtonGroup g = new ButtonGroup();
		JRadioButton male = new JRadioButton("男");
		JRadioButton female = new JRadioButton("女");
		g.add(male);
		g.add(female);
		p.add(male);
		p.add(female);
		
		//复选框
		
	}
	public static void main(String[] args)
	{
		RadioButtonAdnCheckBoxDemo f = new RadioButtonAdnCheckBoxDemo();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
		System.out.println();
	}
}
