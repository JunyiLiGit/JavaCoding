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
public class SingleList 
{	
	private Node head;
	public SingleList(int data) 
	{
		this.head = new Node(data);
	}
	//insert node 
	public void insertToHead(int data) 
	{
		Node newNode = new Node(data);
		if (head != null) 
		{
			newNode.setNext(head);
		}	
		this.head = newNode;
	}
	
	public Node getHead() 
	{
		return head;
	}
	
	public void insertToTail(int data) 
	{
		Node newNode = new Node(data);
		Node n = head;
		while(n.getNext() != null) 
		{
			n = n.getNext();
		}
		n.setNext(newNode);
	}
	
	public Node search(int data) 
	{
		Node n = head;
		while(n != null && n.getData() != data) 
		{
			n = n.getNext();
		}
		return n;		
	}
	
	public void delete(Node n) 
	{
		Node p = head;
		while ( p.getNext() != n ) 
		{
			p = p.getNext();
		}
		p.setNext(n.getNext());
	}
	
	public void delete(int data) 
	{
		Node p = head;
		if( p.getData() == data) 
		{
			head = head.getNext();
		}
		
		while( p!= null) 
		{
			if(p.getNext().getData() == data ) 
			{
				p.setNext(p.getNext().getNext());
				return;
			}
			p = p.getNext();
		}
	}
	
	public void printValue() 
	{
		Node n = head;
		while(n != null) 
		{
			System.out.println(n.getData());
			n = n.getNext();		
		}
	}
	
}
