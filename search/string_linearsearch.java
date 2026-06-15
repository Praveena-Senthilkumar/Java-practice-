 import java.util.Scanner;
public class string_linearsearch {
    
     static int linearSearch_string(String s, char key_string){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==key_string){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String s = sc.nextLine();
        char key_string = sc.next().charAt(0);

        int result_string = linearSearch_string(s, key_string);
        if(result_string==-1){
            System.out.println("Character not found");
        } else {
            System.out.println("Character found at index: " + result_string);
        }
    }
}