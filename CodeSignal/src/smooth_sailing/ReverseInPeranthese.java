package smooth_sailing;

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
}
