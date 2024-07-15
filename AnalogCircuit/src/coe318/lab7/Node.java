/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;


/**
 *
 * @author Mohamed Khedr
 */
   /**
The node in the circuit that the items could connect to.
*/
public class Node {
 
    private static int rcount = 0;
   private final int Id;
        public static      ArrayList <Node> totalNodes = new ArrayList <Node> ();

  public Node (int Id){
      this.Id = Id;
         rcount++;
                         //  System.out.println("node created");
         isExist(Id);
  }
  /**
return the count of all the objects of class Node*/
  public static int getNcount(){return rcount;}
/**
return the Id of the node*/
  public int getId()
  {
  return this.Id;}
/**
check if the node with this ID was created before to avoid creating different nodes with the same ID for the same use, and to make all the objects connect to the node that the user means */
   void isExist(int n1)
{boolean dummy = false;
Node x = null;
    for (Node i : totalNodes){
    if ((i.getId() == n1) )
    {
 dummy = true;
 x = i;
    }}
           if(dummy) {  rcount--;
                 //     System.out.println("Node removed");
                      totalNodes.remove(x);}

       
}
   
   
    @Override
    /**
String representation of object Node*/
    public String toString()
    {
        return " " + this.Id;
    }
}
