package _99��ϰ;
import java.net.*;
import java.io.*;
public class Server
{

	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		// 1. ��������
		int port = 8888;
		ServerSocket serSocket = null;
		serSocket = new ServerSocket(port);

		// 2. ��������
		System.out.println("����������,����" + port + "�˿�,�ȴ��ͻ�������");
		Socket cs = serSocket.accept();
		
		// 3. �ͻ������˺Ϳͻ���ͨ��
		System.out.println("�ͻ���������");
		InputStream in = cs.getInputStream();
		OutputStream out = cs.getOutputStream();
		
		// 3.1 ��ͻ��˷���Ϣ
		out.write("���!��ӭ����!".getBytes());
		
		// 3.2 ���տͻ�����Ϣ
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		String str = new String(buf,0,len);
		System.out.println("�ͻ���:"+str);		

		// 4. �ر�����
		System.out.println("�رշ�����socket");
		serSocket.close();
	}

}
