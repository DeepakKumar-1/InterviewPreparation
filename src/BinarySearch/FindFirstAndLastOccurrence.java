package BinarySearch;
import java.util.*;

public class FindFirstAndLastOccurrence {
    public static int binarySearch(int []arr, int target, boolean findFirstOccurrence){
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target){
                // one of the potential ans found
                ans = mid;
                // if We r finding first Occurrence
                // then there might be more ans lies on left side
                if(findFirstOccurrence) {
                    e = mid - 1;
                }else{
                    // for last Occurrence
                    s = mid+1;
                }
            }
            else if(arr[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static int[] searchRange(int []arr, int target){
        int []res = new int[2];
        int firstOcc = binarySearch(arr, target, true);
        int lastOcc = binarySearch(arr, target, false);
        res[0] = firstOcc;
        res[1] = lastOcc;
        return res;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int []res = searchRange(arr, target);
        System.out.println("Result : " + Arrays.toString(res));

    }
}
