public class tampilkanAngkaGanjil {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Tampilkan angka ganjil : ");
		for ( int i = 0; i<data.length; i++) {
			if (data[i] % 2 != 0) {
				System.out.print(data[i] + " ");
			}
		}
	}
}