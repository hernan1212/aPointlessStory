package LN;

public class clsCreep extends clsIA
{

	public clsCreep(String nombre, int vida, int ataque, int velocidad, int armadura, int oro, int probabilidad,int ID) {
		super(nombre, vida, ataque, velocidad, armadura, oro, probabilidad,ID);
		// TODO Auto-generated constructor stub
	}
	
	public void da�o(int ataque)
	{
		int Da�o=ataque-this.getArmadura();
		if(Da�o>0)
		{
		this.setVida(this.getVida()-Da�o);
		}
	}

}
