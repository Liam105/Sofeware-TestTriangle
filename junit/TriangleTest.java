import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTest {
	private static Triangle myTriangle1 = null;
	private static Triangle myTriangle2 = null;
	private static Triangle myTriangle3 = null;
	private static Triangle myTriangle4 = null;
	private static Triangle myTriangle5 = null;
	private static Triangle myTriangle6 = null;
	private static Triangle myTriangle7 = null;
	private static Triangle myTriangle8 = null;
	private static Triangle myTriangle9 = null;
	private static Triangle myTriangle10 = null;
	@Before
	public void setUp() throws Exception {
		long max_side = Long.MAX_VALUE;
		myTriangle1 = new Triangle(0,1,3);
		myTriangle2 = new Triangle(1,1,3);
		myTriangle3 = new Triangle(2,3,4);
		myTriangle4 = new Triangle(2,2,3);
		myTriangle5 = new Triangle(3,3,3);
		myTriangle6 = new Triangle(2,3,3);
		myTriangle7 = new Triangle(3,2,3);
		myTriangle8 = new Triangle(-1,-1,-1);
		myTriangle9 = new Triangle(0,0,0);
		myTriangle10 = new Triangle(max_side+1,max_side,max_side+1);
	}


	@Test
	public void testGetType() {
		assertEquals("Illegal",myTriangle1.getType(myTriangle1));
		assertEquals("Illegal",myTriangle2.getType(myTriangle2));
		assertEquals("Scalene",myTriangle3.getType(myTriangle3));
		assertEquals("Isosceles",myTriangle4.getType(myTriangle4));
		assertEquals("Regular",myTriangle5.getType(myTriangle5));
		assertEquals("Isosceles",myTriangle4.getType(myTriangle6));
		assertEquals("Isosceles",myTriangle4.getType(myTriangle7));
	}


	@Test
	public void testGetBorders() {
		long a = 0;
		long b = 1;
		long c = 3;
		assertEquals(a,myTriangle1.getBorders()[0]);
		assertEquals(b,myTriangle1.getBorders()[1]);
		assertEquals(c,myTriangle1.getBorders()[2]);
	}

}
