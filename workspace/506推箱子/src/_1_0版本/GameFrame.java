package _1_0�汾;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameFrame extends JFrame
{
	GameFrame()
	{
	
		GamePanel myPanel = new GamePanel();
		myPanel.setLayout(null);
		
	
		this.add(myPanel);	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 1. ����һ������
		GameFrame f = new GameFrame();
		// 2. ���óɿɼ�
		f.setVisible(true);
		// 3. ����رյ�ʱ�򣬳���Ҳ�ر�
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 4. �趨������ʼ���꼰��С
		// f.setLocation(400,200);
		// f.setSize(500, 400);
		f.setBounds(300, 250, 500, 400);// ͬʱ������ʼ����ʹ�С
		
	}

}
