/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.lab7;


import org.junit.Test;
import static org.junit.Assert.*;
  
/**
 *
 * @author Mohamed Khedr
 */
public class VoltageSourceTest {

    /**
     * Test of getNodes method, of class VoltageSource.
     */
    @Test
    public void testGetNodes() {
        System.out.println("getNodes");
         Node n1 = new Node(0) ;
              Node n2 = new Node(1) ; 
  VoltageSource v= new     VoltageSource(5,n1,n2);
        Node[] expResult = {n1,n2};
        Node[] result = v.getNodes();
        assertArrayEquals(expResult, result);
            

    }

    /**
     * Test of checkForIllegal1 method, of class VoltageSource.
     */
    @Test
    public void testCheckForIllegal1() {
        System.out.println("checkForIllegal1");
         Node n3 = new Node(2) ;
              Node n4 = new Node(3) ;
             VoltageSource v1 = new VoltageSource(10,n3,n4);
        boolean expResult = true;
        boolean result = VoltageSource.checkForIllegal1(n4, n3);
        assertEquals(expResult, result);
                boolean result2 = VoltageSource.checkForIllegal1(n3, n4);
        assertEquals(expResult, result2);
        
    }

    /**
     * Test of checkForIllegal2 method, of class VoltageSource.
     */
    @Test
    public void testCheckForIllegal2() {
        System.out.println("checkForIllegal2");
         Node n1 = new Node(0) ; 
             // Node n2 = new Node(1) ;
        boolean expResult = true;
        boolean result = VoltageSource.checkForIllegal2(n1, n1);
        assertEquals(expResult, result);
        
    }
    

@Test 
public void testINVALIDConstructorssamenodeidissue() {
boolean gotException = false;
try {
Node n0 = new Node(9);
Node n_1 = new Node(9);
VoltageSource v4 = new  VoltageSource(10,n0,n_1);
} catch (IllegalArgumentException e) {
gotException = true;
System.out.println("Got EXPECTED exception: " + e);
}
assertTrue(gotException);
}
@Test 
public void testINVALIDConstructors2samenodeissue() {
boolean gotException = false;
try {
Node n4 = new Node(16);
VoltageSource v3 = new  VoltageSource(10,n4,n4);
} catch (IllegalArgumentException e) {
gotException = true;
System.out.println("Got EXPECTED exception: " + e);
}
assertTrue(gotException);
}
@Test
public void testINVALIDConstructors3prallelissue() {
boolean gotException = false;
Node n9 = new Node(22);
Node n10 = new Node(23);
VoltageSource v78 = new  VoltageSource(10,n9,n10);
try {
VoltageSource v66 = new  VoltageSource(10,n9,n10);
} catch (IllegalArgumentException e) {
gotException = true;
System.out.println("Got EXPECTED exception: " + e);
}
assertTrue(gotException);
}
}
