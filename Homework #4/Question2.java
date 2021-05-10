import java.util.Iterator;

public class Question2 {

 public static void main(String[] args) {
  MyTwoWayLinkedList<String> list = new MyTwoWayLinkedList<>();
  list.add(1234, "asdf");
  list.add(5678, "ghjk");
  list.add(1456, "qwer");
  for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
   iterator.remove();
  }
  System.out.println(list);
 }

}
