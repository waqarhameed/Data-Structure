import java.util.ArrayList;


public class arrylist {
	public static void main(String[] args) {
         ArrayList al=new ArrayList();
         
         
         al.add("A");
         al.add("F");
         al.add("G");
         al.add("E");
         al.add("B");
         al.add("I");
         al.add(1,"K");
         
         System.out.println(al.size());
         System.out.println(al);
         al.remove("K");
         al.remove(3);
         System.out.println(al.size());
         System.out.println(al);

	}

}
