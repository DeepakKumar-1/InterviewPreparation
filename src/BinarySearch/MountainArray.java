package BinarySearch;

import java.util.Scanner;

public class MountainArray {
    public static int peekEleInMountainArray(int []arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]){
                // you r in decreasing part of Array
                e = mid;
            }
            else if(arr[mid] < arr[mid+1]){
                // you r in increasing part of Array
                s = mid+1;
            }
        }
        return arr[s];
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = peekEleInMountainArray(arr);
        System.out.println("Result : " + res);

    }
}
