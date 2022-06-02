package nhlamulo;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Summarizer implements NumberRangeSummarizer {

	  public  <T, U> Collection<U>
	    convertStringListToIntList(Collection<T> listOfString,
	                               Function<T, U> function)
	    {
	        return listOfString.stream()
	            .map(function)
	            .collect(Collectors.toList());
	    }
	@Override
	public Collection<Integer> collect(String input) {
		// TODO Auto-generated method stub
	    Collection<String> a = Arrays.asList(input.split(","));
	    Collection<Integer> b = convertStringListToIntList(a,Integer::parseInt);	    
		return b;
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		// TODO Auto-generated method stub
		
		Integer [] x = input.toArray(new Integer[input.size()]);
		
		Collection<String> c = new ArrayList<String>();
		int i=0, n=x.length;
		
		while(i<n)
		{
			int start,end;
			
			start = x[i];
			while(i+1<n && x[i+1]==x[i]+1) i++;
			end = x[i];
			
			if(start==end)
				c.add(start + "");
			else
				c.add(start + "-" + end);
			
			i++;
		}
		return c.toString();
	}
	

   
}	

