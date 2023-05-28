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
public class calcularNominaIT {

    public calcularNominaIT() {
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
     * Test of calcularSueldoBruto method, of class calcularNomina.
     */
    @Test
    public void testCalcularSueldoBruto() throws Exception {
        System.out.println("calcularSueldoBruto");
        Trabajador trabajador = new Trabajador("Juan", -10.0, 40.0);
        double expResult = 400.0;
        try {
        double result = calcularNomina.calcularSueldoBruto(trabajador);
        assertEquals(expResult, result, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIRPF method, of class calcularNomina.
     */
    @Test
    public void testCalcularIRPF() throws Exception {
        System.out.println("calcularIRPF");
        double sueldoBruto = -400.0;
        double expResult = 20.0;
        try {
        double result = calcularNomina.calcularIRPF(sueldoBruto);
        assertEquals(expResult, result, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularSueldoNeto method, of class calcularNomina.
     */
    @Test
    public void testCalcularSueldoNeto() throws Exception {
        System.out.println("calcularSueldoNeto");
        double sueldoBruto = -400.0;
        double retencionesSueldo = 20.0;
        double expResult = 380.0;
        try {
        double result = calcularNomina.calcularSueldoNeto(sueldoBruto, retencionesSueldo);
        assertEquals(expResult, result, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
