class MyTwoWayLinkedList<E> extends MyAbstractList<E> {
 private Node<E> head, tail;

 public MyTwoWayLinkedList() {
 }

 public MyTwoWayLinkedList(E[] objects) {
  super(objects);
 }

 public E getFirst() {
  if (size == 0) {
   return null;
  } else {
   return head.element;
  }
 }

 public E getLast() {
  if (size == 0) {
   return null;
  } else {
   return tail.element;
  }
 }

 public void addFirst(E e) {
  Node<E> newNode = new Node<E>(e); // Create a new node
  newNode.next = head; // link the new node with the head
  newNode.previous = null;
  head = newNode; // head points to the new node
  size++; // Increase list size

  if (tail == null) // the new node is the only node in list
   tail = head;
 }

 public void addLast(E e) {
  Node<E> newNode = new Node<E>(e); // Create a new for element e

  if (tail == null) {
   head = tail = newNode; // The new node is the only node in list
  } else {
   tail.next = newNode; // Link the new with the last node
   newNode.previous = tail;
   newNode.next = null;
   tail = tail.next; // tail now points to the last node
  }

  size++; // Increase size
 }

 @Override
 public void add(int index, E e) {
  if (index == 0) {
   addFirst(e);
  } else if (index >= size) {
   addLast(e);
  } else {
   Node<E> current = head;
   for (int i = 1; i < index; i++) {
    current = current.next;
   }
   Node<E> temp = current.next;
   current.next = new Node<E>(e);
   (current.next).previous = current;
   (current.next).next = temp;
   size++;
  }
 }


 public E removeFirst() {
  if (size == 0) {
   return null;
  } else {
   Node<E> temp = head;
   head = head.next;
   size--;
   if (head == null) {
    tail = null;
   } else {
    head.previous = null;
   }
   return temp.element;
  }
 }


 public E removeLast() {
  if (size == 0) {
   return null;
  } else if (size == 1) {
   Node<E> temp = head;
   head = tail = null;
   size = 0;
   return temp.element;
  } else {
   Node<E> temp = tail;
   tail = tail.previous;
   tail.next = null;
   size--;
   return temp.element;
  }
 }

 @Override

 public E remove(int index) {
  if (index < 0 || index >= size) {
   return null;
  } else if (index == 0) {
   return removeFirst();
  } else if (index == size - 1) {
   return removeLast();
  } else {
   Node<E> previous = head;

   for (int i = 1; i < index; i++) {
    previous = previous.next;
   }

   Node<E> current = previous.next;
   previous.next = current.next;
   previous.next.previous = previous;
   size--;
   return current.element;
  }
 }

 @Override
 public String toString() {
  StringBuilder result = new StringBuilder("[");

  Node<E> current = head;
  for (int i = 0; i < size; i++) {
   result.append(current.element);
   current = current.next;
   if (current != null) {
    result.append(", "); // Separate two elements with a comma
   } else {
    result.append("]"); // Insert the closing ] in the string
   }
  }

  return result.toString();
 }

 @Override
 public void clear() {
  size = 0;
  head = tail = null;
 }

 @Override
 public boolean contains(E e) {
  if(size == 0) {
   return false;
  } else {
   Node<E> tmp = head;
   while(tmp != null) {
    if(tmp.element.equals(e)) {
     return true;
    } else {
     tmp = tmp.next;
    }
   }
  }
  return false;
 }

 @Override
 public E get(int index) {
  checkIndex(index);
  Node<E> result = head;
  for (int i = 0; i < index; i++) {
   result = result.next;
  }
  return result.element;
 }

 @Override
 public int indexOf(E e) {
  if(size == 0) {
   return -1;
  } else {
   Node<E> tmp = head;
   int result = 0;
   while(tmp != null) {
    if(tmp.element.equals(e)) {
     return result;
    } else {
     tmp = tmp.next;
     result++;
    }
   }
  }
  return -1;
 }

 @Override
 public int lastIndexOf(E e) {
  if(size == 0) {
   return -1;
  } else {
   Node<E> tmp = tail;
   int result = size - 1;
   while(tmp != null) {
    if(tmp.element.equals(e)) {
     return result;
    } else {
     tmp = tmp.previous;
     result--;
    }
   }
  }
  return -1;
 }

 @Override
 public E set(int index, E e) {
  checkIndex(index);
  Node<E> tmp = head;
  for (int i = 0; i < index; i++) {
   tmp = tmp.next;
  }
  tmp.element = e;
  return e;
 }

 @Override
 public java.util.Iterator<E> iterator() {
  return new LinkedListIterator();
 }

 private void checkIndex(int index) {
  if (index < 0 || index >= size)
   throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
     + size);
 }