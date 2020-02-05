import java.util.NoSuchElementException;
/**
 * LinkedList: a basic implementation of a singly linked list data structure. 
 * A linked list is a chain of ListNode objects. The head of the list is the 
 * first node of the chain (or null in the case of an empty list).
 * 
 * @author Bill Keller 
 * @version January 2011
 */
public class LinkedList
{
  // a linked list has a head node and a size
  private ListNode head;
  private int size;

  /**
   * Construct a new empty list
   */
  public LinkedList() {
    head = null;
    size = 0;
  }

  /**
   * Add a new item as the first element
   * @param ListNode node
   */
  public void addFirst(ListNode node) {
    node.setNext(head);
    head = node;
    ++size;
  }

  /**
   * Remove the first list item
   */
  public ListNode removeFirst() {
    ListNode first = head;
    // report error if list empty
    if (head == null) {
      throw new NoSuchElementException();
    } 
    // otherwise remove the item
    else {
      ListNode temp = head;
      head = head.getNext();
      temp.setNext(null);
      size--;
    }
    return first;
  }
  public void add(Object item) {
      ListNode node = new ListNode(item, null);
      addFirst(node);
      size++;
  }
  public boolean contain(Object input){
      boolean result = false;
      ListNode node = this.head;
      for(int i = 0; i<size; i++){
          if (node.getData() == input) {
            result = true;
          } else {
            node = node.getNext();
          }
      }
      return result;
  }
  public void remove(int j){
      ListNode node = this.head;
      ListNode nextNode;
      ListNode previousNode;
      if (j == 0) {
            nextNode = node.getNext();
            node.setNext(null);
            this.head = nextNode;
            this.size--;
      } else {
          previousNode = node;
          node = node.getNext();
          for(int i = 1; i<size; i++){
              if (i == j) {
                previousNode.setNext(node.getNext());
                node.setNext(null);
                this.size--;
              } 
              previousNode = node;
              nextNode = node.getNext();
          }
      }
  }
  public void add(int j, Object item) {
      ListNode node = this.head;
      ListNode nextNode;
      ListNode previousNode;
      ListNode newNode = new ListNode(item, null);
      if (j == 0) {
          newNode.setNext(this.head);
          this.head = newNode; 
          this.size++;
      } else {
          previousNode = node;
          node = node.getNext();
          for(int i = 1; i<size; i++){
              if (i == j) {
                newNode.setNext(previousNode.getNext());
                previousNode.setNext(newNode);
              } 
              previousNode = node;
              nextNode = node.getNext();
              this.size++;
          } 
      }
  }
  public LinkedList reverse() {
      LinkedList reversedList = new LinkedList();
      ListNode node;
      ListNode previousReversedListNode;
      node = this.head;
      ListNode reversedListNode = this.head;
      node = node.getNext();
      for (int i = 1; i<size; i++){
          previousReversedListNode = reversedListNode;
          reversedListNode = node;
          reversedListNode.setNext(reversedListNode);
          node = node.getNext();
          reversedList.size++;
      }
      reversedList.head = reversedListNode;
      return reversedList;
  }
}
