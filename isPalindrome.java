package array;

//import java.util.HashMap;
//import java.util.Map;

class example {
	  static public boolean isPalindrome(int x) {
	    if(x<0) {
	    	return false;
	    }
	    int orignal=x;
	    int reverse=0;
	    while(x!=0) {
	    	int digit =x%10;
	    	reverse =reverse*10+digit;
	    	x/=10;
	    }
		return orignal==reverse;
	  }
    public static void main(String args[]) {
    	int x=121;
    	boolean result;
		 result=isPalindrome(x);
    	System.out.println(result);
    }
}

