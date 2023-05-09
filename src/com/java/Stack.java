package com.java;

public class Stack {
	  private Node top;
	    
	    public Stack() {
	    	this.top=null;	
	    }

public void push(int data) {
	Node newNode= new Node(data);
	newNode.next=top;
	top=newNode;
}
	public int pop() {
		if(top==null) {
			return -1;
		}
		int poppedData=top.data;
		top= top.next;
		return poppedData;
	}
public void printstack() {
Node currentNode=top;
while(currentNode!=null) {
	System.out.println(currentNode.data+"");
	currentNode=currentNode.next;
}
System.out.println();
}
}
