package BinarySearch;
import java.util.Scanner;

public class SmallestLetter {
    public static char smallestLetter(char []arr, char target){
        int s = 0;
        int e = arr.length-1;
        while (s <= e ) {
            int mid = s+(e-s)/2;
            if(arr[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return arr[s%arr.length]; // because letters wraps Around
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.print("Enter Target: ");
        char target = sc.next().charAt(0);
        char ans = smallestLetter(arr, target);
        System.out.println("Smallest Letter Greater than target is: " + ans);

    }
}
