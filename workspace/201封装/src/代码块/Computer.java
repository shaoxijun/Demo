package �����;

public class Computer
{
	CPU CPU = new CPU("AMD",3.5f);
	Memory memory = new Memory("����",16);
	Mouse mouse = new Mouse("����","��");
	KeyBoard keyboard = new KeyBoard();
	@Override
	public String toString()
	{
		return "Computer [CPU" + CPU + ", memory" + memory + ", mouse" + mouse + ", keyboard" + keyboard + "]";
	}
	
	
}
