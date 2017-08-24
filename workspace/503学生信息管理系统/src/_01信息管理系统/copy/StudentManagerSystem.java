package _01��Ϣ����ϵͳ.copy;


import java.io.*;
import java.util.*;

public class StudentManagerSystem
{
	Scanner sc = new Scanner(System.in);

	// ѡ��һ�����������������
	ArrayList<Student> list;

	final static String FILE_PATH = "e:\\stus.txt";

	// 1. ���˵�
	// 2. ���
	// 3. ɾ��
	// 4. �޸�
	// 5. ��ѯ
	public void start()
	{
		// ϵͳ������ʱ�򣬶�ȡ֮ǰ�Ĵ浵
		read();
		
		// �Ƿ�Ҫ����
		boolean con = true;

		do
		{
			// ��ʾ�˵�
			showMenu();

			// ���û�����ѡ��
			System.out.print("��������Ҫ���Ĳ���:");
			int sel = sc.nextInt();

			switch (sel)
			{
			case 1:
				addInfo();
				break;
			case 2:
				printInfo();
				break;
			case 3:
				modifyInfo();
				break;
			case 4:
				delInfo();
				break;
			case 5:
				findInfo();
				break;
			case 6:
				find2Info();
				break;
			case 7:
				find3Info();
				break;				
			case 8:
				System.out.println("�˳�,��ӭ�ٴι���");
				con = false;
				break;
			}

		} while (con);

	}

	private void find3Info()
	{
		// TODO Auto-generated method stub
		System.out.println("��ѯѧ����Ϣ�ܷ��б��Ӹߵ��ͣ�");
		
		ArrayList<Student> l = new ArrayList<>();
		l.addAll(list);
		
		// ʹ��Collections�������е�sort��������
		Collections.sort(l, new Comparator<Student>()
		{

			@Override
			public int compare(Student o1, Student o2)
			{
				// TODO Auto-generated method stub
				if(o1.getTotal()>o2.getTotal())
				{
					return -1;
				}
				else if(o1.getTotal()<o2.getTotal())
				{
					return 1;
				}
				return 0;
			}
		});
		
		System.out.println("===========================================");
		System.out.println("ѧ��\t����\t����\t��ѧ\tӢ��\t�ܷ�");
		for (Student stu : l)
		{
			System.out.println(stu);
		}
		System.out.println("===========================================");
		
		
		
		
	}

	private void find2Info()
	{
		// TODO Auto-generated method stub
		System.out.println("��ѯ������ѧ����Ϣ");

		
		Iterator<Student> it = list.iterator();
		boolean finded = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.chinese<60||s.math<60||s.english<60)
			{
				System.out.println("ѧ��\t����\t����\t��ѧ\tӢ��\t�ܷ�");
				System.out.println(s);
				finded = true;
			}	
		}
		
		if(!finded)
		{
			System.out.println("û�в������ѧ��");
		}
	}

	private void findInfo()
	{
		// TODO Auto-generated method stub

		System.out.println("��ѯѧ����Ϣ");

		System.out.println("������Ҫ��ѯ�ɼ���ѧ����ѧ��:");
		int stuId = sc.nextInt();
		
		Iterator<Student> it = list.iterator();
		boolean finded = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.id == stuId)
			{
				System.out.println("ѧ��\t����\t����\t��ѧ\tӢ��\t�ܷ�");
				System.out.println(s);
				finded = true;
				break;
			}	
		}
		
		if(!finded)
		{
			System.out.println("���޴���");
		}
		
	}

	private void delInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("ɾ��ѧ����Ϣ");

		System.out.println("��ɾ��Ҫ�޸�ѧ����ѧ��:");
		int stuId = sc.nextInt();
		
		Iterator<Student> it = list.iterator();
		boolean deleted = false;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			if(s.id == stuId)
			{
				it.remove();
				deleted = true;
				save();
				break;
			}	
		}
		
		System.out.println(deleted? "ɾ���ɹ�":"ɾ��ʧ��");
		
	}

	private void modifyInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("�޸�ѧ����Ϣ");

		System.out.println("������Ҫ�޸�ѧ����ѧ��:");
		int stuId = sc.nextInt();
		
		// ����ѧ��
		boolean modified = false;
		
		for(Student stu:list)
		{
			if(stu.id == stuId)
			{
				
				System.out.println("������ѧ������:");
				String name = sc.next();
				System.out.println("������ѧ�����ĳɼ�:");
				int chinese = sc.nextInt();
				System.out.println("������ѧ����ѧ:");
				int math = sc.nextInt();
				System.out.println("������ѧ��Ӣ��:");
				int english = sc.nextInt();
				stu.name = name;
				stu.chinese = chinese;
				stu.math = math;
				stu.english = english;

				// ����һ��
				save();
				
				modified = true;
				break;
			}
		}
		// ����У����޸�
		// û������ʾû�и�ѧ��
		if(!modified)
		{
			System.out.println("û�и�ѧ��");
		}
		
		
	}

	private void printInfo()
	{
		// TODO Auto-generated method stub

		System.out.println("===========================================");
		System.out.println("ѧ��\t����\t����\t��ѧ\tӢ��\t�ܷ�");
		for (Student stu : list)
		{
			System.out.println(stu);
		}
		System.out.println("===========================================");
	}

	private void addInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("���ѧ����Ϣ");

		System.out.println("������ѧ��ѧ��:");
		int stuId = sc.nextInt();
		System.out.println("������ѧ������:");
		String name = sc.next();
		System.out.println("������ѧ�����ĳɼ�:");
		int chinese = sc.nextInt();
		System.out.println("������ѧ����ѧ:");
		int math = sc.nextInt();
		System.out.println("������ѧ��Ӣ��:");
		int english = sc.nextInt();
		Student stu = new Student(stuId, name, chinese, math, english);
		list.add(stu);

		// ����һ��
		save();
	}

	private static void showMenu()
	{
		// TODO Auto-generated method stub
		System.out.println("��ӭ����xxx��ѧ����ϵͳ");
		System.out.println("1. ���");
		System.out.println("2. ��ʾ");
		System.out.println("3. �޸�");
		System.out.println("4. ɾ��");
		System.out.println("5. ��ѯ");
		System.out.println("6. ��ѯ������");
		System.out.println("7. ��ѯ�ܷ�");
		System.out.println("8. �˳�");
	}

	// ��������
	public void save()
	{
		ObjectOutputStream out = null;
		try
		{
			out = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			out.writeObject(list);// ���û���ļ�������һ���µ��ļ����������Ǹ���
		} catch (FileNotFoundException e)
		{
			System.out.println("�浵û���ҵ�");
		} catch (IOException e)
		{
			System.out.println("�浵����������");
		}
		finally
		{
			if(out!=null)
			{
				try
				{
					out.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// ��ȡ�浵
	public void read()
	{
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new FileInputStream(FILE_PATH));
			list = (ArrayList<Student>)in.readObject();
		} catch (FileNotFoundException e)
		{
			System.out.println("�浵û���ҵ�");
		} catch (IOException e)
		{
			System.out.println("�浵����������");
		} catch (ClassNotFoundException e)
		{
			System.out.println("�浵�е������쳣");
		}
		finally
		{
			if(list==null) 
			{
				// ���û��������ȡ�浵���Ҿʹ���һ���յ�����
				list = new ArrayList<>();
			}
			if(in!=null)
			{
				try
				{
					in.close();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
