import java.util.Scanner;

public class xDany {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 
        int x;
		int y;
        System.out.print("masukkan x = ");
        x = a.nextInt();
        System.out.print("masukkan y = ");
        y = a.nextInt();
        if ( x > y ) {
            System.out.println("nilai tertinggi : x");
        } else if ( x < y ) {
            System.out.println("nilai tertinggi : y");
        } else {
			System.out.println("Tidak ada nilai tertinggi antara x dan y");
        }
	}
}	