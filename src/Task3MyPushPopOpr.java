/*Create a LinkedList with elements, call push () and pop () methods on LinkedList objects “First”, “Second”, “Third”
and “Random”. Print the elements of the LinkedList then Push the Element “Zero”, and then print the contents of
the LinkedList. After this POP the Element, then print the contents of the LinkedList.
*/

import java.util.LinkedList;

public class Task3MyPushPopOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Original Linked List : " + arrl);
		
		//Push to Linked List
		arrl.push("One");
		arrl.push("two");
		System.out.println("After Push some Data to Linked List : " + arrl);
		
		//Pop from Linked List
		arrl.pop();
		arrl.pop();
		arrl.pop();
		System.out.println("After Pop from Linked List: " + arrl);
		
				
	}

}
