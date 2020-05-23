import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class KnuthMorrisPratt {
    private final int[] failure;
    public KnuthMorrisPratt(String text, String pat) {
        failure = new int[pat.length()];
        fail(pat);
        int pos = posMatch(text, pat);
        if (pos == -1)
            System.out.println("\nNo match found");
        else
            System.out.println("\nMatch found at index "+ pos);
    }
    
    private void fail(String pat) {
        int p = pat.length();
        failure[0] = -1;
        for (int j = 1; j < p; j++) {
            int i = failure[j - 1];
            while ((pat.charAt(j) != pat.charAt(i + 1)) && i >= 0)
                i = failure[i];
            if (pat.charAt(j) == pat.charAt(i + 1)) {
                failure[j] = i + 1;
            } else {
                failure[j] = -1;
			}
        }
    }

    private int posMatch(String text, String pat) {
        int i = 0, j = 0;
        int lenA = text.length();
        int lenI = pat.length();
        while (i < lenA && j < lenI) {
            if (text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            } else if (j == 0)  {
                i++;
            } else {
                j = failure[j - 1] + 1;
			}
        }
        return ((j == lenI) ? (i - lenI) : -1);
    }
    
	public static void main(String[] args) throws IOException {    
        BufferedReader X = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Knuth Morris Pratt Test\n");
        System.out.println("\nEnter Text\n");
        String text = X.readLine();
        System.out.println("\nEnter Pattern\n");
        String pattern = X.readLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);        
    }
}