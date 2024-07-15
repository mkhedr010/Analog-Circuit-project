/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;


/**
 *
 * @author Mohamed Khedr
 */
    /**
The parent class of all Items in the circuit (extends to a Resistor or a VoltageSource).
*/
public abstract class Item {
/**
return an array of the two nodes that the Item is connected to.*/
 public abstract Node[]  getNodes();
  /**
return the ID of the Item*/
public abstract int getId();



}
