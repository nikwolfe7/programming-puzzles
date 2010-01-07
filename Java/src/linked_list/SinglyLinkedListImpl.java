package linked_list;

public class SinglyLinkedListImpl<T> implements SinglyLinkedList<T>
{
	private Node<T> head;
	private Node<T> tail;

	public SinglyLinkedListImpl(T val) {
		this.head = new Node<T>(val);
		this.tail = head;
	}

	public Node<T> getHead() {
		return this.head;
	}

	public Node<T> getTail() {
		return this.tail;
	}

	public void insert(T val) {
		Node<T> newNode = new Node<T>( val );
		tail.setNext( newNode );
		tail =  newNode;
	}

	public void insertAfter(Node<T> node, T val) {
		if( node == tail ) {
			insert( val );
		}
		else {
			Node<T> temp = node.getNext();
			Node<T> newNode = new Node<T>( val );
			node.setNext( newNode );
			newNode.setNext( temp );
		}
	}

	public boolean isEmpty() {
		if( head.getValue() == null ) {
			return true;
		}
		else {
			return head == tail;
		}
	}

	public Node<T> remove(Node<T> node) {
		Node<T> cursor = head;
		Node<T> prev = cursor;
		if( cursor == node ) {
			Node<T> n = head.getNext();
			head.setNext( null );
			head = n;
		}
		else {
			while( cursor != tail ) {
				cursor = cursor.getNext();
				if( cursor == node ) {
					prev.setNext( cursor.getNext() );
					break;
				}
				prev = cursor;
			}
			if( node == tail ) {
				tail = prev;
				tail.setNext( prev );
			}
		}
		return cursor;
	}

	public void setHead(T val) {
		Node<T> newNode = new Node<T>( val );
		newNode.setNext( head );
		head = newNode;
	}
	
	public void setTail(T val) {
		insert( val );
	}
}
