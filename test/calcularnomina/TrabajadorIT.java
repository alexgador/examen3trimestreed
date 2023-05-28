/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcularnomina;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class TrabajadorIT {
    
    public TrabajadorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Trabajador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Trabajador instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Trabajador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Trabajador instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioHora method, of class Trabajador.
     */
    @Test
    public void testGetPrecioHora() {
        System.out.println("getPrecioHora");
        Trabajador instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioHora();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioHora method, of class Trabajador.
     */
    @Test
    public void testSetPrecioHora() {
        System.out.println("setPrecioHora");
        double precioHora = 0.0;
        Trabajador instance = null;
        instance.setPrecioHora(precioHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorasTrabajadas method, of class Trabajador.
     */
    @Test
    public void testGetHorasTrabajadas() {
        System.out.println("getHorasTrabajadas");
        Trabajador instance = null;
        double expResult = 0.0;
        double result = instance.getHorasTrabajadas();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorasTrabajadas method, of class Trabajador.
     */
    @Test
    public void testSetHorasTrabajadas() {
        System.out.println("setHorasTrabajadas");
        double horasTrabajadas = 0.0;
        Trabajador instance = null;
        instance.setHorasTrabajadas(horasTrabajadas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIrfp method, of class Trabajador.
     */
    @Test
    public void testGetIrfp() {
        System.out.println("getIrfp");
        Trabajador instance = null;
        int expResult = 0;
        int result = instance.getIrfp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIrfp method, of class Trabajador.
     */
    @Test
    public void testSetIrfp() {
        System.out.println("setIrfp");
        int irfp = 0;
        Trabajador instance = null;
        instance.setIrfp(irfp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
