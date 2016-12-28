/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadatastructures;

/**
 *
 * @author junyili
 */
public class JavaDataStructures {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		SingleList sl = new SingleList(10);
		sl.insertToHead(5);
		sl.insertToTail(15);
		sl.insertToTail(8);
		sl.insertToTail(6);
		sl.printValue();
		sl.delete(sl.getHead().getNext());
		sl.delete(6);
		sl.printValue();
		if (sl.search(5) != null) 
		{
			System.out.println("find");
		}
		if (sl.search(25) != null) 
		{
			System.out.println("find");
		} else 
		{
			System.out.println("not find");
		}
	}
	
}
