import java.io.*;
import java.util.*;

public class Solution {
    public static void matrixMul(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr1[0].length;
        int k = arr2.length;
        int l = arr2[0].length;
        
        if (m != k) {
            System.out.println("Cannot multiply matrices, dimensions mismatch");
            return;
        }

        int[][] resarr = new int[n][l];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                for (int p = 0; p < m; p++) {
                    resarr[i][j] += arr1[i][p] * arr2[p][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(resarr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {2, 3, 4}, {1, 1, 1}};
        int[][] arr2 = {{4, 5, 6}, {7, 8, 9}, {4, 5, 7}};

        Solution obj = new Solution();
        obj.matrixMul(arr1, arr2);
    }
}
