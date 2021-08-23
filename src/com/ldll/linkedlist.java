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

	// used bubble sort to sort the linkedlist
	public void sortList() {

		// Node current will point to head
		Node current = head, index = null;

		int temp;

		if (head == null) {
			return;
		} else {
			while (current != null) {
				// Node index will point to node next to
				// current
				index = current.next;

				while (index != null) {
					// If current node's data is greater
					// than index's node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}
}
