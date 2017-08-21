package _01°æ±¾;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.LinkedList;

public class MyPanel extends JPanel implements MouseListener
{
	static final int PNG = 120;
	static final int WIDTH = 6;
	int a = 0;// ÓÃÀ´¼ÇÂ¼µÚ¼¸´Î·­ÅÄ
	Point p1 = null, p2 = null;
	LinkedList<String> card = new LinkedList<>();//´æ·ÅÍ¼Æ¬µØÖ·
	LinkedList<Point> point = new LinkedList<>();//´æ·ÅµÄÅÆ
	LinkedList<Point> havedone = new LinkedList<>();//ÒÑ·­¹ıµÄÅÆ

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

	// ½«18ÕÅÍ¼Ëæ»ú·ÅÈëcardÖĞ
	void push()
	{
		String[] str = new String[18];
		str[0] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Annie.png";
		str[1] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Ahri.png";
		str[2] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Akali.png";
		str[3] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Caitlyn.png";
		str[4] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Diana.png";
		str[5] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Jinx.png";
		str[6] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Malphite.png";
		str[7] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/MonkeyKing.png";
		str[8] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/XinZhao.png";
		str[9] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Zyra.png";
		str[10] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Yorick.png";
		str[11] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Vayne.png";
		str[12] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Vi.png";
		str[13] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Urgot.png";
		str[14] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/MissFortune.png";
		str[15] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Garen.png";
		str[16] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/JarvanIV.png";
		str[17] = "·­ÅÆÓÎÏ·ËØ²Ä/Ó¢ĞÛÁªÃË/Heimerdinger.png";
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
		// »æÖÆÊ×Ò³
		
		panel = Toolkit.getDefaultToolkit().getImage("·­ÅÆÓÎÏ·ËØ²Ä/Ã÷ĞÇÍ¼Æ¬/1.jpeg");
		
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
			panel = Toolkit.getDefaultToolkit().getImage("·­ÅÆÓÎÏ·ËØ²Ä/Ã÷ĞÇÍ¼Æ¬/15.jpeg");
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
