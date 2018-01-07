package LP;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Soldier extends JLabel 
{
	
	private static final long serialVersionUID = 1L;
	private static ImageIcon p;
	public Soldier() 
	{
		super(p);
		p=new ImageIcon("resources/Soldier1.png") ;
		setIcon(p);
		setLocation(550,250);
		setSize(50,55);
	}
	
	public String preguntalvl()
	{
		return "Veo que tienes suficiente oro para hacerte mas fuerte, ahora podras patear a esos monstruos mejor";
	}
	
	public String nolvlup()
	{
		return "No tiene oro suficiente para esto piltrafilla";
		
	}
	
	public String tutorial()
	{
		return (" Hola piltrafilla, espero que la siesta te sentara bien, esos malditos monstruos son duros de pelar JAJAJA,"
				+ "por si la paliza te ha borrao la memoria recuerda que puedes moverte pulsando 'w' 'a' 's' 'd' "
				+ "y que puedes subir de nivel por 100 monedas hablando conmigo!"
				+ "¡¡AHORA SAL A CAZAR!!");	
	}

}
