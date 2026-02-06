package assessment;
import java.util.*;
public class flipMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        // Input matrix
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = sc.nextInt();
            }
        }

        char ch = sc.next().charAt(0);

        // Horizontal Flip
        if(ch == 'H'){
            for(int i = r - 1; i >= 0; i--){
                for(int j = 0; j < c; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }

        // Vertical Flip
        else if(ch == 'V'){
            for(int i = 0; i < r; i++){
                for(int j = c - 1; j >= 0; j--){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
}}
