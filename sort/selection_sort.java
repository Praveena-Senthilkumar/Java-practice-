package sort;
import java.util.Scanner;

//o(n^2) time complexity
public class selection_sort {
    static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }       
     }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
