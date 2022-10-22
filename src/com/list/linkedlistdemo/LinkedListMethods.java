package com.list.linkedlistdemo;

import java.util.*;

public class LinkedListMethods {

//	Unique methods of LinkedList
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		
/**
 * 1. addFirst
 * 2. addLast
 * 3. getFirst
 * 4. getLast
 * 5. offer
 * 6. offerFirst
 * 7. offerLast
 * 8. peek
 * 9. peekFirst
 * 10. peekLast
 * 11. poll
 * 12. pollFirst
 * 13. pollLast
 * 14. pop
 * 15. push
 * 16. removeFirst
 * 17. removeFirstOccurrence
 * 18. removeLast
 * 19. removeLastOccurrence
 */
		
//		1. addFirst(Object e) add element to first position of the list
//		ll.addFirst(6);
//		System.out.println(ll);
		
//		2. addLast(Object e) add element to last position of the list
//		ll.addLast(6);
//		System.out.println(ll);
		
//		3. getFirst element from the list
//		System.out.println(ll.getFirst());
		
//		4. getLast element from the list
//		System.out.println(ll.getLast());
		
//		5. offer(Object e)
//		Adds the specified element as the tail (last element) of this list
//		ll.offer(6);
//		System.out.println(ll);
		
//		6. offerFirst
//		Inserts the specified element at the front of this list.
//		ll.offerFirst(0);
//		System.out.println(ll);
	
//		7. offerLast(Object e)
//		Inserts the specified element at the end of this list.
//		ll.offerLast(6);
//		System.out.println(ll);
		
//		8. peek
//		Retrieves, but does not remove, the head (first element) of this list.
//		System.out.println(ll.peek());
//		System.out.println(ll);
		
//		9. peekFirst();
//		Retrieves, but does not remove, the first element of this list,or returns null if this list is empty
//		System.out.println(ll.peekFirst());
		
//		10. peekLast()
//		Retrieves, but does not remove, the last element of this list,or returns null if this list is empty.
//		System.out.println(ll.peekLast());
		
//		11.poll()
//		Retrieves and removes the head (first element) of this list.
//		System.out.println(ll.poll());
//		System.out.println(ll);
//		System.out.println(ll.poll());
//		System.out.println(ll);
		
//		12. pollFirst()
//		Retrieves and removes the head (first element) of this list. or returns null if this list is empty.
//		System.out.println(ll.pollFirst());
//		System.out.println(ll);
		
//		13. pollLast()
//		Retrieves and removes the last element of this list,or returns null if this list is empty.
//		System.out.println(ll.pollLast());
		
//		14. pop()
//		Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list. 
//		This method is equivalent to removeFirst()
//		System.out.println(ll.pop());
//		System.out.println(ll);
		
//		15. push()
//		Pushes an element onto the stack represented by this list. In otherwords, inserts the element at the front of this list. 
//		ll.push(12);
//		System.out.println(ll);
		
//		16. remove()
//		Retrieves and removes the head (first element) of this list.
//		System.out.println(ll.remove());
//		System.out.println(ll);
		
//		17. removeFirst()
//		Removes and returns the first element from this list.
//		System.out.println(ll.removeFirst());
//		System.out.println(ll);
		
//		18. removeLast()
//		Removes and returns the last element from this list.
//		System.out.println(ll.removeLast());
//		System.out.println(ll);
		
//		19. removeFirstOccurrence()
//		Removes the first occurrence of the specified element in thislist (when traversing the list from head to tail). If the listdoes not contain the element, it is unchanged.
//		ll.add(2);
//		System.out.println(ll);
//		ll.removeFirstOccurrence(2);
//		System.out.println(ll);
		
//		20. removeLastOccurrence()
//		Removes the last occurrence of the specified element in thislist (when traversing the list from head to tail). If the listdoes not contain the element, it is unchanged.
		ll.add(2);
		System.out.println(ll);
		ll.removeLastOccurrence(2);
		System.out.println(ll);
		
		
	}

}
