package tree;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Heap<T extends Comparable<T>> implements MaxHeapInterface {
	
	private ArrayList<T> items;
	private ReadText readText;
	
	//Constructor
	public Heap() {
		items = new ArrayList<T>();		
	}
	
	private void siftUp()
	{
		int k = items.size() - 1;
		while (k > 0) {
			int p = (k-1)/(2);
			T item = items.get(k);
			T parent = items.get(p);
			if (item.compareTo(parent) > 0) {
				//swap
				//int temp = k;
				// THIS DOES NOT WORK: items.set(temp, k);
				items.set(k, parent);
				items.set(p, item);
				
				// move up 1 level
				k = p;
			} else {
				break;
			}
		}
	}
	
	public void insert(T item)
	{
		items.add(item);
		siftUp();
	}
	
	private void siftDown()
	{
		int k = 0;
		int l = (2)*(k+1);
		while (l < items.size())
		{
			int max = l, r = l + 1;
			
			if (r < items.size()) { 
				// child of right direction.
				if (items.get(r).compareTo(items.get(l)) > 0) {
					// switch
					T temp = items.get(k);
					items.set(k, items.get(max));
					items.set(max, temp);
					k = max;
					l = 2 * (k+1);
				}
			} else {
				break;
			}
		}
	}
	
	public boolean isEmpty()
	{
		return items.isEmpty();
	}
	
	public String toString()
	{
		return items.toString();
	}
	
	public boolean contains(T item)
	{
		// The below for simply goes through every generic item of type generic in the item generic array list, right?
		for(T t : items)
		{
			// best way for compare below.
			if (t.equals(item))
			{
				return true;
			}
		}
		return false;
	}
	
	public T delete()
	throws NoSuchElementException
	{
		if (items.size() ==0)
		{
			throw new NoSuchElementException();
		}
		if (items.size() ==1)
		{
			return items.remove(0);
		}
		T hold = items.get(0);
		items.set(0, items.remove(items.size()-1));
		siftDown();
		return hold;
	}

	@Override
	public void add(Comparable newEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comparable removeMax() {

		return null;
	}

	@Override
	public Comparable getMax() {

		return null;
	}

	@Override
	public int getSize() {
		return items.size();
	}

	@Override
	//Clear removes all entries from the heap.
	public void clear() {
		for(T t : items)
		{
			// best way for compare below.
			t.d
		}
	}
}
