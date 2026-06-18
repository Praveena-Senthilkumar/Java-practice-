package sort;

public class single_array_sort {
    static void singleArraySort(int arr[], int result[]){
        int i=0;
        int mid;
        if(arr.length%2==0){
            mid=arr.length/2;
        }
        else{
            mid=(arr.length/2)+1;
        }
        int j=mid;
        int k=0;

        while(i<mid && j<arr.length){
            if(arr[i]<arr[j]){
              result[k]=arr[i];
              k++;
              i++;
            }
            else{
                result[k]=arr[j];
                k++;
                j++;
            }
        }
        
        while(i<mid){
            result[k]=arr[i];
            k++;
            i++;
        }
        while(j<arr.length){
            result[k]=arr[j];
            k++;
            j++;
        }

}


    public static void main(String[] args) {
        int arr[] = {1,3,5,2,4};
        int[] result=new int[arr.length];
        singleArraySort(arr, result);
        System.out.println("Sorted array: ");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
