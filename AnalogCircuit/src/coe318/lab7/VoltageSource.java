
/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


/**
 *
 * @author MOhamed Khedr
 */
package coe318.lab7;

import java.util.ArrayList;
/**
Voltage Source Item in the circuit.
*/
public class VoltageSource extends Item {

    static int VoltageIdcount = 0;
    final private double value;
    final private Node[] nodes;
    final private int Id;
   private static ArrayList <Node[]> nodesBox = new ArrayList <Node[]>(); 

    public VoltageSource(double voltage, Node nodeP, Node nodeN) {
            Node.totalNodes.add(nodeP);
              Node.totalNodes.add(nodeN);
        if (voltage == 0)
        {     System.out.println("Error: Battery's value cannot be zero.");
          throw new IllegalArgumentException("Error: Battery's value cannot be zero." );}

  if (checkForIllegal2( nodeP,  nodeN)) {   
                  System.out.println("Error: Battery cannnot be connected to the same node from both ends.");
throw new IllegalArgumentException("Error: Battery cannnot be connected to the same node from both ends." );
  }
     if (nodeP == null || nodeN == null){
                           System.out.println("Node Cannot be null\n");
        throw new IllegalArgumentException("Node Cannot be null");}
 if (checkForIllegal1( nodeP,  nodeN))
 {                           System.out.println("Two or more Batteries cannot be connected in prallel");
     throw new IllegalArgumentException("Two or more Batteries cannot be connected in prallel");}
  else{  if (voltage < 0) {
  Node temp = nodeP;
   nodeP = nodeN;
       nodeN = temp;
 voltage = -1*voltage;
        }
     nodes = new Node[2];
  nodes[0] = nodeP;
    nodes[1] = nodeN;
        nodesBox.add(nodes);
        VoltageIdcount++;
        this.Id = VoltageIdcount;
        this.value = voltage;
    }}
    /**
return an array of the two nodes that the resistor is connected to.*/
    public Node[] getNodes() {
        return nodes;
    }
        /**
Check if these two nodes are connected to another voltage source to prevent creating to voltage sources in parallel
*/
    public static boolean checkForIllegal1(Node nodeP, Node nodeN){
        boolean x = false;
        //nodesBox.add(nodes);
    for (Node[] ns : nodesBox) {
    if ((ns[0].getId() == (nodeP.getId()) && (ns[1].getId() == nodeN.getId())||( (ns[1].getId() == nodeP.getId()) && ns[0].getId() == nodeN.getId()))  )
    {
               x = true;

    }
}
    return x;}
       /**
Check if these two nodes are the same to prevent connecting a both ends of a battery, or creating a short circuit.
*/
public static boolean checkForIllegal2(Node nodeP, Node nodeN){
    
    return (nodeP.getId())== (nodeN.getId());
    
}
       /**
returns the ID of the Voltage Source
*/
    
public int getId()
{return this.Id;}
    @Override
       /**
string representation of an object of class VoltageSource*/

    public String toString() {
        return "V" + this.Id + " " + nodes[0] + " " + nodes[1] + " DC " + value + " " + "\n";
    }
}
