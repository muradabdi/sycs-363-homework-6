package org.howard.edu.lsp.assignment6.integerset;

public class Driver {

    public static void main(String[] args) throws IntegerSetException {
    	
		// Creates three instances of the IntegerSet class in Driver
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		// Initializes set1 with random values
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(7);
		
		// Initializes set2 with random values
		set2.add(8);
		set2.add(9);
		set2.add(10);
		set2.add(11);
		set2.add(12);
		set2.add(13);
		set2.add(14);
		    
		System.out.println("Set1 is " + set1.toString());
		System.out.println("Set2 is " + set2.toString());
		  
		System.out.println("Are the sets equal? " + set1.equals(set2));
		
		System.out.println("The largest element in Set1 is " + set1.largest());
		  
		System.out.println("Smallest element in Set2 is " + set2.smallest());

		set1.union(set2);
		
		System.out.println("The union of Set1 and Set2 is " + set1.toString());
		
		// Reinitializes set1 with random values
		set1.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(8);
		set1.add(9);
		
		set1.intersect(set2);
		
		System.out.println("The intersection of Set1 and Set2 is " + set1.toString());
		
		// Triggers IntegerSetException
		set3.smallest();
		
    }

}
