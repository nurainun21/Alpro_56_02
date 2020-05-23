public class tampilkanKelipatanLima {
	public static void main(String[] args) {
		int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		System.out.println("Angka-angka kelipatan 5 : ");
		for (int i = 1; i<data.length; i++) {
			boolean k = (data[i] % 5 == 0);
			boolean l = (data[i-1] % 5 == 0);
			boolean m = ( k && l);
				if (m){
				System.out.print(data[i]);
				}
		}
	}
}	