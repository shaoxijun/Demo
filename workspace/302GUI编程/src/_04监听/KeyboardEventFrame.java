package _04监听;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyboardEventFrame extends JFrame
{

	public KeyboardEventFrame()
	{
		JPanel p = new JPanel();
		p.setLayout(null);
		this.add(p);
		
		JButton b = new JButton("b");
		b.setBackground(new Color((int)(Math.random()*255)));
		b.setBounds(50,50,50,50);
		p.add(b);
		
		p.setFocusable(true);//底板社则为可以Focusable,这样才能接受键盘和鼠标的事件。
		p.addKeyListener(new KeyListener()
		{
			
			@Override
			public void keyTyped(KeyEvent e)
			{
				// TODO Auto-generated method stub
				System.out.println("输入了"+e.getKeyChar());
				System.out.println(e.getKeyCode());//输出的永远是0，无解
			}
			
			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub
						
			}
			
			@Override
			public void keyPressed(KeyEvent e)
			{
				// TODO Auto-generated method stub
				switch(e.getKeyCode())
				{
				case KeyEvent.VK_LEFT:
					b.setLocation((int)b.getLocation().getX()-50, (int)b.getLocation().getY());
					break;
				case KeyEvent.VK_RIGHT:
					b.setLocation((int)b.getLocation().getX()+50, (int)b.getLocation().getY());
					break;
				case KeyEvent.VK_UP:
					b.setLocation((int)b.getLocation().getX(), (int)b.getLocation().getY()-50);
					break;
				case KeyEvent.VK_DOWN:
					b.setLocation((int)b.getLocation().getX()+50, (int)b.getLocation().getY()+50);
					break;
				}	
			}
		});
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		KeyboardEventFrame f = new KeyboardEventFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(300,250,500,400);
	}

}
