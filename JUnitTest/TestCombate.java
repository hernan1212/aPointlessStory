import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import LN.clsCreep;

public class TestCombate 
{
	static clsCreep M ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		M = new clsCreep(null, 10, 5, 4, 3, 0, 0, 0);
		
	}

	@Test
	public void testCombate1() 
	{
		int daño1= 10;
		M.daño(daño1);
		assertEquals(3,M.getVida());
	}
	
	@Test
	public void testCombate2() 
	{
		M.setVida(10);
		int daño1= -3;
		M.daño(daño1);
		assertEquals(10,M.getVida());
	}
	
	@Test
	public void testCombate3() 
	{
		M.setVida(10);
		int daño1= 3;
		M.daño(daño1);
		assertEquals(10,M.getVida());
	}	

}

