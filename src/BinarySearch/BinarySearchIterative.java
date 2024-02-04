package BinarySearch;
import java.util.*;

public class BinarySearchIterative {
    public static int binarySearch(int []arr, int target){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e-s)/2; //because it might be possible that (start + end) exceeds the range of integer
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter" + n + " Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int ele = sc.nextInt();
        int ans = binarySearch(arr, ele);
        System.out.println("Target is found at index:  " + ans);
    }
}
