/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package medev.jeu_dame_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author coco
 */
public class Point2DTest {
    
    public Point2DTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getX method, of class Point2D.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point2D instance = new Point2D(0,0);
        Point2D instance2 = new Point2D(2,32);
        Point2D instance3 = new Point2D(-1,23);
        Point2D instance4 = new Point2D(-273,-238);
        Point2D instance5 = new Point2D(927,-28);
        int result = instance.getX();
        int result2 = instance2.getX();
        int result3 = instance3.getX();
        int result4 = instance4.getX();
        int result5 = instance5.getX();
        assertEquals(0, result);
        assertEquals(2, result2);
        assertEquals(-1, result3);
        assertEquals(-273, result4);
        assertEquals(927, result5);
    }

    /**
     * Test of getY method, of class Point2D.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point2D instance = new Point2D(0,0);
        Point2D instance2 = new Point2D(2,32);
        Point2D instance3 = new Point2D(-1,23);
        Point2D instance4 = new Point2D(-273,-238);
        Point2D instance5 = new Point2D(927,-28);
        int result = instance.getY();
        int result2 = instance2.getY();
        int result3 = instance3.getY();
        int result4 = instance4.getY();
        int result5 = instance5.getY();
        assertEquals(0, result);
        assertEquals(32, result2);
        assertEquals(23, result3);
        assertEquals(-238, result4);
        assertEquals(-28, result5);
    }

    /**
     * Test of setX method, of class Point2D.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 3;
        Point2D instance = new Point2D(0,0);
        instance.setX(x);
        assertEquals(x,instance.getX());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    

    /**
     * Test of setPosition method, of class Point2D.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x = 3;
        int y = 2;
        Point2D instance = new Point2D();
        instance.setPosition(x, y);
        assertEquals(x,instance.getX());
        assertEquals(y,instance.getY());
    }

    /**
     * Test of distance method, of class Point2D.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        Point2D p1 = null;
        Point2D instance = new Point2D();
        double expResult = 0.0;
        double result = instance.distance(p1);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPosition method, of class Point2D.
     */
    @Test
    public void testGetPosition() {
        System.out.println("GetPosition");
        Point2D instance = new Point2D();
        int[] expResult = null;
        int[] result = instance.GetPosition();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Translate method, of class Point2D.
     */
    @Test
    public void testTranslate() {
        System.out.println("Translate");
        int dx = 0;
        int dy = 0;
        Point2D instance = new Point2D();
        instance.Translate(dx, dy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Point2D.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Point2D p = null;
        Point2D instance = new Point2D();
        boolean expResult = false;
        boolean result = instance.equals(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
