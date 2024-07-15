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
public class NodeTest {
    
    public NodeTest() {
    }


    /**
     * Test of getNcount method, of class Node.
     */
    @Test
    public void testGetNcount() {       
        Node n1 = new Node(0) ;
              Node n2 = new Node(1) ; 
        int expResult = 2;
        int result = Node.getNcount();
        assertEquals(expResult, result);
   
    }}

 