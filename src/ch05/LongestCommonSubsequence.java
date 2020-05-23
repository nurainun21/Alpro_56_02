public class LongestCommonSubsequence {
	public static int find(char[] m, char[] n) {
	    int[][] LCS = new int[m.length + 1][n.length + 1];
	    String[][] solution = new String[m.length + 1][n.length + 1];
	    // if m : null, maka LCS dari m, n = 0
		for (int i = 0; i <= n.length; i++) {
			LCS[0][i] = 0;
			solution[0][i] = "0";
		}
	

	    // if n : null maka LCS dari n, m = 0
	    for (int i = 0; i <= m.length; i++) {
			LCS[i][0] = 0;
			solution[i][0] = "0";
	    }
	

	    for (int i = 1; i <= m.length; i++) {
			for (int j = 1; j <= n.length; j++) {
				if (m[i - 1] == n[j - 1]) {
					LCS[i][j] = LCS[i - 1][j - 1] + 1;
				} else {
					LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
				}
	        }
	    }
	    return LCS[m.length][n.length];
	}
	
	public static void main(String[] args) {
		String m = "ACBDEA";
		String n = "ABCDA";
	    System.out.println("LCS :" + find(m.toCharArray(), n.toCharArray()));
	}
}