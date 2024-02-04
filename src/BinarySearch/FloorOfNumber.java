package BinarySearch;
import java.util.Scanner;

public class FloorOfNumber {
    public static int floor(int []arr, int target){
        int s = 0;
        int e = arr.length-1;
        // Base Condition if Floor Doesn't Exist
        if(target < arr[s]){
            return -1;
        }

        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if(arr[mid] < target){
                s = mid+1;
            } else{
                e = mid-1;
            }
        }
        return arr[e];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target Element: ");
        int target = sc.nextInt();
        int ans = floor(arr, target);
        System.out.println("Floor of " + target + " is: " + ans);
    }
}
