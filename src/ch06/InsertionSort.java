public class InsertionSort {
	public static void main(String[] args) {
		int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Hasil Pengurutan Data = ");
		for (int i = 1; i < data.length; i++) {
			for (int j = i; j>=1; j--) {
				if (data[j] < data[j-1]) {
					int baru = data[j];
					data[j] = data[j-1];
					data[j-1] = baru;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
} 