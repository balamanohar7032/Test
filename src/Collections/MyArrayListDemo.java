package Collections;
import java.util.Arrays;

 class MyArrayList {
	
	private Object[] arrayObjs;
	private int idx;
	
	
	// Constructors
		public MyArrayList()
		{
			this(10);
		}
		
	public MyArrayList(int initialcapacity)
	{	
		arrayObjs = new Object[initialcapacity];
	}
	
	
	public int size()
	{
		return idx;
	}
	
	
	public boolean add(Object obj)
	{
		return add(idx, obj);
	}
	
	
	public boolean add(int index, Object obj)
	{
		// check for the index out of bounds condition
		if(index < 0 || index > idx)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		// increase the size of the list if idx reaches the maximum limit
		if(idx > arrayObjs.length - 1)
		{
			increaseSize();
		}
		
		if(index < idx)
		{
			// Prior to inserting the new element, move all the elements to next positions
			for(int temp = idx+1; temp > index; temp--)
			{
				arrayObjs[temp] = arrayObjs[temp-1];
			}
			
			// insert the element
			arrayObjs[index] = obj;
			
			// as the new element is added, increment the idx value.
			idx++;
		}
		else
		{
			// insert the element at the idx position
			arrayObjs[idx++] = obj;
		}	
		
		return true;
	}

	
	public boolean remove(Object obj)
	{	
		// Find the index of the obj in the array and call remove(index) method
		for(int i = 0; i < idx; i++)
		{
			if(arrayObjs[i].equals(obj))
			{
				return remove(i);
			}
		}
		
		return true;
	}
	

	public boolean remove(int index)
	{
		if(index < 0 || index > idx)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for(int i = index; i < idx - 1; i++)
		{
			arrayObjs[i] = arrayObjs[i+1];
		}
		
		// as the new element is deleted, decrement the idx value.
		arrayObjs[idx-1] = null;
		idx--;
		
		return true;
	}
	
	private Object increaseSize() 
	{
		int newcapacity = (arrayObjs.length * 3/2) + 1;
		arrayObjs=new Object[newcapacity];
		
		return arrayObjs;
		
			
	}

	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < idx; i++)
		{
			sb.append(arrayObjs[i].toString() + ",");
		}
		
		return "[" + sb.toString().substring(0, sb.length() - 1) + "]";
	}
	

}

public class MyArrayListDemo {

	public static void main(String[] args) {
MyArrayList myAL = new MyArrayList();
		
		// add elements to the List
		myAL.add("A");
		myAL.add("B");
		myAL.add("C");		
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		myAL.add(1, "D");
		myAL.add(2, "E");		
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		myAL.add(5, "F");		
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		for(int i = 0; i < 10; i++)
		{
			myAL.add(i);
		}
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		// Lets check the remove operations
		// remove the object 
		myAL.remove("F");
		System.out.println("After removing \"F\": ");
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		// remove the object at index
		myAL.remove(5);
		System.out.println("After removing element at index 5: ");
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		// remove element which is not in the ArrayList
		myAL.remove("F");
		System.out.println("After removing \"F\": ");
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		
		// remove last element in the ArrayList
		myAL.remove(new Integer(9));
		System.out.println("After removing \"9\": ");
		System.out.println(myAL + " @@@ " + myAL.size()); // print elements and size
		
		try 
		{
			myAL.add(40, "Z"); //this will throw an exception
		} 
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("ArrayIndexOutOfBoundsException raised.");
		}
		
	}
 
}

	
