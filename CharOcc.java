package assignments;

public class CharOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome to chennai";
int c=0;

char[] con = s.toCharArray();

int l=con.length;

for(int i=0;i<l;i++) {
	if(con[i]=='e') {
		c++;
	}
}
System.out.println(c);
	}

}
