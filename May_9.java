package may;

import java.sql.Array;
import java.util.ArrayList;

public class May_9 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;;
        int n= matrix[0].length;

        ArrayList<Integer> a =new ArrayList()  ;
        int top = 0,down = m-1,left = 0,right = n-1;
        int dir = 0;
        while (top<=down && left<=right){
            if(dir==0){
                for (int i=left;i<=right;i++){
                    a.add(matrix[top][i]);
                }
                top += 1;
            } else if (dir==1) {
                for (int i=top;i<=down;i++){
                    a.add(matrix[i][right]);
                }
                right -=1;
            } else if (dir==2) {
                for (int i=right;i>=left;i--){
                    a.add(matrix[down][i]);
                }
                down-=1;
            }else if (dir==3){
                for (int i=down;i>=top;i--){
                    a.add(matrix[i][left]);
                }
                left+=1;
            }
            dir = (dir+1)%4;
        }
        return a;
    }

}
