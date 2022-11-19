package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="stop";
String s2="post";

int l1=s1.length();
int l2=s2.length();

	char[] Convert1 = s1.toCharArray();
	char[] Convert2 = s2.toCharArray();
	
	Arrays.sort(Convert1);
	Arrays.sort(Convert2);
	if(Arrays.equals(Convert1, Convert2)) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not Anagram");
	}
	
	
	
	
	
	
	}

}
