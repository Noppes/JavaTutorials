
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 10;
		int j = 8;
		int k = 2;

		// 1
		System.out.println(i + j - k);

		// 2
		System.out.println(i - j + k);

		// 3
		System.out.println(i * k + j);

		// 4
		System.out.println(i + j * k);

		// 5
		System.out.println(i * k + k * j);

		// 6
		System.out.println(i + k * k + j);

		// 7
		System.out.println((i - j) + k);

		// 8
		System.out.println(i - (j + k));

		// 9
		System.out.println(i + (k * k) + j);

		// 10
		System.out.println((i + k) * (k + j));

		// 11
		System.out.println((i + k) * k + j);

		int result1 = 5 / 2;
		System.out.println(result1);

		double result2 = 5 / 2;
		System.out.println(result2);

		double result3 = 5 / 2.0;
		System.out.println(result3);

		double result4 = 5.0 / 2;
		System.out.println(result4);

		double result5 = 5 / 2 * 2;
		System.out.println(result5);

		double result6 = 5 / 2.0 * 2;
		System.out.println(result6);

		System.out.println("ASSIGNMENT:");
		// 1
		System.out.println(8.0 + 3 - 2);
		
		//2: 10 / 3 = 3
		System.out.println((8 + 2) / 3);
		
		//3: 5 / 2 = 2
		System.out.println((8 - 3) / 2);
		
		//4: 1.5 * 8 = 12 
		System.out.println(3.0 / 2 * 8);
		
		//5
		System.out.println(8 - 3 + 2);
		
		//6: 8 / 3 = 2; 2 / 2.0 = 1.0
		System.out.println(8 / 3 / 2.0);
		
		//7 
		System.out.println(8 / 3 * 2);
		
		//8: 8 * 2 = 16; 16 / 3 = 5
		System.out.println(8 * 2 / 3);
		
		
	}

}
