import linked_list.Node;
import linked_list.SinglyLinkedList;
import linked_list.SinglyLinkedListImpl;

/*
 * ReverseLinkedList.java
 * 
 * Reverses a linked list
 */
public class ReverseLinkedList
{
	public static void main(String[] args){
		SinglyLinkedList<String> list = new SinglyLinkedListImpl<String>("A");
		list.insert("B");
		list.insert("C");
		printList( list );
		list.insert("D");
		list.insert("E");
		printList( list );
		list.insertAfter(list.getHead(), "1");
		printList( list );
		list.insertAfter(list.getTail(), "2");
		printList( list );
		list.setHead("3");
		list.insertAfter(list.getHead(), "4");
		printList( list );
		list.remove(list.getHead());
		list.remove(list.getTail());
		printList( list );
		list.remove(list.getTail());
		printList( list );
		list.remove(list.getHead());
		list.remove(list.getTail());
		printList( list );
		list.setTail("End");
		printList( list );
		list.setHead("Head");
		printList( list );
		list.remove(list.getHead());
		list.remove(list.getTail());
		list.remove(list.getHead());
		list.remove(list.getTail());
		printList( list );
		list.insert("A");
		list.insert("A");
		list.insert("A");
		list.insert("A");
		list.insert("A");
		list.insert("A");
		list.insert("A");
		printList( list );
		Node<String> cursor = list.getHead();
		cursor = cursor.getNext();
		cursor = cursor.getNext();
		cursor = cursor.getNext();
		cursor = cursor.getNext();
		list.insertAfter(cursor, "insert");
		printList( list );
	}
	
	public static void printList( SinglyLinkedList<String> list ) {
		Node<String> cursor = list.getHead();
		while( cursor != list.getTail() ) {
			System.out.print( cursor.getValue() + ", " );
			cursor = cursor.getNext();
		}
		System.out.print( cursor.getValue() + "\n" );
	}

}
