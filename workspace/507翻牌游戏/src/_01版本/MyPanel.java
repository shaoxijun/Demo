package _01�汾;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.LinkedList;

public class MyPanel extends JPanel implements MouseListener
{
	static final int PNG = 120;
	static final int WIDTH = 6;
	int a = 0;// ������¼�ڼ��η���
	Point p1 = null, p2 = null;
	LinkedList<String> card = new LinkedList<>();//���ͼƬ��ַ
	LinkedList<Point> point = new LinkedList<>();//��ŵ���
	LinkedList<Point> havedone = new LinkedList<>();//�ѷ�������

	MyPanel()
	{
		JLabel l = new JLabel();
		l.setBounds(0, 0, 640, 960);
		this.add(l);
		push();
		this.setFocusable(true);
		this.addMouseListener(this);
		JLabel la;
		if(havedone.size()==36)
		{
			la= new JLabel("YOU WIN!");
			la.setBounds(300,300,100,100);
			this.add(la);
		}
		repaint();
		
	}

	// ��18��ͼ�������card��
	void push()
	{
		String[] str = new String[18];
		str[0] = "������Ϸ�ز�/Ӣ������/Annie.png";
		str[1] = "������Ϸ�ز�/Ӣ������/Ahri.png";
		str[2] = "������Ϸ�ز�/Ӣ������/Akali.png";
		str[3] = "������Ϸ�ز�/Ӣ������/Caitlyn.png";
		str[4] = "������Ϸ�ز�/Ӣ������/Diana.png";
		str[5] = "������Ϸ�ز�/Ӣ������/Jinx.png";
		str[6] = "������Ϸ�ز�/Ӣ������/Malphite.png";
		str[7] = "������Ϸ�ز�/Ӣ������/MonkeyKing.png";
		str[8] = "������Ϸ�ز�/Ӣ������/XinZhao.png";
		str[9] = "������Ϸ�ز�/Ӣ������/Zyra.png";
		str[10] = "������Ϸ�ز�/Ӣ������/Yorick.png";
		str[11] = "������Ϸ�ز�/Ӣ������/Vayne.png";
		str[12] = "������Ϸ�ز�/Ӣ������/Vi.png";
		str[13] = "������Ϸ�ز�/Ӣ������/Urgot.png";
		str[14] = "������Ϸ�ز�/Ӣ������/MissFortune.png";
		str[15] = "������Ϸ�ز�/Ӣ������/Garen.png";
		str[16] = "������Ϸ�ز�/Ӣ������/JarvanIV.png";
		str[17] = "������Ϸ�ز�/Ӣ������/Heimerdinger.png";
		int a = 0;
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 18; j++)
			{
				card.add(str[j]);
			}
		}
		Collections.shuffle(card);

		int index = 0;
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				point.add(new Point(i, j, card.get(index)));
				index++;
			}
		}
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Image panel;
		// ������ҳ
		
		panel = Toolkit.getDefaultToolkit().getImage("������Ϸ�ز�/����ͼƬ/1.jpeg");
		
		for (int i = 0; i < WIDTH; i++)
		{
			for (int j = 0; j < WIDTH; j++)
			{
				g.drawImage(panel, i * PNG, j * PNG, 120, 120, this);
			}
		}
	
		if (point.contains(p1))
		{
			panel = Toolkit.getDefaultToolkit().getImage(p1.page);
			g.drawImage(panel, p1.x * PNG, p1.y * PNG, 120, 120, this);
		}
		if (point.contains(p2))
		{
			panel = Toolkit.getDefaultToolkit().getImage(p2.page);
			g.drawImage(panel, p2.x * PNG, p2.y * PNG, 120, 120, this);
		}
		if(p1!=null&&p2!=null&&a==2)
		{
			a++;
			System.out.println(p1.page==p2.page);
			if(p1.page==p2.page)//&&p1.x!=p2.x&&p1.y!=p2.y)
			{
				if(p1.x==p2.x&&p1.y==p2.y)
				{}else
				{
					System.out.println("test");
					havedone.add(p1);
					havedone.add(p2);
					point.remove(p1);
					point.remove(p2);
				}
			}
		}
		for(Point p:havedone)
		{
			panel = Toolkit.getDefaultToolkit().getImage("������Ϸ�ز�/����ͼƬ/15.jpeg");
			g.drawImage(panel, p.x * PNG, p.y * PNG, 120, 120, this);
		}
	}

	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

		if (a >= 2)
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			a = 0;
			p1 = null;
			p2 = null;
		}
		int x = e.getX() / PNG;
		int y = e.getY() / PNG;
		switch (a) {
		case 0:
			p1 = new Point(x, y, " ");
			for (Point p : point)
			{
				if (p.x == p1.x && p.y == p1.y)
				{
					p1 = p;
				}
			}
			break;
		case 1:
			p2 = new Point(x, y, " ");
			for (Point pp : point)
			{
				if (pp.x == p2.x && pp.y == p2.y)
				{
					p2 = pp;
				}
			}
			break;
		}
		a++;
		
		System.out.println(a);
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

}
