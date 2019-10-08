package smooth_sailing;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.javafx.collections.ImmutableObservableList;

import jdk.nashorn.internal.ir.annotations.Immutable;

public class ReverseInPeranthese {
	String reverseInParentheses(String inputString) {
	    StringBuilder temp = new StringBuilder(inputString);
	    int start,end;
	    while(temp.indexOf("(")!=-1){
	        start = temp.lastIndexOf("(");
	        end = temp.indexOf(")",start);
	        temp.replace(start,end+1, new StringBuilder(temp.substring(start+1,end)).reverse().toString());
	    }
	    return temp.toString();
	}
	String[] addBorder(String[] picture) {
		String[] a = new String[picture.length+2];
		int i = 1;
		for(String s:picture){
			String temp = "*"+s+"*";
			a[i++]=temp;
		}
		a[0]=a[i]=a[1].replace(".", "*");
		return a;
	}
	boolean areSimilar(int[] a, int[] b) {
	    List<int> il = Arrays.asList(a);  
	    
	    tempA = a;
	    return true;
	}

}
