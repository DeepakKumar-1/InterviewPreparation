package BinarySearch;

import java.util.Scanner;

public class FindInMountainArray {
    public static int orderAgnosticBS(int []arr, int s, int e, int target){
        // check if Ascending order sorted or Descending Order Sorted
        boolean isAsc = arr[s] < arr[e];
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }
        }
        return -1;
    }
    public static int findPeakIndexInMountainArray(int []arr){
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int mid = s+(e-s)/2;
            if(arr[mid] > arr[mid+1]){
                // You r in descending part of Array
                // then mid might be a possible ans and find in left part
                e = mid;
            }
            else if(arr[mid] < arr[mid+1]){
                // You r in increasing part of Array
                // find in right part
                s = mid+1;
            }
        }
        return arr[s];
    }
    public static int findInMountainArray(int []arr, int target){
        int peakElementIndex = findPeakIndexInMountainArray(arr);
        // Apply Binary Search
        int res = orderAgnosticBS(arr, 0, peakElementIndex, target);
        if(res != -1){
            return res;
        }
        return orderAgnosticBS(arr, peakElementIndex+1, arr.length-1, target);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // Take Target element from the user
        int target = sc.nextInt();
        int res = findInMountainArray(arr, target);
        System.out.println(res);
    }
}
