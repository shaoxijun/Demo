package _05���ÿؼ�;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioButtonAdnCheckBoxDemo extends JFrame
{
	public RadioButtonAdnCheckBoxDemo()
	{
		JPanel p = new JPanel();
		this.add(p);
		//��ѡ��
		ButtonGroup g = new ButtonGroup();
		JRadioButton male = new JRadioButton("��");
		JRadioButton female = new JRadioButton("Ů");
		g.add(male);
		g.add(female);
		p.add(male);
		p.add(female);
		
		//��ѡ��
		JCheckBox b1 = new JCheckBox("����");
		JCheckBox b2 = new JCheckBox("�Ⱦ�");
		JCheckBox b3 = new JCheckBox("��ͷ��");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		// 3. 
		JButton btn = new JButton("ȷ��");
		btn.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(RadioButtonAdnCheckBoxDemo.this, "�������Ա�"+(male.isSelected()?"��":"Ů"));
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
