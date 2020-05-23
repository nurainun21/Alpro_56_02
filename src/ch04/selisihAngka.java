public class selisihAngka {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		for ( int i = 0; i<data.length-1; i++ ) {
		int selisih = data[i] - data[i+1];
		System.out.println("Selisih " + data[i] + " dengan " + data[i+1] + " = " + selisih);
		}
	}
}