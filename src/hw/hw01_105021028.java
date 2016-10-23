package hw;
import java.util.*;
public class hw01_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int data[] = new int[n];
		data[0]=1;data[1]=1;
		for(int v =2;v<n;v++){
			data[v]=data[v-1]+data[v-2];
		}for(int a=0;a<n;a++){
		System.out.print(data[a]+" ");
		}
	}
	}
