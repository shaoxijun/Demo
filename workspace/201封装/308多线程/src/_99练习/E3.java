package _99��ϰ;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class E3 extends JFrame
{
	int a =20;
	boolean isrun;
	int iswin = 0;
	E3()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		JLabel text = new JLabel();
		text.setBounds(300,20,90,80);
		p.add(text);
		JLabel text1 = new JLabel();
		text1.setBounds(390,20,90,80);
		p.add(text1);
		JLabel text2 = new JLabel();
		text2.setBounds(480,20,90,80);
		p.add(text2);
		JButton b1 = new JButton("����");
		JButton b2 = new JButton("�ڹ�");
		b1.setBounds(a,150,80,80);
		b2.setBounds(a,350,80,80);
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		p.add(b1);
		p.add(b2);
		JButton b3 = new JButton("��ʼ");
		JButton b4 = new JButton("����");
		b3.setBounds(20,20,80,80);
		b4.setBounds(100,20,80,80);
		b3.setBackground(Color.green);
		b4.setBackground(Color.red);
		p.add(b3);
		p.add(b4);
		b3.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				isrun = true;
				int sum = 500;
				
				
				//�ڹ�
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						
						// TODO Auto-generated method stub
						int tt = 0;
						while(isrun)
						{
							
							int t = (int)(Math.random()*101)+100;
							b1.setBounds(a+=t,150,80,80);
							try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								;
							}
							tt +=t;
//							System.out.println(tt);
							if(tt >= sum)
							{
								iswin = 1;
								text1.setText("�ڹ굽�յ�");
								break;
							}
						}
					}
				}).start();
				//����
				new Thread(new Runnable()
				{
					
					@Override
					public void run()
					{
						int ttt =0;
						// TODO Auto-generated method stub
						while(isrun)
						{
							int t = (int)(Math.random()*51)+50;
							b2.setBounds(a+=t,350,80,80);
							try
							{
								Thread.sleep(500);
							} catch (InterruptedException e)
							{
								;
							}
							ttt +=t;
//							System.out.println(ttt);
							if(ttt >= sum)
							{
								iswin = 2;
								text2.setText("���ӵ��յ�");
								break;
							}
						}
					}
				}).start();;
			}
		});
		b4.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				isrun = false;
			}
		});
		
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 3. �������� 1000��
		// �����߳�
		// �ڹ��ܲ� ÿ�����100-200�� ��Ϣ1s
		// �����ܲ� ÿ�����50-100�� ��Ϣ0.5s
		// ÿ��һ�Σ���ӡһ��
		// �ܵ��յ�ʱ����ӡxx�ܵ��յ���
		// 2�����ܵ��յ�ʱ����ӡ����������
		// (���������з�ʽ��Ҳ��������GUI����)
		E3 f = new E3();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 50, 1000, 600);
		
		
		
	}

}
