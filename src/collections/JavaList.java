package collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaList {   
    public static void main(String[] args) {

		//ArrayList implements list which inturn extends the collections interface
		/*size()
		Returns the length of the arraylist.


		sort()
		Sort the arraylist elements.


		clone()
		Creates a new arraylist with the same element, size, and capacity.


		contains()
		Searches the arraylist for the specified element and returns a boolean result.


		ensureCapacity()
		Specifies the total element the arraylist can contain.


		isEmpty()
		Checks if the arraylist is empty.


		indexOf()
		Searches a specified element in an arraylist and returns the index of the element. */
        List<Integer> l1 = new java.util.ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(4);

        System.out.println(l1.indexOf(3));
		//iterating the list
		for(int i:l1){
			System.out.println(i);
		}

		//LinkedList
		List<Integer> l2 = new LinkedList<>();
		l2.add(2);

		//Vector
		//Vectors are less efficient that array list because when vector accesses a method, it locks it and does not 
		//allow other methods to use it
		Vector<String> animals = new Vector<>();
		animals.add("cow");
		animals.add("goat");

		for(String animal:animals){
			System.out.println(animal);
		}

        
    }
    
}
