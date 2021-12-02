package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*
        Consider a currency system in which there are notes of six denominations,
        namely, Rs. 1, Rs. 2, Rs. 5, Rs. 10, Rs. 50, Rs. 100.
        If the sum of Rs. N is input, write a program to computer smallest number of notes
        that will combine to give Rs. N.

        Input
        The first line contains an integer T, total number of testcases. Then follow T lines,
        each line contains an integer N.

        Output
        For each test case, display the smallest number of notes that will combine to give N,
        in a new line.

        Constraints
        1 ≤ T ≤ 1000
        1 ≤ N ≤ 1000000
        Example
        Input
        3
        1200
        500
        242

        Output
        12
        5
        7
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
// this will give the smallest no of notes required: