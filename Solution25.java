import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int a=a1-a2;
        int b=b1-b2;
        int c=c1-c2;
        if(a>b && a>c)
        System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
            
        
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}