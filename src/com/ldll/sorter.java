package com.ldll;

public class sorter {

	public void bubblesortlist(Node head) {
		// Node current will point to head
		Node current = head;
		Node index = null;
		;
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

	Node paritionLast(Node start, Node end) {
		if (start == end || start == null || end == null)
			return start;

		Node pivot_prev = start;
		Node curr = start;
		int pivot = end.data;

		while (start != end) {
			if (start.data < pivot) {
				// keep tracks of last modified item
				pivot_prev = curr;
				int temp = curr.data;
				curr.data = start.data;
				start.data = temp;
				curr = curr.next;
			}
			start = start.next;
		}
		int temp = curr.data;
		curr.data = pivot;
		end.data = temp;
		return pivot_prev;
	}

	void quicksortlist(Node start, Node end) {
		if (start == null || start == end || start == end.next)
			return;
		Node pivot_prev = paritionLast(start, end);
		quicksortlist(start, pivot_prev);

		if (pivot_prev != null && pivot_prev == start)
			quicksortlist(pivot_prev.next, end);
		else if (pivot_prev != null && pivot_prev.next != null)
			quicksortlist(pivot_prev.next.next, end);
	}
}
