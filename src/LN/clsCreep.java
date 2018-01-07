package LN;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class clsCreep extends clsIA
{

	public JLabel lbl;
	public JLabel getLbl() {
		return lbl;
	}

	public void setLbl(JLabel lbl) {
		this.lbl = lbl;
	}

	public clsCreep(String nombre, int vida, int ataque, int armadura, int velocidad, int oro, int probabilidad,int ID) {
		super(nombre, vida, ataque, armadura, velocidad, oro, probabilidad, ID);
		this.setCMenu(ID);
	}
	
	public void daño(int ataque)
	{
		int Daño=ataque-this.getArmadura();
		if(Daño>0)
		{
		this.setVida(this.getVida()-Daño);
		}
	}
	
	public void setCMenu(int num)
	{
		lbl=new JLabel();
		lbl.setSize(800,600);
		switch(num)
		{
		case 0:
			lbl.setIcon(new ImageIcon(".//resources//Menus//SkeletonP.png"));
			break;
		case 1:
			lbl.setIcon(new ImageIcon(".//resources//Menus//Skeleton.png"));
			break;
		case 2:
			lbl.setIcon(new ImageIcon(".//resources//Menus//Bat.png"));
			break;
		case 3:
			lbl.setIcon(new ImageIcon(".//resources//Menus//LRock.png"));
			break;
		case 4:
			lbl.setIcon(new ImageIcon(".//resources//Menus//BRock.png"));
			break;
		}
	}

}
