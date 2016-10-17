package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021028蕭佑誠
 */
import java.util.*;
public class ex02_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int n = 0, m = 0, t = 0;
		char a ='Y';
		while(a=='Y'){
			n = scn.nextInt();
			m = scn.nextInt();
			t=n*m;
			System.out.println(t);
			System.out.println("Y/N");
			a =scn.next().charAt(0);
		}System.out.println("end");

	}

}
