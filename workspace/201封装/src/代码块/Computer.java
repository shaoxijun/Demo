package ´úÂë¿é;

public class Computer
{
	CPU CPU = new CPU("AMD",3.5f);
	Memory memory = new Memory("ÉÁµÏ",16);
	Mouse mouse = new Mouse("À×Éß","ºÚ");
	KeyBoard keyboard = new KeyBoard();
	@Override
	public String toString()
	{
		return "Computer [CPU" + CPU + ", memory" + memory + ", mouse" + mouse + ", keyboard" + keyboard + "]";
	}
	
	
}
