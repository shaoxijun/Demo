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
		JCheckBox b1 = new JCheckBox("抽烟");
		JCheckBox b2 = new JCheckBox("喝酒");
		JCheckBox b3 = new JCheckBox("烫头发");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		// 3. 
		JButton btn = new JButton("确定");
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(RadioButtonAdnCheckBoxDemo.this, "你输入性别"+(male.isSelected()?"男":"女"));
			}
		});
		p.add(btn);

		
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
