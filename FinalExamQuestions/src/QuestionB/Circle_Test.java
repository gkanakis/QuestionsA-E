package QuestionB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Circle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void RunTest() {
		
		int r = 5;
		
		iCircleRead c1 = new Circle(0,0,r);
		Circle c2 = new Circle(0,0,r);
		
		assertTrue(c1.getRadius() == r);
		assertTrue(c2.getRadius() == r);

		int a = 10;
		
		iCircleRead ca1 = new Circle(3, 7, a);
		Circle ca2 = new Circle(4, 6, a);
		
		assertTrue(ca1.ComputeArea() == a);
		assertTrue(ca2.ComputeArea() == a);
	}

}













