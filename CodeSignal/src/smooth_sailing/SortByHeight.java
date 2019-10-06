package smooth_sailing;

import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {

	static int[] sortByHeight(int[] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int i = 0;i<a.length;i++){
			if(a[i]!=-1){
				temp.add(a[i]);
			}
		}
		Collections.sort(temp);
		int d=0;
		for(int i = 0;i<a.length;i++){
			if(a[i]!=-1){
				a[i] = temp.get(d);
				d++;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		StringBuilder temp = new StringBuilder("abb123");
		System.out.println(temp.replace(1, 3, "cc"));

	}

}
