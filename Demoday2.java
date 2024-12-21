package Demoday;

public class Demoday2 {

	public static void main(String[] args) {
        int n=8917,rem,nn=0;
        //8
        int d=1000;
        while(1==1) {
        	rem=n/d;
        	n=n%d;
        	d=d/10;
        	System.out.println(rem);
        	if(n==0)break;
        }
	}

} 