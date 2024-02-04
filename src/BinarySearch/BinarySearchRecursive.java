package BinarySearch;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int []arr, int target, int s, int e){
        // base case if element not found
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] < target){
            return binarySearch(arr, target, mid+1, e);
        }
        return binarySearch(arr, target, s, mid-1);
    }
    public static int binarySearch(int []arr, int target){
        return binarySearch(arr, target, 0, arr.length-1);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println("Target is found at: " + ans);
    }
}
