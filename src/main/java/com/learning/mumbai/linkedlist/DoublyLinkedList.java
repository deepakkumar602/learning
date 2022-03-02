package com.learning.mumbai.linkedlist;

class DoublyLinkedList
{
	int value;
	DoublyLinkedList prev;
	DoublyLinkedList next;
	
	DoublyLinkedList(int value)
	{
		this.value = value;
	}
	
	public void add(int value)
	{
		DoublyLinkedList node = this;
		
		while(node.next != null)
		{
			node = node.next;
		} 
		DoublyLinkedList temp = new DoublyLinkedList(value);
		node.next = temp;
		temp.prev = node;
	}
	
	public void show(DoublyLinkedList node)
	{
		DoublyLinkedList node1 = node;
		boolean start = true;
		String prefix = "";
		while(node1 != null)
		{
			if (!start) {
				prefix = " -> ";
			} else {
				start = false;
			}
			System.out.print(prefix + node1.value);
			node1 = node1.next;
		}	
	}
	
	public void showBackword(DoublyLinkedList node)
	{
		DoublyLinkedList node1 = node;
		
		while(node1 != null)
		{
			node1 = node1.next;
		}
		
		//while(node1.prev != null)
		//{
			System.out.print(node1.value);
			//node1 = node1.prev;
		//}		
	}
	
	public static void main(String... s)
	{
		DoublyLinkedList List = new DoublyLinkedList(1);
		List.add(5);
		List.add(6);
		
		List.show(List);
		List.showBackword(List);
	}
	
}