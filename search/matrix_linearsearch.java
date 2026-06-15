import java.util.Scanner;
public class matrix_linearsearch {
    
    static int matrix_linearSearch(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int key = sc.nextInt();

        int result = matrix_linearSearch(matrix, key);
        if(result==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found: " );
        }
    }
}
