package _1_0版本;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class GamePanel extends JPanel 
{
	// 玩家对象
	GameObject player;
	// 游戏中其他对象(墙壁 底板 箱子 目标点)
	ArrayList<GameObject> allObjects = new ArrayList<>();
	JLabel lb = new JLabel();
	// 每个图像的大小
	final static int WIDTH = 50;
	boolean result = false;

	GamePanel()
	{
		
		lb.setBounds(300,10, 80, 80);
		lb.setBackground(Color.WHITE);
		this.add(lb);
		
		// 创建当前关卡数据
		createMapData();
		repaint();

		// 添加键盘监听
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
					if (!allObjects.contains(l))// 后面的不是墙
					{

						if (!allObjects.contains(ll))// 后面的后面不是墙
						{
							player.move('a');

							if (allObjects.contains(l1))// 如果后面是一个箱子
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
					if (!allObjects.contains(r))// 后面的不是墙

					{
						if (!allObjects.contains(rr))// 后面的后面不是墙
						{
							player.move('d');
							if (allObjects.contains(l2))// 如果后面是一个箱子
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
					if (!allObjects.contains(u))// 后面的不是墙

					{
						if (!allObjects.contains(uu))// 后面的后面不是墙
						{
							player.move('w');
							if (allObjects.contains(l3))// 如果后面是一个箱子
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
					if (!allObjects.contains(x))// 后面的不是墙

					{
						if (!allObjects.contains(xx))// 后面的后面不是墙
						{
							player.move('s');
							if (allObjects.contains(l4))// 如果后面是一个箱子
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
		// 设置当前为第1关
		BoxTools.getAnswer(1, 1);
		// 创建玩家
		player = new GameObject(GameObject.PLAYER, BoxTools.initboyx, BoxTools.initboyy);
		// 分析BoxTools.map_iv地图数据
		for (int i = 0; i < BoxTools.map_iv.length; i++)
		{
			for (int j = 0; j < BoxTools.map_iv[i].length; j++)
			{
				// BoxTools.map_iv[i][j]
				//
				switch (BoxTools.map_iv[i][j]) {
				case 1:// 墙壁
					GameObject o = new GameObject(GameObject.WALL, j, i);
					allObjects.add(o);
					break;
				case 2:// 地板
					allObjects.add(new GameObject(GameObject.FLOOR, j, i));
					break;
				case 3:// 目标点(下面也有个地板)
					allObjects.add(new GameObject(GameObject.TARGET, j, i));
					break;
				case 4:// 箱子(下面也有个地板)
					allObjects.add(new GameObject(GameObject.BOX, j, i));
					break;
				case 5:// 箱子已经移到了目标点(下面也有个地板、目标点)
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

		// 3.绘制地板
		for (GameObject obj : allObjects)
		{
			img = Toolkit.getDefaultToolkit().getImage("images/floorwood.png");
			g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
		}

		// 1. 绘制墙壁
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.WALL)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/wall.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}

		// 绘制目标
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.TARGET)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/goalwood.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}

		// 绘制到目标点后图
		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.AIM)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/boxgoal.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}
		// 4.绘制箱子

		for (GameObject obj : allObjects)
		{
			if (obj.type == GameObject.BOX)
			{
				img = Toolkit.getDefaultToolkit().getImage("images/boxwood.png");
				g.drawImage(img, WIDTH * obj.x, WIDTH * obj.y, WIDTH, WIDTH, this);
			}
		}
		// 2. 绘制玩家
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
		// 根据player.x player.y来确定绘制位置
		// System.out.println(player.x+","+player.y);

		g.drawImage(img, WIDTH * player.x, WIDTH * player.y, WIDTH, WIDTH, this);

	}



}
