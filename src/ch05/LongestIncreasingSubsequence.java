public class LongestIncreasingSubsequence {
	public void findSubsequence(int[] data) {
		int[] LIS = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			int max = -1;
			for (int j = 0; j < i; j++) {
				if (data[i] > data[j]) {
					if (max == -1 || max < LIS[j] + 1) {
						max = 1 + LIS[j];
					}
				}
			}
			if (max == -1) {
				max = 1;
			}
			LIS[i] = max;
		}
		
		int result = -1;
		int indeks = -1;
		for (int i = 0; i < LIS.length; i++) {
			if (result < LIS[i]) {
				result = LIS[i];
				indeks = i;
			}
		}
		
		String x =  data[indeks] + " ";
		int res = result-1;
		for (int i = indeks-1; i >= 0; i--) {
			if(LIS[i] == res) {
				x = data[i] + " " + x;
				res--;
			}			
		}
		System.out.println("Longest Increasing subsequence: " + result);
		System.out.println("Elemen : " + x);		
	}
	
	public static void main(String[] args) {
		int[] A = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
		LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
		i.findSubsequence(A);
	}
}