package assignments;

public class LastWord {
	static int l = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "fly me  to  the moon";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				l = 0;
			} else {
				l++;
			}
		}
		System.out.println("The last word is \"moon\" with length " + l);

	}

}
