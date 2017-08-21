package _1_0�汾;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GamePanel extends JPanel 
{
	// ��Ҷ���
	GameObject player;
	// ��Ϸ����������(ǽ�� �װ� ���� Ŀ���)
	ArrayList<GameObject> allObjects = new ArrayList<>();
	JLabel lb = new JLabel();
	// ÿ��ͼ��Ĵ�С
	final static int WIDTH = 50;
	boolean result = false;

	GamePanel()
	{
		
		lb.setBounds(300,10, 80, 80);
		lb.setBackground(Color.WHITE);
		this.add(lb);
		
		// ������ǰ�ؿ�����
		createMapData();
		repaint();

		// ��Ӽ��̼���
		this.setFocusable(true);
		this.addKeyListener(new KeyListener()
		{
			
			@Override
			public void keyTyped(KeyEvent e)
			{
			}

			@Override
			public void keyPressed(KeyEvent e)
			{
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					GameObject l = new GameObject(1, player.x - 1, player.y);
					GameObject ll = new GameObject(1, player.x - 2, player.y);
					GameObject l1 = new GameObject(4, player.x - 1, player.y);
					GameObject aim1 = new GameObject(3, player.x - 2, player.y);
					if (!allObjects.contains(l))// ����Ĳ���ǽ
					{

						if (!allObjects.contains(ll))// ����ĺ��治��ǽ
						{
							player.move('a');

							if (allObjects.contains(l1))// ���������һ������
							{
								allObjects.remove(l1);
								allObjects.add(new GameObject(2, player.x, player.y));
								allObjects.add(new GameObject(4, player.x - 1, player.y));
								if (allObjects.contains(aim1))
								{
									allObjects.remove(aim1);
									allObjects.remove(new GameObject(4, player.x - 1, player.y));
									allObjects.add(new GameObject(5, player.x - 1, player.y));
								}
							}
						} else
						{
							if ((!allObjects.contains(new GameObject(5, player.x - 1, player.y))) 
									&& !allObjects.contains(l1))

							{
								player.move('a');
							}
						}
					}

					break;
				case KeyEvent.VK_RIGHT:
					GameObject r = new GameObject(1, player.x + 1, player.y);
					GameObject rr = new GameObject(1, player.x + 2, player.y);
					GameObject l2 = new GameObject(4, player.x + 1, player.y);
					GameObject aim2 = new GameObject(3, player.x + 2, player.y);
					if (!allObjects.contains(r))// ����Ĳ���ǽ

					{
						if (!allObjects.contains(rr))// ����ĺ��治��ǽ
						{
							player.move('d');
							if (allObjects.contains(l2))// ���������һ������
							{
								allObjects.remove(new GameObject(4, player.x, player.y));
								allObjects.add(new GameObject(2, player.x, player.y));
								allObjects.add(new GameObject(4, player.x + 1, player.y));
								if (allObjects.contains(aim2))
								{
									allObjects.remove(aim2);
									allObjects.remove(new GameObject(4, player.x + 1, player.y));
									allObjects.add(new GameObject(5, player.x + 1, player.y));
								}
							}
						} else
						{
							if (!allObjects.contains(new GameObject(5, player.x + 1, player.y))
									&&!allObjects.contains(l2))

							{
								player.move('d');
							}
						}
					}
					break;
				case KeyEvent.VK_UP:
					GameObject u = new GameObject(1, player.x, player.y - 1);
					GameObject uu = new GameObject(1, player.x, player.y - 2);
					GameObject l3 = new GameObject(4, player.x, player.y - 1);
					GameObject aim3 = new GameObject(3, player.x, player.y - 2);
					if (!allObjects.contains(u))// ����Ĳ���ǽ

					{
						if (!allObjects.contains(uu))// ����ĺ��治��ǽ
						{
							player.move('w');
							if (allObjects.contains(l3))// ���������һ������
							{
								allObjects.remove(new GameObject(4, player.x, player.y));
								allObjects.add(new GameObject(2, player.x, player.y));
								allObjects.add(new GameObject(4, player.x, player.y - 1));
								if (allObjects.contains(aim3))
								{
									allObjects.remove(aim3);
									allObjects.remove(new GameObject(4, player.x, player.y - 1));
									allObjects.add(new GameObject(5, player.x, player.y - 1));
								}
							}
						} else
						{
							if (!allObjects.contains(new GameObject(5, player.x, (player.y - 1)))
									&&!allObjects.contains(l3))

							{
								player.move('w');
							}
						}
					}
					break;
				case KeyEvent.VK_DOWN:
					GameObject x = new GameObject(1, player.x, player.y + 1);
					GameObject xx = new GameObject(1, player.x, player.y + 2);
					GameObject l4 = new GameObject(4, player.x, player.y + 1);
					GameObject aim4 = new GameObject(3, player.x, player.y + 2);
					if (!allObjects.contains(x))// ����Ĳ���ǽ

					{
						if (!allObjects.contains(xx))// ����ĺ��治��ǽ
						{
							player.move('s');
							if (allObjects.contains(l4))// ���������һ������
							{
								allObjects.remove(new GameObject(4, player.x, player.y));
								allObjects.add(new GameObject(2, player.x, player.y));
								allObjects.add(new GameObject(4, player.x, player.y + 1));
								if (allObjects.contains(aim4))
								{
									allObjects.remove(aim4);
									allObjects.remove(new GameObject(4, player.x, player.y + 1));
									allObjects.add(new GameObject(5, player.x, player.y + 1));
								}
							}

						} else
						{
							if (!allObjects.contains(new GameObject(5, player.x, (player.y + 1)))
									&&
									!allObjects.contains(l4))

							{
								player.move('s');
							}
						}
					}
					break;
				}
				repaint();
				new Thread(new Runnable()
				{
					
					@Override
					public void run()
					{
						System.out.println("etst");
						// TODO Auto-generated method stub
						if(allObjects.contains(new GameObject(5,1,4))&&
						allObjects.contains(new GameObject(5,4,6))&&
						allObjects.contains(new GameObject(5,6,3))&&
						allObjects.contains(new GameObject(5,3,1)))
						{
							lb.setText("YOU WIN!");
							result = true;
							System.out.println(result);
							JButton but = new JButton("YOU WIN !");
							but.setBounds(30, 20, 300, 300);
							
						}
						
					}
				}).start();
			}
		});
		
		
	}

	void createMapData()
	{
		// ���õ�ǰΪ��1��
		BoxTools.getAnswer(1, 1);
		// �������
		player = new GameObject(GameObject.PLAYER, BoxTools.initboyx, BoxTools.initboyy);
		// ����BoxTools.map_iv��ͼ����
		for (int i = 0; i < BoxTools.map_iv.length; i++)
		{
			for (int j = 0; j < BoxTools.map_iv[i].length; j++)
			{
				// BoxTools.map_iv[i][j]
				//
				switch (BoxTools.map_iv[i][j]) {
				case 1:// ǽ��
					GameObject o = new GameObject(GameObject.WALL, j, i);
					allObjects.add(o);
					break;
				case 2:// �ذ�
					allObjects.add(new GameObject(GameObject.FLOOR, j, i));
					break;
				case 3:// Ŀ���(����Ҳ�и��ذ�)
					allObjects.add(new GameObject(GameObject.TARGET, j, i));
					break;
				case 4:// ����(����Ҳ�и��ذ�)
					allObjects.add(new GameObject(GameObject.BOX, j, i));
					break;
				case 5:// �����Ѿ��Ƶ���Ŀ���(����Ҳ�и��ذ塢Ŀ���)
					allObjects.add(new GameObject(GameObject.AIM, j, i));
					break;
				}
			}

		}

	}

	@Override
	protected void paintComponent(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Image ie = Toolkit.getDefaultToolkit().getImage("images/sky.jpg");
		g.drawImage(ie, 0, 0, 500, 400, this);
		Image img;

		// 3.���Ƶذ�
		for (GameObject obj : allObjects)
		{
			img = Toolkit.getDefaultToolkit().getImage("images/floorwood.png");
			g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
		}

		// 1. ����ǽ��
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.WALL)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/wall.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}

		// ����Ŀ��
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.TARGET)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/goalwood.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}

		// ���Ƶ�Ŀ����ͼ
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.AIM)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/boxgoal.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}
		// 4.��������

		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.BOX)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/boxwood.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}
		// 2. �������
		String imgPath = "images/standforward.png";

		switch (player.face) {
		case 'w':
			imgPath = "images/standbehind.png";
			break;
		case 's':
			imgPath = "images/standforward.png";
			break;
		case 'a':
			imgPath = "images/standleft.png";
			break;
		case 'd':
			imgPath = "images/standright.png";
			break;

		}
		img = Toolkit.getDefaultToolkit().getImage(imgPath);
		// ����player.x player.y��ȷ������λ��
		// System.out.println(player.x+","+player.y);

		g.drawImage(img, WIDTH * player.x, WIDTH * player.y, WIDTH, WIDTH, this);

	}



}
