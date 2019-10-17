
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{

    public static void main(String[] args) //
    {
        // Key Point: "Set" declares a number of methods.
        //          : "HashSet" and "TreeSet" implement those methods.
        //          : This is one definition of abstraction.

        // HashSet works different than TreeSet
        Set<Integer> s = new HashSet<>();
        
        System.out.println("empty: " + s.isEmpty());               // isEmpty() method
        System.out.println("size: " + s.size());                   // size()    method

        s.add(500);                                                // add()     method
        s.add(300);
        s.add(200);
        s.add(100);

        System.out.println("empty: " + s.isEmpty());
        System.out.println("size: " + s.size());

        // Key Point: With a Set, we can't iterate using an index.
        for (Integer i : s) {                                      // iteration over everything in the set
            System.out.println(i);
        }
        
        System.out.println("contains(100): " + s.contains(100));   // contains() method
        System.out.println("contains(900): " + s.contains(900));
    }

}