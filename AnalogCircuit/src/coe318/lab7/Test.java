/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package coe318.lab7;

/**
 *
 * @author Mohamed Khedr
*/
    
  package coe318.lab7;

import java.util.Scanner;
/**
the main class that Test the run of the program and contains the main method.*/
public class Test {
    public static void main(String[] args) {
 Circuit c = Circuit.getInstance();
   String input = "";

        System.out.println("The format for describing (for example) a 5.2 Ohm resistor connected between nodes 2 and 3 is:\n" +
   "r 2 3 5.2\n" +
     "The format for describing a 6.5 Volt source connected between nodes 1 and 2 (where the positive side\n" +
   "of the source is connected to node 1) is:\n" +
 "v 1 2 6.5\n"+ "Type 'end' to terminate Program or 'spice' to display the circuit's data.\n");

 Scanner scanner = new Scanner(System.in);
   while (!input.equals("end")) {
            String line = scanner.nextLine(); // Read the whole line
   String[] parts = line.split("\\s+"); // Split the line by whitespace
        String type = parts[0];
        if (type.equals("end")) {
        input = "end";
            } else if (type.equals("spice")) {
     System.out.println(c);
      c.isMissingnode();

      } else {
      int node1 = Integer.parseInt(parts[1]);
    int node2 = Integer.parseInt(parts[2]);
    double value = Double.parseDouble(parts[3]);


    if (type.equals("v")) {
       try{ VoltageSource v = new VoltageSource(value, new Node(node1), new Node(node2));
       c.addVoltageSource(v);}catch(Exception e){System.out.println("Input Error: your input was not recorded! Try again");}
     } else if (type.equals("r")) {
         try {
                    Resistor r = new Resistor(value, new Node(node1), new Node(node2));
              c.addResistor(r);}catch(Exception e){System.out.println("Input Error: your input was not recorded! Try again");}
  
                }}}
 System.out.println("All Done");
        c.isMissingnode();
     }

    }

