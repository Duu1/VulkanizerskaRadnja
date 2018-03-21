/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Dusan
 *
 */
public class AutoGumaTest {

	private AutoGuma a;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void setMarkaModel() {
		a.setMarkaModel("Tigar");
		
		assertEquals("Tigar",a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void setMarkaModelKratak() {
		a.setMarkaModel("pr");
	}
	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		
		assertEquals(20, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikMali() {
		a.setPrecnik(1);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeliki() {
		a.setPrecnik(55);
	}
	
	@Test
	public void testSetSirina() {
		a.setSirina(150);
		
		assertEquals(150, a.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaMala() {
		a.setSirina(1);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVelika() {
		a.setSirina(455);
	}
	
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		
		assertEquals(50, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaMala() {
		a.setVisina(1);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVelika() {
		a.setVisina(455);
	}
	
	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(80);
		
		assertEquals("AutoGuma [markaModel=Tigar, precnik=20, sirina=150, visina=80]",a.toString());
	}
	
	@Test
	public void testEqualsTrue() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(80);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(20);
		a2.setSirina(150);
		a2.setVisina(80);
		
		assertTrue(a.equals(a2));
	}
	
	@Test
	public void testEqualsFalse() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(20);
		a.setSirina(150);
		a.setVisina(80);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(20);
		a2.setSirina(180);
		a2.setVisina(80);
		
		assertFalse(a.equals(a2));
	}
}
