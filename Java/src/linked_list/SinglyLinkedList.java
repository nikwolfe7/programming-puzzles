package linked_list;

public interface SinglyLinkedList<T>
{
	public Node<T> getHead();
	
	public void setHead( T val );
	
	public Node<T> getTail();
	
	public void setTail( T val );
	
	public void insert( T val );
	
	public void insertAfter( Node<T> node, T val );
	
	public Node<T> remove( Node<T> node );
	
	public boolean isEmpty();
}
