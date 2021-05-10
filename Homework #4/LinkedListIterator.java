private class LinkedListIterator implements java.util.Iterator<E> {
  private Node<E> current = head; // Current index

  @Override
  public boolean hasNext() {
   return (current != null);
  }

  @Override
  public E next() {
   E e = current.element;
   current = current.next;
   return e;
  }

  @Override
  public void remove() {
   if(current != null) {
    Node<E> tmp = current;
    current = current.next;
    size--;
    if(tmp.next != null)
     tmp.next.previous = tmp.previous;
    if(tmp.previous != null)
     tmp.previous.next = tmp.next;
   }
   
  }
 }