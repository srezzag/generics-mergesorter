package edu.metrostate.ics340.msr812;

import java.util.Arrays;

public class MergeSorter<T> implements Comparable<T> {

	private static final int INFINITY = Integer.MAX_VALUE;

	public static <T> void sort(Comparable<? extends T>[] items) {
		System.out.print(Arrays.toString(items));

		for (int i = 0; i < items.length; i++) {
			if (items[i].equals(null)) {
				throw new NullPointerException("Array has a null item");
			}
		}
		sort(items, new Comparable [items.length], 0, items.length - 1);
	}

	public static <T> void sort(Comparable<? extends T>[] items,Comparable<? extends T>[] temp, int low, int high) {
		System.out.print(Arrays.toString(items));
		if (low >= high) {
			return;
		}
		int middle = (low + high) / 2;
		sort(items, temp, low, middle);
		sort(items,temp, middle + 1, high);
		
	}

	//private static <T> void merge(Comparable<? extends T>[] items, int low, int high) {
		 
	//}

	@Override
	public int compareTo(Object o) {
		int result = this.compareTo(o);
		return result;
	}
	
	public static void main(String[] args) {
		Comparable[] items = new Comparable[]{4,0,6,1,5,3};
		sort(items);
	}
}
