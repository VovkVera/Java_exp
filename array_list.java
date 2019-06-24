package capability.org.ua;

import java.util.*;
import java.util.stream.IntStream;

public class arrayEx {
	
	public static void main(String[] args) {
			
		int[] a1= new int[10];
		a1[0] = 1;
		
		Arrays.fill(a1, 2);
		
		System.out.println(a1[3]);
		System.out.println(a1.length);
		
		String[] a2 = {"one", "two"};
		int[] oneTo10 = IntStream.rangeClosed(1,10).toArray();
		
		for(int x: oneTo10) System.out.println(x);
		
		System.out.println(Arrays.binarySearch(oneTo10, 9));
		
		int a3[][] = new int[2][2];
		
		String[][] a4 = {{"00","56"},		
		{"01","11"}};
		
		int a6[] = {1,2,3};
		int a7[] = Arrays.copyOf(a6, 3);
		
		int a8[] = {3,2,1};
		Arrays.sort(a8);
		System.out.println(Arrays.toString(a8));
    
    ////list
    ArrayList<String> aL1 = new ArrayList<String>(20);
		aL1.add("Sue");
		
		ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4)); 
		for(Integer x: aL2)	System.out.print(x);
		
		aL2.remove(3);
		//aL2.clear();
		System.out.println();
		System.out.println();
		Iterator it = aL2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//linked list
		
		LinkedList<Integer> iL1 = new LinkedList<Integer>();
		iL1.add(1); iL1.add(2); iL1.add(3);
		iL1.addAll(Arrays.asList(1,2,3,4));
		
		iL1.addFirst(0);
		System.out.println(iL1.contains(4));
		for(Integer x:iL1) System.out.print(x); System.out.println();
		
		iL1.set(0, 2);
		for(Integer x:iL1) System.out.print(x); System.out.println();
		System.out.println(iL1.size());
		Object[] a9 = iL1.toArray();
		for(Integer x:iL1) System.out.print(x); System.out.println();
				
	}

}
