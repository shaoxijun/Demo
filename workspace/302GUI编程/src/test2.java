import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test2 extends JFrame
{

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField jieguo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					test2 frame = new test2();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		num1 = new JTextField();
		num1.setBounds(25, 10, 66, 21);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(147, 10, 66, 21);
		contentPane.add(num2);
		num2.setColumns(10);
		
		jieguo = new JTextField();
		jieguo.setBounds(314, 10, 66, 21);
		contentPane.add(jieguo);
		jieguo.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num1Str=num1.getText();
				String num2Str=num2.getText();
				System.out.print(num1Str+"+");
				System.out.print(num2Str+"=");
				int a=Integer.valueOf(num1Str);
				int b=Integer.valueOf(num2Str);
				int result=a+b;
				jieguo.setText(" "+result);
				System.out.println(result);
			}
		});
		btnNewButton.setBounds(221, 9, 66, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(101, 13, 54, 15);
		contentPane.add(lblNewLabel);
	}
}
