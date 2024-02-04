package BinarySearch;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static int binarySearch(int []arr, int target){
        int s = 0;
        int e = arr.length-1;
        // check whether array is increasing or decreasing order sorted
        boolean isAsc = arr[s] < arr[e];
        while(s <= e){
            // check for middle element
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            // for increasing order sorted Array
            if(isAsc){
                if(arr[mid] < target){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }

            // for decreasing order sorted Array
            else{
                if(arr[mid] < target){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
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
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println("Target is found at index : " + ans);
    }
}
