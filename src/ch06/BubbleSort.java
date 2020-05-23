public class BubbleSort {
	public static void main(String[] args) {
		int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Hasil Pengurutan Data = ");
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length-1; j++) {
				boolean isUrutanSesuai = data[j] < data[j+1];
				if (!isUrutanSesuai) {
					// swap
					int baru = data [j];
					data [j] = data [j+1];
					data [j+1] = baru;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
} 