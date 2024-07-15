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
Resistor Item in the circuit.
*/
public class Resistor extends Item {

    
    static int rIdcount = 0;
  final  private double value;
final private Node [] nodes;
final private int Id;
 
    public Resistor(double resistance, Node node1, Node node2)
    {

    Node.totalNodes.add(node1);
            Node.totalNodes.add(node2);
        rIdcount++;
     this.Id = rIdcount;

        if (resistance < 0){
             System.out.println("Error: resistance can't be negative");
        throw new IllegalArgumentException("resistance can't be negative");}
                      else {    value = resistance;
}
     if (node1.getId() == node2.getId()){
                      System.out.println("Error: Both ends of a resistor cannot be connected to the same node.");
        throw new IllegalArgumentException("Both ends of a resistor cannot be connected to the same node.");}
  if (node1 == null || node2 == null){
                            System.out.println("Error: Node Cannot be null");
        throw new IllegalArgumentException("Node Cannot be null");}
   else {  
       nodes = new Node[2];
  nodes[0] = node1;
    nodes[1] = node2;
 

}
    }
    /**
return an array of the two nodes that the resistor is connected to.*/
 public Node [] getNodes()
 {
 return nodes;
 }
 /**
return the ID of the resistor*/
 public int getId()
{return this.Id;}
 @Override
/**
string representation of an object of class resistor*/
public String toString()
{
return "R" + this.Id +" " + nodes[0] + " " + nodes[1] + " " + value + " " + "\n";

} 
}

