package assignments;

public class Palindrome {

	public static void main(String[] args) {

		String s = "A man,a plan,a canal:Panama";

		String temp = s;
		

		String low = temp.toLowerCase();

		String rep = low.replaceAll("[^a-zA-Z0-9]", "");

		String r = new StringBuffer(rep).reverse().toString();
		

		boolean result = r.equals(rep);

		if (result == true) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not Palindrome");
		}

	}

}
