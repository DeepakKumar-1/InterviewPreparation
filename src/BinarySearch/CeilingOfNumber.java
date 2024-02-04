package BinarySearch;
import java.util.Scanner;

public class CeilingOfNumber {
    public static int ceiling(int []arr, int target){
        int s = 0;
        int e = arr.length - 1;

        // base condition : if ceiling doesn't exist
        if(target > arr[e]){
            return -1;
        }
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return arr[s];
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target  Element: ");
        int target = sc.nextInt();
        int ans = ceiling(arr, target);
        System.out.println("Ceiling of Element " + target + " is: " + ans);

    }
}
