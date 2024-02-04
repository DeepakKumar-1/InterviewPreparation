package BinarySearch;
import java.util.*;

public class InfiniteSortedArray {
    public static int binarySearch(int []arr, int target){
        // first find the range
        // First start with box of size 2
        int s = 0;
        int e = 1;
        // condition for the target lies in the range
        while(target > arr[e]){
            int boxSize = (e-s+1);
            s = e+1;
            e = e + (boxSize*2);
        }
        // Now Apply Normal Binary Search
        while(s<=e){
            int mid = s+(e-s)/2;
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
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int target = sc.nextInt();
        int res = binarySearch(arr, target);
        System.out.println("Target lies at Index : " + res);

    }
}
