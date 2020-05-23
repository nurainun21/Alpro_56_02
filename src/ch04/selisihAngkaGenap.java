public class selisihAngkaGenap {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for (int i = 0; i<data.length-1; i++) {
		boolean a = (data[i] % 2 == 0);
		boolean b = (data[i+1] % 2 == 0);
		boolean c = ( a && b );
			if (c) {
			int selisih = data[i] - data[i+1];
			System.out.println("Selisih " + data[i] + " dengan " + data[i+1] + " = " + selisih);
			}
		}
	}
}	