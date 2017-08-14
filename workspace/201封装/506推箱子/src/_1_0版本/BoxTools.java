package _1_0�汾;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ��������Ϣ�Ĺ�����
 * @author qiang
 *
 */
public class BoxTools {
	/**
	 *  ����Ϣ
	 */
	static byte[] answer;
	/**
	 *  ������ʼxyλ��
	 */
	public static int initboyx;
	public static int initboyy;
	/**
	 *  ��ͼ��Ϣ
	 */
	public static byte[][] map_iv;
	
	/*
	 * һ���ֽ�����תint�Ĺ��߷���
	 */
	private static int toInt(byte[] b) {
        int n = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 0) {
                n = ((n * 256) + 256) + b[i];
            } else {
                n = (n * 256) + b[i];
            }
        }
        return n;
    }

	/**
	 * �õ�ĳ���ؿ�����Ϣ
	 * @param task		�ؿ�id	1~208
	 * @param answerid	�Ƿ��ȡ����Ϣ 0Ϊ��ȡ ��������Ϊ����ȡ
	 */
	public static void getAnswer(int task, int answerid) {
        try {
            int i;
            byte[] offset_byte = new byte[4];
            if (answerid == 0) {
            	File f = new File("answer.idx");
                InputStream inputstream = new FileInputStream(f);
                inputstream.skip((long) ((task * 8) - 8));
                inputstream.read(offset_byte);
                int offset = toInt(offset_byte);
                inputstream.read(offset_byte);
                answer = new byte[toInt(offset_byte)];
                inputstream.skip((long) (offset - (task * 8)));
                inputstream.read(answer);
                inputstream.close();
            }
            task--;
            try {
            	File f = new File("box.idx");
            	InputStream inputstream1 = new FileInputStream(f);
                inputstream1.skip((long) (task * 4));
                inputstream1.read(offset_byte);
                inputstream1.skip((long) ((toInt(offset_byte) - (task * 4)) - 4));
                byte[] param = new byte[5];
                inputstream1.read(param);
                byte b = param[0];
                initboyy = b;
                b = param[1];
                initboyx = b;
                map_iv = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{param[3], param[4]});
                for (byte[] read : map_iv) {
                    inputstream1.read(read);                    
                    //System.out.println(Arrays.toString(read));
                }
                inputstream1.close();
            } catch (Exception e) {
            }
            
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

//	public static void main(String[] args)
//	{
//		// TODO Auto-generated method stub
//		for(int i=1;i<=208;i++)
//		{
//			getAnswer(i,0);
//			System.out.println(Arrays.toString(answer));
//			System.out.println(initboyx);
//			System.out.println(initboyy);
//		}
//	}
}
