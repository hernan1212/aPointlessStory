package LP;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Comun.clsConstantes.enumFicheros;
import LD.clsEscritura;
import LN.User;
import LN.clsCreep;

public class PanelCombate extends JPanel implements MouseListener
{
	
	private static final long serialVersionUID = 1L;
	private User PJ;
	private clsCreep Creep;
	private JLabel VidaPJ;
	private JLabel VidaCreep;
	private JLabel TXTLabel;

	public PanelCombate(User a, clsCreep b)
	{
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		PJ=a;
		Creep=b;
		b.setVida(b.VidaTotal);
		this.setLayout(null);
		this.setBounds(0,0,800,600);
		this.addMouseListener(this);
		VidaPJ=new JLabel();
		VidaCreep=new JLabel();
		TXTLabel=new JLabel();
		VidaPJ.setBounds(115, 335, 100, 100);
		VidaCreep.setBounds(655, 335, 100, 100);
		VidaPJ.setFont(font1);
		VidaCreep.setFont(font1);
		TXTLabel.setBounds(10, 20, 100, 100);
		VidaPJ.setText(String.valueOf(a.getVida()));
		VidaCreep.setText(String.valueOf(b.getVida()));
		this.add(VidaCreep);
		this.add(VidaPJ);
		this.setComponentZOrder(VidaCreep, 0);
		this.setComponentZOrder(VidaPJ, 0);
  
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		int x=arg0.getX();
	    int y=arg0.getY();
	
		if (x>59 && x<360 && y>411 && y<490)
		{
			if(PJ.getVelocidad()<Creep.getVelocidad())
			{
				PJ.daño(Creep.getAtaque());
				VidaPJ.setText(String.valueOf(PJ.getVida()));
				this.repaint();
				if(PJ.getVida()<=0)
				{
					clsEscritura a=new clsEscritura();
					a.ComenzarSave(enumFicheros.FICHERO_PJ);
					a.Save((Serializable)PJ);
					a.TerminarSave();
					this.setVisible(false);
					PanelMuerte pm=new PanelMuerte();
					PantReg.MiPantalla.setContentPane(pm);
					PantReg.MiPantalla.repaint();
					pm.repaint();
					pm.requestFocus();
				}
				else
				{
				Creep.daño(PJ.getAtaque());
				VidaCreep.setText(String.valueOf(Creep.getVida()));
				this.repaint();
				if(Creep.getVida()<=0)
				{
					this.removeAll();
					PJ.setMoney(PJ.getMoney()+Creep.getOro());
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
				}
			}
			else
			{
				Creep.daño(PJ.getAtaque());
				VidaCreep.setText(String.valueOf(Creep.getVida()));
				this.repaint();
				if(Creep.getVida()<=0)
				{
					this.removeAll();
					PJ.setMoney(PJ.getMoney()+Creep.getOro());
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
				else
				{
				PJ.daño(Creep.getAtaque());
				VidaPJ.setText(String.valueOf(PJ.getVida()));
				this.repaint();
				if(PJ.getVida()<=0)
				{
					clsEscritura a=new clsEscritura();
					a.ComenzarSave(enumFicheros.FICHERO_PJ);
					a.Save((Serializable)PJ);
					a.TerminarSave();
					PanelMuerte pm=new PanelMuerte();
					PantReg.MiPantalla.setContentPane(pm);
					pm.repaint();
					pm.requestFocus();
				}
				}
			}
		}
		
		else if (x>439 && x<740 && y>411 && y<490)
		{		
			int a;
			Random r=new Random();
			a=r.nextInt(6);
			if(PJ.getVelocidad()/Creep.getVelocidad()>=2)
			{
				if(a>=1)
				{
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
			}
			if(PJ.getVelocidad()/Creep.getVelocidad()>=1)
			{
				if(a>=2)
				{
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
			}
			if(PJ.getVelocidad()/Creep.getVelocidad()==1)
			{
				if(a>=3)
				{
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
			}
			if(PJ.getVelocidad()/Creep.getVelocidad()<=1)
			{
				if(a>=4)
				{
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
			}
			if(PJ.getVelocidad()/Creep.getVelocidad()<=0.5)
			{
				if(a>=5)
				{
					PantReg.MiPantalla.CambioPantallaCaJ();
				}
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
