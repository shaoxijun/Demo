package _99练习;
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
		JButton b1 = new JButton("兔子");
		JButton b2 = new JButton("乌龟");
		b1.setBounds(a,150,80,80);
		b2.setBounds(a,350,80,80);
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		p.add(b1);
		p.add(b2);
		JButton b3 = new JButton("开始");
		JButton b4 = new JButton("结束");
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
				
				
				//乌龟
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
								text1.setText("乌龟到终点");
								break;
							}
						}
					}
				}).start();
				//兔子
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
								text2.setText("兔子到终点");
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
		// 3. 龟兔赛跑 1000米
		// 两个线程
		// 乌龟跑步 每随机跑100-200米 休息1s
		// 兔子跑步 每随机跑50-100米 休息0.5s
		// 每跑一段，打印一次
		// 跑到终点时，打印xx跑到终点了
		// 2个都跑到终点时，打印比赛结束。
		// (可用命令行方式，也可以做成GUI程序)
		E3 f = new E3();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 50, 1000, 600);
		
		
		
	}

}
