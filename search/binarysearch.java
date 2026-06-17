import java.util.Scanner;
//o(log n) time complexity
public class binarysearch {
    static int binarySearch_array(int arr[], int key){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==key){
                return mid;
            } else if(arr[mid]<key){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int result = binarySearch_array(arr, key);
        if(result==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
