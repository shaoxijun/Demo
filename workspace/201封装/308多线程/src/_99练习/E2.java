package _99��ϰ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class E2 extends JFrame
{
	int x=55;
	int y=2;
	int z=25;
	boolean isrun = true;
	E2()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		p.setBackground(new Color(x,y,z));
		JButton but1 = new JButton("��ʼ");
		JButton but2 = new JButton("ֹͣ");
		but1.setBounds(50,20,100,100);
		but2.setBounds(200,200,100,100);
		p.add(but1);
		p.add(but2);
		but2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				isrun = false;
			}
		});
		but1.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				new Thread(new Runnable()
				{
					
					@Override
					public void run()
					{
						// TODO Auto-generated method stub
						while(isrun)
						{
							x = (int)(Math.random()*255);
							y = (int)(Math.random()*255);
							z = (int)(Math.random()*255);
							p.setBackground(new Color(x,y,z));
							try
							{
								Thread.sleep(500);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								;
							}
						}
					}
				}).start();
			}
		});
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 2. ��дһ�����ڳ���
		// ����һ����ť���������ť֮��
		// ��ͣ�ĸı䴰�ڵı�����ɫ���������ɫ��
		// ���һ����ť��ֹͣ�ı���ɫ
		E2 f = new E2();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 250, 500, 450);
	}

}
