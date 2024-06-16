import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
            int aa=Math.abs(a-10);
            int bb=Math.abs(b-10);
          if(aa-bb==0)         
        System.out.println("0");
            else
         System.out.println((aa<bb)?a:b);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}