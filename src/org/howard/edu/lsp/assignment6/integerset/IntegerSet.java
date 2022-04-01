package org.howard.edu.lsp.assignment6.integerset;

import java.util.*;

public class IntegerSet {

	private List<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet() {
	};

	public void clear() {
		set.clear();
	}

	public int length() {
		return set.size();
	}

	// Equal if sets contain same values in ANY order
	public boolean equals(IntegerSet b) { 
		for (Integer num : b.getSet()) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}

	public boolean contains(int value) {
		return set.contains(value);
	}

	public boolean isEmpty() {
		return set.isEmpty();
	}

	// Throws IntegerSetException if set is empty 
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			IntegerSetException e = new IntegerSetException("The given set in largest() is empty.");
			throw e;
		}
		return Collections.max(set);
	}

	// Throws IntegerSetException if set is empty
	public int smallest() throws IntegerSetException {
		if (set.size() == 0) {
			IntegerSetException e = new IntegerSetException("The given set in smallest() is empty.");
			throw e;
		}
		return Collections.min(set);
	}
  
	// Adds item or does nothing if already there	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}

	// Removes duplicates or does nothing if already there
	public void removeDuplicates(IntegerSet b) {
		for (Integer item : b.getSet()) {
			if (contains(item)) {
				set.remove(item);
			}
		}
	}
	
	public void remove(int item) {
		set.remove(item);
	}
	
	public void clearSet(IntegerSet b) {
		for (Integer item : set) {
			if (contains(item)) {
				set.remove(item);
			}
		}
	}
	
    public List<Integer> getSet() {
        return set;
    }

	public void union(IntegerSet b) {
		for (Integer item : b.getSet()) {
			if (!contains(item)) {
				set.add(item);
			}
		}
	}

	public void intersect(IntegerSet b) {	
		set.retainAll(b.set);
	}

	public void diff(IntegerSet b) {
		set.removeAll(b.set);
	}
	
	public String toString() {
		return set.toString();
	}
  
}
