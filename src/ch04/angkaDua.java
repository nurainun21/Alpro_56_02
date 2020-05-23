public class angkaDua {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for (int i = 0; i<data.length; i++) {
			boolean a = (data[i] % 10 == 2);
			boolean b = (data[i] % 10 == 0);
			boolean c = ( a || b );
			boolean d = (data[i] % 10 == 6);
			boolean e = ( c || d);
			if (e) {
				System.out.print(data[i]+" ");
			}
		}
	}
}	