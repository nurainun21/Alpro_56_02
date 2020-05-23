import java.util.Scanner;

public class xyDanz {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 
        int x;
		int y;
		int z;
        System.out.print("masukkan x = ");
        x = a.nextInt();
        System.out.print("masukkan y = ");
        y = a.nextInt();
        System.out.print("masukkan z = ");
        z = a.nextInt(); 
        if ((x > y) && (x > z)) {
            System.out.println("nilai tertinggi : x");
        } else if((y > x) && (y > z)) {
            System.out.println("nilai tertinggi : y");
        }  else if ((z > x) && (z > y)) {
            System.out.println("nilai tertinggi : z");
        } else {
            System.out.println("Tidak ada nilai tertinggi antara x, y, dan z");
        }
	}
}