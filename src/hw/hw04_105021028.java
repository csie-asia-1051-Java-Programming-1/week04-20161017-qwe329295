package hw;

import java.util.*;

public class hw04_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		switch (n) {
		case 1:
			int h = scn.nextInt();
			int e = (h + 1) / 2;
			int f = 0;
			for (int a = 1; a <= h; a++) {
				for (int d = 1; d <= e; d++) {
					System.out.print("*");
				}
				System.out.println();
				if (f == 0 && e >= 1) {
					e--;
				}
				if (f == 1 && e <= (h + 1) / 2) {
					e++;
				}
				if (e == 1) {
					f = 1;
					System.out.println("我把F改成1了");
				}
			}
			break;
		case 2:
			int q = scn.nextInt();
			int r = (q + 1) / 2;
			int t = 1;
			int flat=0;
			for(int a= 1;a<=q;a++){
				for (int b =1;b<=t;b++){
					System.out.print("*");
				}
				if(t<r && flat==0){
					t++;
				}
				if(t>1 && flat==1){
					t--;
				}if(t==r){
					flat=1;
				}
				System.out.println();
			}
			break;
		}
	}
}
