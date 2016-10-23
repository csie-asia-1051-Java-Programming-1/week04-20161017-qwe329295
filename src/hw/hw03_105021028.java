package hw;
import java.util.*;
public class hw03_105021028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn = new Scanner(System.in);	
    int x = 0 , y = 0,z = 0;
    long n =0;
    char w ='y';
    while(w =='y'){
    	n=0;
    while(n!=999){
    	System.out.println("請輸入一個數");
    	 			 n =scn.nextLong();
    	 			if(n>0){
    	 				x++;
    	 			}
    	 			else{
    	 			if(n<0){
    	 				y++;
    	 			}
    	 			else{
    	 			    z++;
    	 			}
    	 			}
    }System.out.println("是否繼續y/n");
    w = scn.next().charAt(0);
    x--;
    }
    System.out.println("正數"+ x +"個"+"負數"+ y + "個"+"零"+ z +"個");
	}

}
