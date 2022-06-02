package nhlamulo;

import java.util.Collection;

public class A {

	public static void main(String args[]) {
		String a = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		Summarizer summarizer = new Summarizer();
		Collection<Integer> b = summarizer.collect(a);
		
		String s = summarizer.summarizeCollection(b);
		
		System.out.println(s);
		
		
	}
}
