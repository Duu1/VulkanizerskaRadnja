package gume.radnja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
/**
 * @author Dusan
 *
 */
public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja a;
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
		a = new VulkanizerskaRadnja();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		a.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContains() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("Tigar");
		c.setPrecnik(20);
		c.setSirina(150);
		c.setVisina(80);
		
		a.dodajGumu(b);
		a.dodajGumu(c);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContains2() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		a.dodajGumu(b);
		a.dodajGumu(b);
	}
	
	@Test 
	public void testDodajGumu() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		a.dodajGumu(b);
		
		assertEquals(b,a.gume.getFirst());
	}
	
	@Test 
	public void testDodajGumu2() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("BBBB");
		c.setPrecnik(19);
		c.setSirina(151);
		c.setVisina(79);
		
		a.dodajGumu(b);
		a.dodajGumu(c);
		
		assertTrue(b.equals(a.gume.get(a.gume.size()-1)) && c.equals(a.gume.getFirst()));
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void pronadjiGumuNull() {		
		a.pronadjiGumu(null);
	}
	
	@Test 
	public void pronadjiGumu() {	
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		
		a.dodajGumu(b);
		assertEquals(b,a.pronadjiGumu("Tigar").getFirst());
	}
	
	@Test 
	public void pronadjiGumu2() {	
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("BBBB");
		
		a.dodajGumu(b);
		a.dodajGumu(c);
		
		assertEquals(c,a.pronadjiGumu("BBBB").getFirst());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void pronadjiGumu3() {	
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("BBBB");
		
		a.dodajGumu(b);
		a.dodajGumu(c);
		
		a.pronadjiGumu("CCCC");
	}
	
	@Test 
	public void pronadjiGumu4() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("Tigar");
		b.setPrecnik(20);
		b.setSirina(150);
		b.setVisina(80);
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("Tigar");
		c.setPrecnik(19);
		c.setSirina(151);
		c.setVisina(79);
		
		a.dodajGumu(b);
		a.dodajGumu(c);
		
		assertTrue(a.pronadjiGumu("Tigar").get(0).equals(c) && 
				a.pronadjiGumu("Tigar").get(1).equals(b));
	
	}
}
