public class angka {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Angka-angka ganjil yang diapit oleh angka genap : ");
		for (int i = 1; i< data.length-1; i++) {
			boolean a = (data[i-1] % 2 == 0);
			boolean b = (data[i+1] % 2 == 0);
			boolean c = ( a && b);
			boolean d = (data[i] % 2 != 0);
			boolean e = ( c && d);
			if (e) {
				System.out.println(data[i] + " ");
			}
		}
	}
}