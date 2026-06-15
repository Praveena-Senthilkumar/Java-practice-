import java.util.*;
public class symbol_flip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the k value");
        int k=sc.nextInt();
        while(k>0){
            Arrays.sort(arr);
            arr[0]=arr[0]*(-1);
            k--;

        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}