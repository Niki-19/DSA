//tower of hanoi

import java.util.Scanner;

public class Main
{
    static int step=0;
    static void toh(int n, char s, char aux, char d){
        if(n==1){
            System.out.println("Move disk 1 from "+s+" to "+d);
            step++;
            return;
        }
        toh(n-1, s, d, aux);
        System.out.println("Move disk "+n+" from "+s+" to "+d);
        step++;
        toh(n-1, aux, s, d);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    toh(n,'A','B','C');
	    System.out.println("Steps = "+step);
	}
}
