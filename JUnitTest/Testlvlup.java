import static org.junit.Assert.*;

import javax.swing.JLabel;

import org.junit.BeforeClass;
import org.junit.Test;

import LN.User;
import LP.PantallaPrincipal;
import LP.Soldier;

public class Testlvlup {

	static User us;
	static Soldier sl;
	static PantallaPrincipal p;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		 p= new PantallaPrincipal(null);
		us= new User("pepe");
		us.setMoney(450);
		
	}

	@Test
	public void test1() 
	{
	p.Hablar_con_el_tio(us);
		assertEquals(350,us.getMoney());
		
	}
	@Test
	public void test2() 
	{
		p.Hablar_con_el_tio(us);
		assertEquals(250,us.getMoney());
		
	}
	@Test
	public void test3() 
	{
		p.Hablar_con_el_tio(us);
		assertEquals(150,us.getMoney());
		
	}
	@Test
	public void test4() 
	{
		p.Hablar_con_el_tio(us);
		assertEquals(50,us.getMoney());
	}
	public void test5() 
	{
	
		p.Hablar_con_el_tio(us);
		assertEquals(50,us.getMoney());
	}

}
