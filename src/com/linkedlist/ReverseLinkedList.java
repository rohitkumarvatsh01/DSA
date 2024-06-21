package com.linkedlist;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	
	Node reverseList(Node head) {
		Node curr=head;
		Node prev=null;
		Node next=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}
	
	void append(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(data);
	}
	
	void printList(Node head) {
		Node curr=head;
		
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}
}
public class ReverseLinkedList {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		
		System.out.println("Original List: ");
		list.printList(list.head);
		
		list.head=list.reverseList(list.head);
		
		System.out.println("Reversed List: ");
		list.printList(list.head);
	}
}
