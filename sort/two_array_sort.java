package sort;
import java.util.*;
public class two_array_sort {
    static void twoArraySort(int arr1[], int arr2[], int result[]){
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
              result[k]=arr1[i];
              k++;
              i++;
            }
            else{
                result[k]=arr2[j];
                k++;
                j++;
            }
        }
        
        while(i<arr1.length){
            result[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            result[k]=arr2[j];
            k++;
            j++;
        }

}

    public static void main(String[] args) {
        int arr1[] = {1,3,5};
        int arr2[] = {10,20,50,70,40,60};
        int result[] = new int[arr1.length + arr2.length];

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        twoArraySort(arr1, arr2, result);

        System.out.println("Merged and sorted array: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
