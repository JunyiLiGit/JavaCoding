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
public class Node 
{
	private int data;
	private Node next;
	private Node pre;
	public Node(int data) 
	{
		this.data = data;
		this.next = null;
		this.pre = null;
	}
	public int getData() 
	{
		return this.data;
	}
	
	public void setData(int data) 
	{
		this.data = data;
	}
	
	public Node getPre() 
	{
		return this.pre;
	}
	
	public void setPre(Node pre) 
	{
		this.pre = pre;
	}
	
	public Node getNext() 
	{
		return this.next;
	}
	
	public void setNext(Node next) 
	{
		this.next = next;
	}
};
