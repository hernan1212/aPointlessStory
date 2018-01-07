package LP;

import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMuerte extends JPanel implements MouseListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lbl;
	

	public PanelMuerte() 
	{
		this.setLayout(null);
		setBounds(0,0,800,600);
		lbl=new JLabel();
		lbl.setSize(800,600);
		lbl.setIcon(new ImageIcon(".//resources//Menus//PMuerte.png"));
		this.add(lbl);
		this.addMouseListener(this);
		
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
	public void mousePressed(MouseEvent arg0) {
		int x=arg0.getX();
		int y=arg0.getY();
		if(x>104&&x<395&&y>535&&y<590)
		{
			PantReg.MiPantalla.dispose();
		}
		if(x>412&&y>535&&x<703&&y<590)
		{
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
