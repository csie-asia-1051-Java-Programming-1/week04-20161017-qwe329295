package hw;
import java.util.*;
public class hw02_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
        int x =1 ,y=1,z=1;
        for(int a=n;a>=1;a--){
        	x=x*a;
        }
        for(int a=m;a>=1;a--){
        	y=y*a;
        }
        for(int a=n-m;a>=1;a--){
        	z=z*a;
        }
 		System.out.println(x/(y*z));
	}

}
