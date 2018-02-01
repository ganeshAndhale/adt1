package com.basicsoops;

public class TwoDArray {

	private int n;
    private SPArray sparsearray[];
    
    public TwoDArray(int n ){
    	this.n = n;
    	sparsearray = new SPArray[n];
    	
    	for(int i=0; i< n; i++) {
    		sparsearray[i] = new SPArray(n); 
    	}
    	
    	
    }
    
    public void store(int rowIndx, int colIndx, Object obj) {
    	if (rowIndx < 0 || rowIndx > n)
        throw new RuntimeException("row index out of bounds");
    if (colIndx < 0 || colIndx > n)
        throw new RuntimeException("col index out of bounds");
    
    sparsearray[rowIndx].store(colIndx, obj);
    }
    
    public Object get(int rowindex, int colindex) {
    	
    	if (rowindex < 0 || colindex > n)
            throw new RuntimeException("row index out of bounds");
        if (rowindex < 0 || colindex > n)
            throw new RuntimeException("col index out of bounds");
    	return sparsearray[rowindex].fetch(colindex);
    }
	public static void main(String args[]) {
		
		Integer inter[][] = new Integer[3][3];
		
		inter[0][0] = 5;
		inter[0][1] = null;
		inter[0][2] = null;
		inter[1][0] = 1;
		inter[1][1] = 45;
		inter[1][2] = null;
		inter[2][0] = null;
		inter[2][1] = 7;
		inter[2][2] = null;
		
		TwoDArray tw = new TwoDArray(3);
		 for (int rowindex = 0; rowindex < 3; rowindex++)
	        {
	            for (int colindex = 0; colindex < 3; colindex++)
	            {
	            	tw.store(rowindex, colindex,
	            			inter[rowindex][colindex]);
	            }
	        }
		 
		 System.out.println("the sparse Matrix is ");
	        for (int rowindex = 0; rowindex < 3; rowindex++)
	        {
	            for (int colindex = 0; colindex < 3; colindex++)
	            {
	                System.out.print(tw.get(rowindex, colindex) + "\t");
	            }
	            System.out.println();
	        }
	    }
		
	}

class List {
	private int index;
    private Object value;
    private List nextindex;
    
    public List(int index)
    {
        this.index = index;
        nextindex = null;
        value = null;
    }
    
    public List()
    {
        index = -1;
        value = null;
        nextindex = null;
    }
    
    public void store(int index, Object value)
    {
        List current = this;
        List previous = null;
 
        List node = new List(index);
        node.value = value;
        while (current != null && current.index < index)
        {
            previous = current;
            current = current.nextindex;
        }
        if (current == null)
        {
            previous.nextindex = node;
        }
        else
        {
            if (current.index == index)
            {
                System.out.println("DUPLICATE INDEX");
                return;
            }
            previous.nextindex = node;
            node.nextindex = current;
        }
        return;
    }
    
    public Object fetch(int index)
    {
        List current = this;
        Object value = null;
        while (current != null && current.index != index)
        {
            current = current.nextindex;
        }
        if (current != null)
        {
            value = current.value;
        }
        else
        {
            value = null;
        }
        return value;
    }
    
    public int elementCount()
    {
        int elementCount = 0;
        for (List current = this.nextindex; (current != null); current = current.nextindex)
        {
            elementCount++;
        }
        return elementCount;
    }
}

class SPArray {
	private int indx;
	private List listVal;
	
	SPArray(int x) {
		listVal = new List();
		this.indx = x;
	}
	
	public void store(int index, Object value)
    {
        if (index >= 0 && index < indx)
        {
            if (value != null)
            	listVal.store(index, value);
        } else
        {
            System.out.println("INDEX OUT OF BOUNDS");
        }
    }
	
	 public Object fetch(int index)
	    {
	        if (index >= 0 && index < indx)
	            return listVal.fetch(index);
	        else
	        {
	            System.out.println("INDEX OUT OF BOUNDS");
	            return null;
	        }
	    }
	 
	 public int elementCount()
	    {
	        return listVal.elementCount();
	    }
}
