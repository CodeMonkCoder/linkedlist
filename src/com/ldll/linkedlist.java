package com.ldll;

public class linkedlist {
	private Node head = null;
	private Node tail = null;

	public void display() {
		Node curr = this.head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println(".");
	}

	public Node gethead() {
		return head;
	}
	public Node gettail()
	{
		return tail;
	}

	private void addLastNode(Node node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
	}

	public void addLast(int data) {
		Node node = new Node(data);
		addLastNode(node);
	}
}
