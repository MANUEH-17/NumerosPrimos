/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mbrio
 */
public class CribaEratostenesTest {

    @Test
    public void test1GenerarPrimos() {
        System.out.println("Metodo generar primos para argumento 0");
        int[] expResult = new int[0];
        int[] result = CribaEratostenes.generarPrimos(0);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test2GenerarPrimos() {
        System.out.println("Metodo generar primos para argumento 2");
        int[] expResult = {2};
        int[] result = CribaEratostenes.generarPrimos(2);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test3GenerarPrimos() {
        System.out.println("Metodo generar primos para argumento 3");
        int[] expResult = {2,3};
        int[] result = CribaEratostenes.generarPrimos(3);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void test4GenerarPrimos() {
        System.out.println("Metodo generar primos para argumento 100");
        int[] expResult = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,
            61,67,71,73,79,83,89,97};
        int[] result = CribaEratostenes.generarPrimos(100);
        assertArrayEquals(expResult, result);
    }

}
