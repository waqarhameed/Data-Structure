package javacollections;
import java.util.Enumeration;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
	      Vector<Integer>  v = new Vector<Integer>();
	     // Properties cap = new Properties();
	      
v.removeElement(new Integer(1));
v.addElement(new Integer(1));

	      
 System.out.println("Initial capacity: " + v.capacity());
  System.out.println("vector size" + v.size());
  v.addElement(new Integer(2));
  v.addElement(new Integer(3));
  v.addElement(new Integer(4));
  v.addElement(new Integer(5));
  v.addElement(new Integer(6));

  System.out.println("Initial capacity: " + v.capacity());

  if(v.contains(new Integer(5)))
      System.out.println("Vector contains 3.");
      
   Enumeration<Integer> vnum=v.elements();
  System.out.println("elements are");
  while(vnum.hasMoreElements()){
	  System.out.print(vnum.nextElement() + " ");
  }
	}

}