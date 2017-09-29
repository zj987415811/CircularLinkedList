package com.zj.list;

import org.w3c.dom.Node;

public class CircleLinkedList<T> {
	Node head,tail;
	Node pNode;
	int size=0;
	public CircleLinkedList() {
		// TODO Auto-generated constructor stub
		this.head=null;
		tail=head;
		pNode=head;
	}
	public int length(){
		return size;
	}
	public void add(T data) {
		Node node=new Node<T>(data);
		if(head== null) {
			head=node;
			tail=head;
			pNode=head;
			size++;
		}else {
			
		}
	}
	
}
