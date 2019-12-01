package test;
import java.util.*;

public class MyCodingTask {
	
	static List<Integer[]> MERGE(List<Integer[]> input) {
	    
		//1.) sort input list of intervals
		List<Integer[]> sortedList = SortListOfArrays(input);
		
		//2.) merge overlapping intervals
		for(int i = 0; i < sortedList.size() - 1;) {
			
			if(sortedList.get(i)[1] >= sortedList.get(i+1)[0]) {
				
				//overlapped intervals are found -> merge -> put the new (merged) interval to the current place in the List
				sortedList.set(i, HelpMerge(sortedList.get(i), sortedList.get(i+1)));
				//remove the 2nd interval (which was merged with the 1st one from the list) -> list is one element shorter now!
				sortedList.remove(i+1);
			}
			else {
				//the current 2 intervals are not overlapped -> continue in the list (go to the next one)
				i++;
			}			
		}
	    
	    return sortedList;
	  }
	
	//Merge overlapping intervals
	static Integer[] HelpMerge(Integer[] a, Integer[] b) {
	    
	    Integer[] c = new Integer[2];
	    
	    //Set new left interval boundary
	    if(a[0] <= b[0]) {
	    	
	    	c[0] = a[0];
	    }
	    else {
	    	
	    	c[0] = b[0];
	    }
	    
	    //Set new right interval boundary
	    if(a[1] >= b[1]) {
	    	
	    	c[1] = a[1];
	    }
	    else {
	    	
	    	c[1] = b[1];
	    }
	    
	    return c;
	  }
	/*
	Sorts a list of intervals (integer arrays with length = 2)
	input: list of intervals (integer arrays with length = 2) to be sorted
	output: the sorted list of intervals (integer array with length = 2): lower -> upper
	*/
	static List<Integer[]> SortListOfArrays(List<Integer[]> input) {
	    
	    Integer[] temp = new Integer[2];
	    
	    for(int i = 0; i < input.size() - 1; i++)
	    	for(int j = i + 1; j < input.size(); j++) {
	    		
	    		if(input.get(i)[0] > input.get(j)[0]) {
	    			
	    			//swap intervals, if a smaller one is found 
	    			temp = input.get(i);
	    			input.set(i, input.get(j));
	    			input.set(j, temp);
	    		}
	    	}
	    
	    return input;
	  }
		
	  //Used to do some tests
	  public static void main(String[] args) {
		  
		  //Test example from the sheet
		  List<Integer[]> list = new ArrayList<Integer[]>();
		  
		  Integer[] arr1 = {2,19};
		  Integer[] arr2 = {4,8};
		  Integer[] arr3 = {14,23};
		  Integer[] arr4 = {25,30};
		  
		  list.add(arr1);
		  list.add(arr2);
		  list.add(arr3);
		  list.add(arr4);
		  
		  List<Integer[]> mergedList = MERGE(list);
		  
		  for(Integer[] intervall : mergedList ) {
			  System.out.print(Arrays.toString(intervall) + " "); 
		  }
		  
		  System.out.println(); 
		  
	  }

}
