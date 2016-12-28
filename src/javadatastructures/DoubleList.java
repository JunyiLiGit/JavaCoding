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
public class DoubleList 
{
	private Node head;
	public DoubleList(int data) 
	{
		head = new Node(data);
	}
	
	public void insertToHead(int data) 
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			this.head = newNode;
		} else 
		{
			head.setPre(newNode);
			newNode.setNext(head);
			head = newNode;
		}
	}
	
	public void insertToTail(int data) 
	{
		Node newNode = new Node(data);
		Node n = head;
		while( n.getNext()!= null ) 
		{
			n = n.getNext();
		}
		n.setNext(newNode);
		newNode.setPre(n);
	}
	
}
