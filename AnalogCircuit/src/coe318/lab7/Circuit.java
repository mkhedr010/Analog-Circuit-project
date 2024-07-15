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
The Main Circuit that contain all the items.
*/
public class Circuit {

    ArrayList <Item> items = new ArrayList <Item> ();

private static Circuit instance = null;
/**
Used to create an object of class Circuit
*/
public static Circuit getInstance() {
if (instance == null) { instance = new Circuit();
}
return instance;
}
private Circuit() {} //Yes, the constructor is PRIVATE!
/**
Add Voltage Source v to the circuit
*/
public void addVoltageSource(VoltageSource v)
{ 
    
 items.add(v);
}
/**
Add resistor r to the circuit
*/
public void addResistor(Resistor r)
{ 
    items.add(r);
    
}

private void sortByItemIdAndType() {
    for (int i = 0; i < items.size(); i++) {
        for (int j = i + 1; j < items.size(); j++) {
Item item1 = items.get(i);
Item item2 = items.get(j);

   // Compare based on item ID
      if (item1.getId() > item2.getId()) {
  swapItems(i, j);
     } else if (item1.getId() == item2.getId()) {
                // Within the same item ID, sort voltage sources before resistors
       if (item1 instanceof Resistor && item2 instanceof VoltageSource ) {
                    swapItems(i, j);
      } else if (item1 instanceof VoltageSource && item2 instanceof Resistor) {
                    // No need to swap, already in correct order
                }
            }}}}
private void swapItems(int x1, int x2) {
    Item temp = items.get(x1);
    items.set(x1, items.get(x2));
    items.set(x2, temp);}
/**
check if the user added more nodes than the number he actually used.
or if the user skipped using one of the nodes and left it not connected to anything.
*/
 void isMissingnode()
{
      int  nodemaxId = 0;
      for (Item it : items){
    if (it.getNodes()[0].getId()>nodemaxId){
                        nodemaxId = it.getNodes()[0].getId();
    }
         if (it.getNodes()[1].getId()>nodemaxId){
       nodemaxId = it.getNodes()[1].getId();
                    }
      }
      if ((nodemaxId+1)>Node.getNcount())
  System.out.println("Note: something is wrong with your circuit. You have a node or more in the middle not connected to anything (e.g. you entred nodes ID from 0 to 6, but you missed connecting any thing to Node:5)");
                            System.out.println("number of nodes created: "+ (nodemaxId+1));
                   System.out.println("number of nodes in use: " + Node.getNcount());

                            

}

/**
Describe the String representation of the circuit
*/
        @Override
  public String  toString(){
      String st = "";
sortByItemIdAndType();
      for (Item i : items)
      { 
          st = st + i + "\n";
      }
  return st;
  }

}
