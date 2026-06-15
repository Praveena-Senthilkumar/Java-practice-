import java.util.Scanner;
public class move_zeroes{
    public static void main(String[] args) {
        int index = 0;
        Scanner sc = new Scanner(System.in);

        int nums[]= new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}