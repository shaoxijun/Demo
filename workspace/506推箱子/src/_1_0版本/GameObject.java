package _1_0�汾;

public class GameObject
{
	static int PLAYER = 0;
	static int WALL = 1;
	static int FLOOR = 2;
	static int TARGET = 3;
	static int BOX = 4;
	static int AIM =5;

	int type;// 0 ��� 1 ǽ�� 2 �ذ� 3 Ŀ��� 4 ����
	int x;
	int y;
	char face;// ��¼����ƶ��ķ���

	
	
	@Override
	public String toString()
	{
		return "GameObject [type=" + type + ", x=" + x + ", y=" + y + "]";
	}

	public GameObject(int type, int x, int y)
	{
		super();
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public void move(char c)
	{
		this.face = c;
		
		switch (c)
		{
		case 'w':
			this.y--;
			break;
		case 's':
			this.y++;
			break;
		case 'a':
			this.x--;
			
			break;
		case 'd':
			this.x++;
			break;

		}

	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + type;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameObject other = (GameObject) obj;
		if (type != other.type)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



	
}
