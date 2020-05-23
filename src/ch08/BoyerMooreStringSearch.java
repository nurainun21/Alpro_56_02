import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BoyerMooreStringSearch {
    public void findPattern(String a, String b) {
        char[] text = a.toCharArray();
        char[] pattern = b.toCharArray();
        int pos = indexOf(text, pattern);
        if (pos == -1) {
            System.out.println("\nNo Match\n");
        } else {
            System.out.println("Pattern found at position : "+ pos);
		}
    }
	
    public int indexOf(char[] text, char[] pattern) {
        if (pattern.length == 0) {
            return 0;
		}
        int charTable[] = findCharTable(pattern);
        int offsetTable[] = findOffsetTable(pattern);
        for (int i = pattern.length - 1, j; i < text.length;) {
			for (j = pattern.length - 1; pattern[j] == text[i]; i--, j--) {
                if (j == 0) {
                    return i;
				}
			}
            i += Math.max(offsetTable[pattern.length - 1 - j], charTable[text[i]]);
		}
        return -1;
    }
	
    private int[] findCharTable(char[] pattern) {
        final int Alphabet_Size = 256;
        int[] table = new int[Alphabet_Size];
        for (int i = 0; i < table.length; i++)
            table[i] = pattern.length;
        for (int i = 0; i < pattern.length - 1; i++)
            table[pattern[i]] = pattern.length - 1 - i;
        return table;
    }
	
    private static int[] findOffsetTable(char[] pattern) {
        int[] table = new int[pattern.length];
        int lastPrefixPosition = pattern.length;
        for (int i = pattern.length - 1; i >= 0; i--) {
            if (isPrefix(pattern, i + 1))
                lastPrefixPosition = i + 1;
            table[pattern.length - 1 - i] = lastPrefixPosition - i + pattern.length - 1;
		}
        for (int i = 0; i < pattern.length - 1; i++) {
            int slen = suffixLength(pattern, i);
            table[slen] = pattern.length - 1 - i + slen;
		}
        return table;
    }
	
    private static boolean isPrefix(char[] pattern, int a) {
        for (int i = a, j = 0; i < pattern.length; i++, j++) 
            if (pattern[i] != pattern[j]) {
                return false;
			}
        return true;
    }
	
    private static int suffixLength(char[] pattern, int a) {
        int len = 0;
        for (int i = a, j = pattern.length - 1; i >= 0 && pattern[i] == pattern[j]; i--, j--) {
            len += 1;
		}
        return len;
    }
	
    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Boyer Moore String Search Algorithm Test\n");
        System.out.println("\nEnter Text\n");
        String text = x.readLine();
        System.out.println("\nEnter Pattern\n");
        String pattern = x.readLine();
        BoyerMooreString y = new BoyerMooreString();
        y.findPattern(text, pattern);
    }
	
}