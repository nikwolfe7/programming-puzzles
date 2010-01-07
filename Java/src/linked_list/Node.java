package linked_list;

public class Node<T>
{
	private T value;
	private Node<T> next;
	private Node<T> prev;

	public Node(T val) {
		this.value = val;
		this.next = this;
		this.prev = this;
	}

	public T getValue() {
		return this.value;
	}

	public void setVal(T val) {
		this.value = val;
	}

	public Node<T> getNext() {
		return this.next;
	}

	public void setNext(Node<T> nextNode) {
		this.next = nextNode;
	}

	public Node<T> getPrev() {
		return this.prev;
	}

	public void setPrev(Node<T> prevNode) {
		this.prev = prevNode;
	}
}
