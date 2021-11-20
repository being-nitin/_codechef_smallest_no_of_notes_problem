package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*

         */
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        int[] arr = {100, 50, 10, 5, 2, 1};
        for (int i=0;i<t;i++) {
            n = sc.nextInt();
            System.out.println(smallestNoNotes(n, arr));
        }
    }
    static int smallestNoNotes(int n1,int[] arr){
        int ans=0;
        while(n1!=0){
            for(int i=0;i<arr.length;i++){
                ans = (n1/arr[i]);
                n1= n1- (arr[i]*(n1/arr[i]));
            }
            return ans;
        }
        return 0;
    }
}
