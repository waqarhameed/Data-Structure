package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapdemo {

	public static void main(String[] args) {

       HashMap<String, Double> hmd=new HashMap<String, Double>();
	
       hmd.put ("junaid",new Double(2234.2));
       hmd.put("zahid", new Double(344.7));
       hmd.put("usman",new Double(6569));
       
       Set<Entry<String, Double>> set=hmd.entrySet();
       System.out.println(set);
       Iterator<Entry<String, Double>> i = set.iterator();
       
       // Display elements
       while(i.hasNext()) {
          Map.Entry me = (Map.Entry)i.next();
          System.out.print(me.getKey() + ": ");
          System.out.println(me.getValue());
       }
       
       double balance = ((Double)hmd.get("junaid")).doubleValue();
       System.out.println("balance " + balance);
       
       hmd.put("Zara", new Double(balance + 1000));
       System.out.println("Zara's new balance: " + hmd.get("junaid"));
	}       	
}

