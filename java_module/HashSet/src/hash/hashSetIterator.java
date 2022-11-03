package hash;

public class hashSetIterator {
public static void main(String[] args)
    {
  
        
        HashSet<String> h = new HashSet<String>();
  
       
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
  
      
        h.add("India");
  
        
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));
  
       
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                           + h);
  
        
        System.out.println("Iterating over list:");
  
       
        Iterator<String> i = h.iterator();
  
       
        while (i.hasNext())
  
            // Iterating over elements
            // using next() method
            System.out.println(i.next());
    }
}
