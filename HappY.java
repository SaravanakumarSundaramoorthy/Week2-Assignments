package assignments;

import w2.day2.Today;

public class HappY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HappY happy = new HappY();

		int n = 19;
		int temp = n;

		while (temp != 1 && temp != 4) {
			temp = happy.digi(temp);
		}

		if (temp == 1) {
			System.out.println("Happy Number");
		} else if (temp == 4) {
			System.out.println("Not Happy");
		}

	}

	public int digi(int n) {
		int sum = 0, rem = 0;

		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem);
			n = n / 10;
		}
		return sum;
	}

}
