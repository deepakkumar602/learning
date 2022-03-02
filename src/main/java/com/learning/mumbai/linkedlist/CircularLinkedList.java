package com.learning.mumbai.linkedlist;

class CircularLinkedList
{
	public static Node findEndNodeOfCircularList(Node head)
	{
		if (head == null) {
			return null;
		}

		Node p1 = head;
		Node p2 = head;

		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p1 == p2) {
				break;
			}
		}

		if(p2.next == null)
		{
			return null;
		}

		p1 = head;
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}

		return p1;
	}
	
	public static void main(String... s)
	{
		Node node = Node.getInputViaArray();

		Node.getOutputList(node);
		
		CircularLinkedList cl = new CircularLinkedList();

		Node newList = cl.findEndNodeOfCircularList(node);

		if(newList == null) {
			System.out.println("Linked list is not circular");
		} else {
			Node.getOutputList(newList);
		}
	}
}